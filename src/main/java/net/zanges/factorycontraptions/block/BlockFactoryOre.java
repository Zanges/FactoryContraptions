package net.zanges.factorycontraptions.block;

import net.minecraft.block.material.Material;

/**
 * Basic Ore Block for standard OreGeneration
 */
public class BlockFactoryOre extends BlockFactoryContraptions {

    /**
     * @param resistance - the Ores resistance
     * @param hardness - the Ores hardness
     * @param level - the needed mininglevel of the Pickaxe
     */
    public BlockFactoryOre(float resistance, float hardness, int level)
    {
        super(Material.rock);
        this.setResistance(resistance);
        this.setHardness(hardness);
        this.setHarvestLevel("pickaxe", level);
    }

}
