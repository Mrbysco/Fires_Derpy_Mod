package firedingo.mod.fdm.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import firedingo.mod.fdm.blocks.ModBlocks;
import firedingo.mod.fdm.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by firedingo on 15/05/2015.
 */
public class Recipes {

    public static void RecipesInit() {
     //   GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BlockColour), "AAA", "AAA", "AAA",'A', ModItems.ItemLeaf));
      //  GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BlockColour),
      //          "AAA", "AAA", "AAA", new ItemStack(ModItems.ItemLeaf));
                GameRegistry.addSmelting(ModBlocks.DerpyOre2, new ItemStack(ModItems.ItemDingot2), 0.5f);

                GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockColour), "sss", "sss", "sss", 's', ModItems.ItemLeaf);
    }
}
