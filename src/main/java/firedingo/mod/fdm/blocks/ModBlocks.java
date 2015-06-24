package firedingo.mod.fdm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockPane;

/**
 * Created by firedingo on 15/05/2015.
 */
public class ModBlocks {

    //Creates An Instance Of The Blocks Using the Generic Common Type BlockFDM
    public static final BlockFDM BlockColour = new BlockColourful();
    public static final BlockFDM DerpyOre = new BlockDerpyOre();
    public static final BlockFDM DerpyOre2 = new BlockDerpyOre2();
    public static final BlockPane DerpyPane = new BlockDerpyPane();
    public static final BlockFDM DerpyCheeseB = new BlockDerpyCheese();
    public static final BlockFDM DerpyFurnace = new BlockDerpyFurnace();

    public static void BlocksInit() {
        //Registers The Blocks With FML's GameRegistry
        GameRegistry.registerBlock(BlockColour, "ColourBlock");
        GameRegistry.registerBlock(DerpyOre, "DerpyOre");
        GameRegistry.registerBlock(DerpyOre2, "DerpyOre2");
       // GameRegistry.registerBlock(DerpyPane, "DerpyPane"); //This needs to be handled. Texture not working but registers fine.
        GameRegistry.registerBlock(DerpyCheeseB, "DerpyCheeseB");
        GameRegistry.registerBlock(DerpyFurnace, "DerpyFurnace");
    }
}
