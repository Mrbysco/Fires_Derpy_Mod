package firedingo.mod.fdm.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by firedingo on 14/05/2015.
 */
public class ModItems {

    //Creates A Custom ToolMaterial
    public static final ToolMaterial DerpyMaterial = EnumHelper.addToolMaterial("DerpyMaterial", 3, 2000, 15.0F, 5.0F, 30);

    //Creates An Instance Of The Items Using the Generic Common Type ItemFDM
    public static final ItemFDM ItemLeaf = new ItemLeaf();
    public static final ItemFDM ItemDingot = new ItemDerpyIngot();
    public static final ItemFDM ItemDingot2 = new ItemDerpyIngot2();
    public static final ItemFDM ItemCheeseI = new ItemCheese();
    public static final ItemFDM ItemUnchargedCrystal = new ItemUnchargedCrystal();
    public static final ItemPickaxe ItemDerpyPick = new ItemDerpyPick(DerpyMaterial);


    public static void ItemsInit() {
        //Registers The Items With FML's GameRegistry
        GameRegistry.registerItem(ItemLeaf, "ItemLeaf");
        GameRegistry.registerItem(ItemDingot, "DerpyIngot");
        GameRegistry.registerItem(ItemDingot2, "DerpyIngot2");
        GameRegistry.registerItem(ItemCheeseI, "DerpyCheeseI");
        GameRegistry.registerItem(ItemUnchargedCrystal, "ItemUnchargedCrystal");
        GameRegistry.registerItem(ItemDerpyPick, "DerpyPick");
    }
}
