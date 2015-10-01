package net.zanges.factorycontraptions.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.zanges.factorycontraptions.creativetab.CreativeTabFactoryContraptions;
import net.zanges.factorycontraptions.reference.Reference;

public class BlockFactoryContraptions extends Block
{
    public BlockFactoryContraptions(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabFactoryContraptions.IndustrialEnergisicsTab);
    }

    public BlockFactoryContraptions()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTabFactoryContraptions.IndustrialEnergisicsTab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
