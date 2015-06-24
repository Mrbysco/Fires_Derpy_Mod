package firedingo.mod.fdm.blocks;

import firedingo.mod.fdm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import java.sql.Ref;

/**
 * Created by Firedingo on 24/06/2015.
 */
public class BlockDerpyFurnace extends BlockFDM {
    private IIcon[] icons = new IIcon[6];
    private String name = "derpyfurnace";
    private String side = "";

    public BlockDerpyFurnace() {
        super(Material.rock);
        this.setBlockName(Reference.MOD_ID + ":" + name);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        for(int i=0; i < 7; i++) {
            if (i == 0) {
                side = "_top";
            }
            else if (i == 1) {
                side = "_top";
            }
            else if (i == 2) {

                side = "_front_off";
            }
            else if (i == 3) {
                side = "_side";
            }
            else if (i == 4) {
               // side = "_front_on";
                side = "_side";
            }
            else if (i == 5) {
                side = "_side";
            }
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + name + side);
        }
    }
    @Override
    public IIcon getIcon(int side, int meta) {
        return icons[side];
    }

}
