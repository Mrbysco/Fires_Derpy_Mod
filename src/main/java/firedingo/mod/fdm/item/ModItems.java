package firedingo.mod.fdm.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by firedingo on 14/05/2015.
 */
public class ModItems {

    //Creates A Custom ToolMaterial
    public static ToolMaterial DerpyMaterial = EnumHelper.addToolMaterial("DerpyMaterial", 3, 2000, 15.0F, 5.0F, 30);

    //Creates An Instance Of The Items Using the Generic Common Type ItemFDM
    public static ItemFDM ItemLeaf;
    public static ItemFDM ItemDingot;
    public static ItemFDM ItemDingot2;
    public static ItemFood ItemCheeseI;
    public static ItemFDM ItemUnchargedCrystal;
    public static ItemPickaxe ItemDerpyPick;


    public static void ItemsInit() {
        //Registers The Items With FML's GameRegistry
    	ItemLeaf = new ItemLeaf();
    	ItemDingot = new ItemDerpyIngot();
    	ItemDingot2 = new ItemDerpyIngot2();
    	ItemCheeseI = new ItemCheese(3, 3, false);
    	ItemUnchargedCrystal = new ItemUnchargedCrystal();
    	ItemDerpyPick = new ItemDerpyPick(DerpyMaterial);
    }
    
    public static void ItemsRegister() {
    	//Registers The Items With FML's GameRegistry
    	GameRegistry.register(ItemLeaf);
    	GameRegistry.register(ItemDingot);
    	GameRegistry.register(ItemDingot2);
    	GameRegistry.register(ItemCheeseI);
    	GameRegistry.register(ItemUnchargedCrystal);
    	GameRegistry.register(ItemDerpyPick);
    }
    
    public static void registerRenders()
	{
        registerRender(ItemLeaf);
        registerRender(ItemDingot);
        registerRender(ItemDingot2);
        registerRender(ItemCheeseI);
        registerRender(ItemUnchargedCrystal);
        registerRender(ItemDerpyPick);
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
}
}
