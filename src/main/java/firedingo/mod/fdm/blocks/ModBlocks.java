package firedingo.mod.fdm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockPane;

/**
 * Created by firedingo on 15/05/2015.
 */
public class ModBlocks {

    public static final BlockFDM BlockColour = new BlockColourful();
    public static final BlockFDM DerpyOre = new BlockDerpyOre();
    public static final BlockFDM DerpyOre2 = new BlockDerpyOre2();
    public static final BlockPane DerpyPane = new BlockDerpyPane();
    public static final BlockFDM DerpyCheeseB = new BlockDerpyCheese();

    public static void BlocksInit() {
        GameRegistry.registerBlock(BlockColour, "ColourBlock");
        GameRegistry.registerBlock(DerpyOre, "DerpyOre");
        GameRegistry.registerBlock(DerpyOre2, "DerpyOre2");
       // GameRegistry.registerBlock(DerpyPane, "DerpyPane");
        GameRegistry.registerBlock(DerpyCheeseB, "DerpyCheeseB");
    }
}
