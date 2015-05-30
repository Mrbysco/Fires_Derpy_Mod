package firedingo.mod.fdm.items;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by firedingo on 14/05/2015.
 */
public class ModItems {

    public static final ItemFDM ItemLeaf = new ItemLeaf();
    public static final ItemFDM ItemDingot = new ItemDerpyIngot();
    public static final ItemFDM ItemDingot2 = new ItemDerpyIngot2();
    public static final ItemFDM ItemCheeseI = new ItemCheese();
    public static final ItemFDM ItemUnchargedCrystal = new ItemUnchargedCrystal();

    public static void ItemsInit() {
        GameRegistry.registerItem(ItemLeaf, "ItemLeaf");
        GameRegistry.registerItem(ItemDingot, "DerpyIngot");
        GameRegistry.registerItem(ItemDingot2, "DerpyIngot2");
        GameRegistry.registerItem(ItemCheeseI, "DerpyCheeseI");
        GameRegistry.registerItem(ItemUnchargedCrystal, "ItemUnchargedCrystal");
    }
}
