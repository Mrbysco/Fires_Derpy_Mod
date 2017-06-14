package firedingo.mod.fdm.item;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by firedingo on 14/05/2015.
 */
public class ItemFDM extends Item {
    //Common Generic Mod Item. Holds all the common info like creative tabs. All Items extend from this.
    public ItemFDM()
    {
        super();
        this.setCreativeTab(CreativeTabs.SEARCH);
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);
    }
}
