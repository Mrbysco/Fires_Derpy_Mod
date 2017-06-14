package firedingo.mod.fdm.proxy;


import firedingo.mod.fdm.ContainerDerpyFurnace;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ServerProxy extends CommonProxy {
    //seems things are funky if you don't atleast create these classes. That's why they're here but empty.

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    	BlockPos pos = new BlockPos(x,y,z);
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof TileEntityDerpyFurnace) {
            return new ContainerDerpyFurnace(player.inventory, (TileEntityDerpyFurnace) tileEntity);
        }
        return null;
    }

}
