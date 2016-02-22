package firedingo.mod.fdm.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

/**
 * Created by Firedingo on 28/10/2015.
 */
public class BlockNotchApple extends BlockFDM {
    public BlockNotchApple() {
        super(Material.cake);
        this.setBlockTextureName("fdm:block_notch_apple");
        this.setBlockName(Reference.MOD_ID + ":" + "BlockNotchApple");
       // this.getRarity(ModBlocks.BlockNotchApple);
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.epic;
    }

    public boolean hasEffect(ItemStack par1ItemStack){
        return true;
    }
}
