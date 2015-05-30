package firedingo.mod.fdm.creativetab;

import firedingo.mod.fdm.items.ModItems;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by firedingo on 15/05/2015.
 */
public class CreativeTabFDM {
    public static final CreativeTabs FDM_TAB = new CreativeTabs(Reference.MOD_ID)

    {
        @Override
        public Item getTabIconItem() {

            return ModItems.ItemLeaf;
        }
    };
}
