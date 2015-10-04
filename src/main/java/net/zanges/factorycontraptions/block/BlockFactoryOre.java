package net.zanges.factorycontraptions.block;

import net.minecraft.block.material.Material;

/**
 * Basic Ore Block for standard OreGeneration
 */
public class BlockFactoryOre extends BlockFactoryContraptions {

    /**
     *
     * @param mat - Material for super {@link BlockFactoryContraptions}
     * @param resistance - the Ores resistance
     * @param hardness - the Ores hardness
     * @param level - the needed mininglevel of the Pickaxe
     */
    public BlockFactoryOre(Material mat, float resistance, float hardness, int level)
    {
        super(mat);
        this.setResistance(resistance);
        this.setHardness(hardness);
        this.setHarvestLevel("pickaxe", level);
    }

}
