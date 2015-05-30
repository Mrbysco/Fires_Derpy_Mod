package firedingo.mod.fdm.items;

import firedingo.mod.fdm.reference.Reference;

/**
 * Created by firedingo on 15/05/2015.
 */
public class ItemDerpyIngot extends ItemFDM {
    public ItemDerpyIngot() {
        super();
        this.setUnlocalizedName(Reference.MOD_ID + ":" + "DerpyIngot");
        this.setMaxStackSize(64);
        this.setTextureName("fdm:derpyingot");
    }

}
