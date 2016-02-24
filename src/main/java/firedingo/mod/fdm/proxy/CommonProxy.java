package firedingo.mod.fdm.proxy;


import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import firedingo.mod.fdm.ContainerDerpyFurnace;
import firedingo.mod.fdm.gui.GuiDerpyFurnace;
import firedingo.mod.fdm.gui.GuiHandler;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import firedingo.mod.fdm.world.OreGeneration;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class CommonProxy implements IGuiHandler {
    //seems things are funky if you don't atleast create these classes. That's why they're here but empty.
    //Tile Entities Get registered Here. Yay The Class can get used :D

    public void initTileEntities() {
        GameRegistry.registerTileEntity(TileEntityDerpyFurnace.class, TileEntityDerpyFurnace.publicname);
    }

    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) { return null;} //NOOP

    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {return null; //NOOP
    }

    public void initWorldGen() {
        GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
    }

}
