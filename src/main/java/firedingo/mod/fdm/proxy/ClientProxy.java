package firedingo.mod.fdm.proxy;


import firedingo.mod.fdm.gui.GuiDerpyFurnace;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy {
    //seems things are funky if you don't atleast create these classes. That's why they're here but empty.

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x,y,z);
        if (tileEntity instanceof TileEntityDerpyFurnace) {
            return new GuiDerpyFurnace(player.inventory, (TileEntityDerpyFurnace) tileEntity);
        }
        return null;
    }


}
