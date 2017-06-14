package firedingo.mod.fdm.item;

import firedingo.mod.fdm.reference.Reference;
import firedingo.mod.fdm.reference.RegistryReference;

/**
 * Created by firedingo on 14/05/2015.
 */
public class ItemLeaf extends ItemFDM {
    public ItemLeaf()
    {
        super();
        this.setUnlocalizedName(Reference.MOD_ID + ":" + "LeafItem");
        setUnlocalizedName(RegistryReference.ModItems.LEAF.getUnlocalisedName());
        setRegistryName(RegistryReference.ModItems.LEAF.getRegistryName());
    }
}
