package firedingo.mod.fdm.recipe;

import firedingo.mod.fdm.block.ModBlocks;
import firedingo.mod.fdm.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by firedingo on 15/05/2015.
 */
public class Recipes {

    public static void RecipesInit() {
        //These are my recipe derps. Will remain for posterity reasons but should be cleaned up in any actual proper mod.
     //   GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BlockColour), "AAA", "AAA", "AAA",'A', ModItems.ItemLeaf));
      //  GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockColour),
      //          "AAA", "AAA", "AAA", new ItemStack(ModItems.ItemLeaf));

        //Recipes being registered with FML
        //Smelting recipe
        GameRegistry.addSmelting(ModBlocks.DerpyOre2, new ItemStack(ModItems.ItemDingot2), 0.5f);

        //Two shaped and one Shapeless Recipe
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockColour), "sss", "sss", "sss", 's', ModItems.ItemLeaf);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ItemUnchargedCrystal),new Object[] {Items.DIAMOND, Items.REDSTONE});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.ItemDerpyPick), "iii", " s ", " s ", 'i', ModItems.ItemDingot, 's', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockNotchApple), "aaa", "aaa", "aaa", 'a', Items.GOLDEN_APPLE);
    }
}
