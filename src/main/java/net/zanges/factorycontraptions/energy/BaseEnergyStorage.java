package net.zanges.factorycontraptions.energy;

import cofh.api.energy.IEnergyStorage;
import net.minecraft.nbt.NBTTagCompound;

/**
 * BaseEnergyStorage create an Instance of this Object in your IEnergyHandler TileEntity and use its Methods
 * most likely the ones grouped in IEnergyStorage
 */
public class BaseEnergyStorage implements IEnergyStorage {

    int capacity;
    int energy;
    int transferIn;
    int transferOut;

    public BaseEnergyStorage(int capacity, int transferRate)
    {
        this.capacity = capacity;
        this.transferIn = transferRate;
        this.transferOut = transferRate;
    }

    public BaseEnergyStorage(int capacity, int transferIn, int transferOut)
    {
        this.capacity = capacity;
        this.transferIn = transferIn;
        this.transferOut = transferOut;
    }

    public void writeToNBT(NBTTagCompound nbt)
    {
        nbt.setInteger("energy", energy);
    }

    public void readFromNBT(NBTTagCompound nbt)
    {
        nbt.getInteger("energy");
    }

    /*
    Getters and Setters
     */

    /**
     * Save usage for adding Energy to the Storage
     * @param energy - the Energy to add
     */
    public void addEnergy(int energy)
    {
        this.energy = energy + energy;
        if(this.energy > capacity)
        {
            this.energy = capacity;
        }
    }

    /**
     * Save usage for removing energy from the Storage
     * @param energy - the Energy to remove
     */
    public void removeEnergy(int energy)
    {
        this.energy = this.energy - energy;
        if(this.energy < 0)
        {
            this.energy = 0;
        }
    }

    /**
     * Not save in as there is no check
     * @param energy - new EnergyStored
     */
    public void setEnergy(int energy)
    {
        this.energy = energy;
    }

    public int getEnergy()
    {
        return energy;
    }
    /*
    IEnergyStorage
     */
    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        int receive = Math.min(Math.min(maxReceive, transferIn), capacity - energy);

        if(!simulate)
        {
            energy = energy + receive;
        }

        return receive;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        int extract = Math.min(Math.min(maxExtract, transferOut), energy);

        if(!simulate)
        {
            energy = energy - extract;
        }

        return extract;
    }

    @Override
    public int getEnergyStored() {
        return energy;
    }

    @Override
    public int getMaxEnergyStored() {
        return capacity;
    }
}
