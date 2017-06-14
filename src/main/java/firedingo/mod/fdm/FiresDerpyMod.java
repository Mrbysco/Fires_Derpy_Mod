package firedingo.mod.fdm;

import firedingo.mod.fdm.block.ModBlocks;
import firedingo.mod.fdm.gui.GuiHandler;
import firedingo.mod.fdm.item.ModItems;
import firedingo.mod.fdm.proxy.CommonProxy;
import firedingo.mod.fdm.recipe.Recipes;
import firedingo.mod.fdm.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;


@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class FiresDerpyMod {

    @Mod.Instance()
    public static FiresDerpyMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event) {
        //Calls the method that registers The Mod Items and Blocks
        ModItems.ItemsInit();
        ModItems.ItemsRegister();
        ModBlocks.BlocksInit();
        ModBlocks.BlocksRegister();

        //registering custom achievements + custom page
        proxy.registerAchievements();
        proxy.registerAchievementPage();
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        //Calls The Method That Registers The Mod's Recipes
        Recipes.RecipesInit();
        //Calls Method For Registering Tile Entities
        //call tile entity method here
        proxy.initTileEntities();
        
        //Need redoing
        //proxy.initWorldGen();

        //Registers GuiHandler Here
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

        //Register EventHandlers Here
        proxy.registerEventHandlers();
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

    }
}
