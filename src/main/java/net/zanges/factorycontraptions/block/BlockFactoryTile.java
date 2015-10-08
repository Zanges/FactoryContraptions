package net.zanges.factorycontraptions.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * This Block represents a standard ITileEntityProvider for the Block
 * extend this to use TileEntities with your Block
 */
public class BlockFactoryTile extends BlockFactoryContraptions implements ITileEntityProvider {

    public BlockFactoryTile(Material material)
    {
        super(material);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return null;
    }
}
