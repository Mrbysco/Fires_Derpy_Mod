package firedingo.mod.fdm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import firedingo.mod.fdm.block.ModBlocks;
import firedingo.mod.fdm.gui.GuiHandler;
import firedingo.mod.fdm.item.ModItems;
import firedingo.mod.fdm.proxy.CommonProxy;
import firedingo.mod.fdm.recipe.Recipes;
import firedingo.mod.fdm.reference.Reference;


@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class FiresDerpyMod {

    @Mod.Instance()
    public static FiresDerpyMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event) {
        //Calls the method that registers The Mod Items and Blocks
        ModItems.ItemsInit();
        ModBlocks.BlocksInit();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        //Calls The Method That Registers The Mod's Recipes
        Recipes.RecipesInit();
        //Calls Method For Registering Tile Entities
        //call tile entity method here
        proxy.initTileEntities();

        //Registers GuiHandler Here
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

    }
}
