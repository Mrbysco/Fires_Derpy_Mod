package firedingo.mod.fdm.proxy;


import cpw.mods.fml.common.registry.GameRegistry;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;

public abstract class CommonProxy {
    //seems things are funky if you don't atleast create these classes. That's why they're here but empty.
    //Tile Entities Get registered Here. Yay The Class can get used :D

    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityDerpyFurnace.class, TileEntityDerpyFurnace.publicname);
    }
}
