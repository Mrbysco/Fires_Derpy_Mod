package firedingo.mod.fdm.block;

import firedingo.mod.fdm.reference.RegistryReference;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Firedingo on 28/10/2015.
 */
public class BlockNotchApple extends BlockFDM {
    public BlockNotchApple() {
        super(Material.CAKE);
        setUnlocalizedName(RegistryReference.ModBlocks.NOTCHAPPLE.getUnlocalisedName());
        setRegistryName(RegistryReference.ModBlocks.NOTCHAPPLE.getRegistryName());
       // this.getRarity(ModBlocks.BlockNotchApple);
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.EPIC;
    }

    public boolean hasEffect(ItemStack par1ItemStack){
        return true;
    }
}
