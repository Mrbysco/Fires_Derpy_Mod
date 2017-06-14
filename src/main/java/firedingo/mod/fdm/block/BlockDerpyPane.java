package firedingo.mod.fdm.block;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import firedingo.mod.fdm.reference.Reference;
import firedingo.mod.fdm.reference.RegistryReference;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockPane;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockDerpyPane extends BlockPane {
    public BlockDerpyPane() {
        super(Material.GLASS, true);
        setUnlocalizedName(RegistryReference.ModBlocks.DERPYPANE.getUnlocalisedName());
        setRegistryName(RegistryReference.ModBlocks.DERPYPANE.getRegistryName());
        this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);
       // this.setCreativeTab(CreativeTabs.tabAllSearch);


    }
    //@Override
    public static boolean canRenderInPass(){
        return true;
    }

}
