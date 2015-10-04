package net.zanges.factorycontraptions.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Ore Block with similar behaviour to Redstone
 */
public class BlockFactoryOreSpecial extends BlockFactoryOre {

    int quantityRange;
    Item drop;

    /**
     * @param mat        - Material for super {@link BlockFactoryContraptions}
     * @param resistance - the Ores resistance
     * @param hardness   - the Ores hardness
     * @param level      - the needed mininglevel of the Pickaxe
     * @param drop       - the Item dropped by the Ore {@param null the Ore drops normal}
     * @param quantityRange - the maximum quantity + 1 dropped by the Ore
     */
    public BlockFactoryOreSpecial(Material mat, float resistance, float hardness, int level, int quantityRange, Item drop) {
        super(mat, resistance, hardness, level);
        this.quantityRange = quantityRange;
        this.drop = drop;
    }

    @Override
    public Item getItemDropped(int i0, Random r, int i1)
    {
        if(drop != null)
            return drop;

        return Item.getItemFromBlock(this);
    }

    @Override
    public int quantityDropped(Random r)
    {
        return r.nextInt(quantityRange) + 1;
    }

}
