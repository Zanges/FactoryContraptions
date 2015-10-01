package net.zanges.factorycontraptions.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.zanges.factorycontraptions.reference.Reference;

public class CreativeTabFactoryContraptions
{
    public static final CreativeTabs IndustrialEnergisicsTab = new CreativeTabs(Reference.LOWERCASE_MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}
