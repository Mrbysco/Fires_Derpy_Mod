package firedingo.mod.fdm.item;

import firedingo.mod.fdm.reference.RegistryReference;

/**
 * Created by firedingo on 30/05/15.
 */
public class ItemUnchargedCrystal extends ItemFDM {
    public ItemUnchargedCrystal() {
        super();
        setUnlocalizedName(RegistryReference.ModItems.UNCHARGEDCRYSTAL.getUnlocalisedName());
        setRegistryName(RegistryReference.ModItems.UNCHARGEDCRYSTAL.getRegistryName());
    }
}
