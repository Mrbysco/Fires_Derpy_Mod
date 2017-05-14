package firedingo.mod.fdm.proxy;


import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import firedingo.mod.fdm.ContainerDerpyFurnace;
import firedingo.mod.fdm.gui.GuiDerpyFurnace;
import firedingo.mod.fdm.gui.GuiHandler;
import firedingo.mod.fdm.handler.EventHandler;
import firedingo.mod.fdm.stats.Achievements;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import firedingo.mod.fdm.world.OreGeneration;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;

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

    public void registerAchievements() {
        //register the achievements
        Achievements.getPurpleFlower.registerStat();
        Achievements.getPurpleDye.registerStat();
        Achievements.getPurpleClay.registerStat();
        Achievements.getPurpleGlass.registerStat();
        Achievements.getPurpleWool.registerStat();
        Achievements.getPurpleCarpet.registerStat();
        Achievements.getPurplePane.registerStat();
    }
    public void registerAchievementPage() {
        //register achievement page and add the achievements to the page
        AchievementPage.registerAchievementPage(new AchievementPage("Fire's Achievements", new Achievement[] {
                Achievements.getPurpleFlower, Achievements.getPurpleDye, Achievements.getPurpleClay,
                Achievements.getPurpleWool, Achievements.getPurpleGlass, Achievements.getPurplePane,
                Achievements.getPurpleCarpet}));
    }

    public void registerEventHandlers() {
        //Register the Event Handlers Here
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}
