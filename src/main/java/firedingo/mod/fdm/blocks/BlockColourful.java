package firedingo.mod.fdm.blocks;


import firedingo.mod.fdm.FiresDerpyMod;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockColourful extends BlockFDM {
    public BlockColourful() {
        super(Material.rock);
        this.setBlockTextureName("fdm:colourblock");
        this.setBlockName(Reference.MOD_ID + ":" + "ColourBlock");
        this.setHarvestLevel("shears", 0);
    }
   // @Override
    public Item getItemDropped() {
    //    return Item.getItemFromBlock(FiresDerpyMod.Block);
        return null;
    }
}
