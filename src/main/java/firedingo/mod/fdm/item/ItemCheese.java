package firedingo.mod.fdm.item;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import firedingo.mod.fdm.reference.RegistryReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by firedingo on 22/05/15.
 */
public class ItemCheese extends ItemFood {
    public ItemCheese(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setCreativeTab(CreativeTabs.SEARCH);
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);
        setUnlocalizedName(RegistryReference.ModItems.CHEESE.getUnlocalisedName());
        setRegistryName(RegistryReference.ModItems.CHEESE.getRegistryName());
    }

}
