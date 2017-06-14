package firedingo.mod.fdm.item;

import firedingo.mod.fdm.reference.RegistryReference;

/**
 * Created by firedingo on 15/05/2015.
 */
public class ItemDerpyIngot extends ItemFDM {
    public ItemDerpyIngot() {
        super();
        setUnlocalizedName(RegistryReference.ModItems.DERPYINGOT.getUnlocalisedName());
        setRegistryName(RegistryReference.ModItems.DERPYINGOT.getRegistryName());
        this.setMaxStackSize(64);
    }

}
