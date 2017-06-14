package firedingo.mod.fdm.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by firedingo on 15/05/2015.
 */
public class ModBlocks {

    //Creates An Instance Of The Blocks Using the Generic Common Type BlockFDM
    public static BlockFDM BlockColour;
    public static BlockFDM DerpyOre;
    public static BlockFDM DerpyOre2;
    public static BlockPane DerpyPane;
    public static BlockFDM DerpyCheeseB;
    public static BlockDerpyFurnace DerpyFurnace;
    public static BlockDerpyFurnace Lit_DerpyFurnace;
    public static BlockFDM BlockNotchApple;

    public static void BlocksInit() {
        //Initializes The Blocks With FML's GameRegistry
    	BlockColour = new BlockColourful();
    	DerpyOre = new BlockDerpyOre();
    	DerpyOre2 = new BlockDerpyOre2();
    	DerpyPane = new BlockDerpyPane();
    	DerpyCheeseB = new BlockDerpyCheese();
    	DerpyFurnace = new BlockDerpyFurnace(false, "derpyfurnace", "blockderpyfurnace");
    	Lit_DerpyFurnace = new BlockDerpyFurnace(true, "litderpyfurnace", "lit_blockderpyfurnace");
    	BlockNotchApple = new BlockNotchApple();
    }
    
    public static void BlocksRegister() {
    	//Registers The Blocks With FML's GameRegistry
    	registerBlock(BlockColour);
    	registerBlock(DerpyOre);
    	registerBlock(DerpyOre2);
    	registerBlock(DerpyPane); //This needs to be handled. Texture not working but registers fine.
    	registerBlock(DerpyCheeseB);
    	registerBlock(DerpyFurnace);
    	registerBlock(Lit_DerpyFurnace);
    	registerBlock(BlockNotchApple);
    }
	
	public static void registerBlock(Block block) 
	{
		registerBlock(block, new ItemBlock(block));
	}
	
	public static void registerBlock(Block block, ItemBlock item) 
	{
		GameRegistry.register(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(BlockColour);
        registerRender(DerpyOre);
        registerRender(DerpyOre2);
        registerRender(DerpyPane); //This needs to be handled. Texture not working but registers fine.
        registerRender(DerpyCheeseB);
        registerRender(DerpyFurnace);
        registerRender(Lit_DerpyFurnace);
        registerRender(BlockNotchApple);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
}
}
