package firedingo.mod.fdm.items;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by firedingo on 14/05/2015.
 */
public class ItemFDM extends Item {
    public ItemFDM()
    {
        super();
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);
    }
}
