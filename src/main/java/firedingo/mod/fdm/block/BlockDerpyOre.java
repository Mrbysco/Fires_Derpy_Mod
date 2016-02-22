package firedingo.mod.fdm.block;

import firedingo.mod.fdm.item.ModItems;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockDerpyOre extends BlockFDM {
    public BlockDerpyOre() {
        super(Material.iron);
        this.setBlockName(Reference.MOD_ID + ":" + "DerpyOre");
        this.setBlockTextureName("fdm:derpyore");
        this.setHarvestLevel("pickaxe",2);
    }
    //If the block's drop is an item.

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return ModItems.ItemDingot;
    }
    @Override
    public int quantityDropped(Random rand) {
        return 3;
    }


}
