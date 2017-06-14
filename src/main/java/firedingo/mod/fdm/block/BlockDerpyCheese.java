package firedingo.mod.fdm.block;

import java.util.Random;

import firedingo.mod.fdm.item.ModItems;
import firedingo.mod.fdm.reference.RegistryReference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

/**
 * Created by firedingo on 21/05/15.
 */
public class BlockDerpyCheese extends BlockFDM {
    BlockDerpyCheese() {
        super(Material.CAKE);
        setUnlocalizedName(RegistryReference.ModBlocks.DERPYCHEESE.getUnlocalisedName());
        setRegistryName(RegistryReference.ModBlocks.DERPYCHEESE.getRegistryName());
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.ItemCheeseI;
    }
    
    @Override
    public int quantityDropped(Random rand) {
        return 1;
    }
}
