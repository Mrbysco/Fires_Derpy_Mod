package firedingo.mod.fdm.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import firedingo.mod.fdm.ContainerDerpyFurnace;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Firedingo on 15/09/2015.
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileEntityDerpyFurnace) {
            return new ContainerDerpyFurnace(player.inventory, (TileEntityDerpyFurnace) tileEntity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x,y,z);
        if (tileEntity instanceof TileEntityDerpyFurnace) {
            return new GuiDerpyFurnace(player.inventory, (TileEntityDerpyFurnace) tileEntity);
        }
        return null;
    }
}
