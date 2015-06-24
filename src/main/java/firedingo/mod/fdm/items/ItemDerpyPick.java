package firedingo.mod.fdm.items;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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