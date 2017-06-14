package firedingo.mod.fdm.block;

import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by firedingo on 14/05/2015.
 */
public abstract class BlockFDM extends Block {
    //Common Generic Mod Block. Holds all the common info like creative tabs. All Blocks extend from this.
    public BlockFDM(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabs.SEARCH);
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);
    }


}
