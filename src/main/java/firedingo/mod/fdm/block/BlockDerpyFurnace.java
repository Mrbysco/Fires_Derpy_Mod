package firedingo.mod.fdm.block;

import firedingo.mod.fdm.FiresDerpyMod;
import firedingo.mod.fdm.creativetab.CreativeTabFDM;
import firedingo.mod.fdm.reference.Reference;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by Firedingo on 24/06/2015.
 */
public class BlockDerpyFurnace extends BlockContainer implements ITileEntityProvider {
    private IIcon[] icons = new IIcon[6];
    private String name = "derpyfurnace";
    private String side = "";
    public static boolean burning;

    public BlockDerpyFurnace() {
        super(Material.rock);
        this.setBlockName(Reference.MOD_ID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setCreativeTab(CreativeTabFDM.FDM_TAB);

    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        for(int i=0; i < 6; i++) {
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

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
            return new TileEntityDerpyFurnace();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            if (world.getTileEntity(x, y, z) == null || player.isSneaking()) {
                return false;
            }
            player.openGui(FiresDerpyMod.instance, 0, world, x, y, z);
        }
        return true;
    }

    public static void updateFurnaceBlockState(boolean isBurning, World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        TileEntity TEDerpyFurnace = world.getTileEntity(x, y, z);
        burning = true;

        if (isBurning) {
            world.setBlock(x, y, z, Blocks.lit_furnace);
        }
        else {
            world.setBlock(x, y, z, Blocks.furnace);
        }
        burning = false;
        world.setBlockMetadataWithNotify(x, y, z, 1, 2);

        if (TEDerpyFurnace != null) {
            TEDerpyFurnace.validate();
            world.setTileEntity(x, y, z, TEDerpyFurnace);
        }
    }
//NOTES: Add breakBlock, dropItems,
}
