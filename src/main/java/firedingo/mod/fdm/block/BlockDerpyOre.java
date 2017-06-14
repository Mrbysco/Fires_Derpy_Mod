package firedingo.mod.fdm.block;

import firedingo.mod.fdm.item.ModItems;
import firedingo.mod.fdm.reference.Reference;
import firedingo.mod.fdm.reference.RegistryReference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockDerpyOre extends BlockFDM {
    public BlockDerpyOre() {
        super(Material.IRON);
        setUnlocalizedName(RegistryReference.ModBlocks.DERPYORE.getUnlocalisedName());
        setRegistryName(RegistryReference.ModBlocks.DERPYORE.getRegistryName());
        this.setHarvestLevel("pickaxe",2);
    }
    //If the block's drop is an item.

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    	// TODO Auto-generated method stub
    	return ModItems.ItemDingot;
    }

    @Override
    public int quantityDropped(Random rand) {
        return 3;
    }


}
