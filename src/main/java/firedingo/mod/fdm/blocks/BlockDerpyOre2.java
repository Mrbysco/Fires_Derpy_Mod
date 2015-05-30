package firedingo.mod.fdm.blocks;

import firedingo.mod.fdm.items.ItemDerpyIngot2;
import firedingo.mod.fdm.items.ItemFDM;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockDerpyOre2 extends BlockFDM {
    public BlockDerpyOre2() {
        super(Material.rock);
        this.setBlockName(Reference.MOD_ID + ":" + "DerpyOre2");
        this.setBlockTextureName("fdm:derpyore2");
        this.setHarvestLevel("pickaxe", 2);
    }
    //If the block's drop is an item.
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
