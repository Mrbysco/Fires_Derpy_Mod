package firedingo.mod.fdm.item;

import firedingo.mod.fdm.reference.Reference;
import firedingo.mod.fdm.reference.RegistryReference;

/**
 * Created by firedingo on 15/05/2015.
 */
public class ItemDerpyIngot2 extends ItemFDM {
    public ItemDerpyIngot2() {
        super();
        setUnlocalizedName(RegistryReference.ModItems.DERPYINGOT2.getUnlocalisedName());
        setRegistryName(RegistryReference.ModItems.DERPYINGOT2.getRegistryName());
        this.setMaxStackSize(64);
    }
}
