package firedingo.mod.fdm.blocks;

import firedingo.mod.fdm.items.ModItems;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by firedingo on 21/05/15.
 */
public class BlockDerpyCheese extends BlockFDM {
    BlockDerpyCheese() {
        super(Material.cake);
        this.setBlockTextureName("fdm:derpycheese");
        this.setBlockName(Reference.MOD_ID + ":" + "DerpyCheeseB");
    }
    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return ModItems.ItemCheeseI;
    }
    @Override
    public int quantityDropped(Random rand) {
        return 1;
    }
}
