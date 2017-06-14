package firedingo.mod.fdm.block;

import java.util.Random;

import firedingo.mod.fdm.reference.RegistryReference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockDerpyOre2 extends BlockFDM {
    public BlockDerpyOre2() {
        super(Material.ROCK);
        setUnlocalizedName(RegistryReference.ModBlocks.DERPYORE2.getUnlocalisedName());
        setRegistryName(RegistryReference.ModBlocks.DERPYORE2.getRegistryName());
        this.setHarvestLevel("pickaxe", 2);
    }
    //If the block's drop is an item.
    @Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
   
}
