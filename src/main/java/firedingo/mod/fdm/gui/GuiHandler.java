package firedingo.mod.fdm.gui;

import firedingo.mod.fdm.ContainerDerpyFurnace;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by Firedingo on 15/09/2015.
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    	BlockPos pos = new BlockPos(x,y,z);
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof TileEntityDerpyFurnace) {
            return new ContainerDerpyFurnace(player.inventory, (TileEntityDerpyFurnace) tileEntity);
        }
        return null;
        
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    	BlockPos pos = new BlockPos(x,y,z);
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof TileEntityDerpyFurnace) {
            return new GuiDerpyFurnace(player.inventory, (TileEntityDerpyFurnace) tileEntity);
        }
        return null;
    }
}
