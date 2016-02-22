package firedingo.mod.fdm.item;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Firedingo on 6/06/2015.
 */
public class ItemDerpyPick extends ItemPickaxe {
    public ItemDerpyPick(ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);
        this.setUnlocalizedName(Reference.MOD_ID + ":" + "DerpyPick");
        this.setTextureName("fdm:DerpyPick");
    }
}