package firedingo.mod.fdm.block;


import firedingo.mod.fdm.reference.RegistryReference;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockColourful extends BlockFDM {
    public BlockColourful() {
        super(Material.ROCK);
        setUnlocalizedName(RegistryReference.ModBlocks.COLOURBLOCK.getUnlocalisedName());
        setRegistryName(RegistryReference.ModBlocks.COLOURBLOCK.getRegistryName());
        this.setHarvestLevel("shears", 0);
    }
   // @Override
    public Item getItemDropped() {
    //    return Item.getItemFromBlock(FiresDerpyMod.Block);
        return null;
    }
}
