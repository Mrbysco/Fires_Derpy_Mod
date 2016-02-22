package firedingo.mod.fdm.block;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockPane;

/**
 * Created by firedingo on 15/05/2015.
 */
public class BlockDerpyPane extends BlockPane {
    public BlockDerpyPane() {
        super("", "", Material.glass, true);
        this.setBlockName(Reference.MOD_ID + ":" + "DerpyPane");
        this.setBlockTextureName("fdm:derpypane");
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);
       // this.setCreativeTab(CreativeTabs.tabAllSearch);


    }
    //@Override
    public static boolean canRenderInPass(){
        return true;
    }

}
