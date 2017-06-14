package firedingo.mod.fdm.stats;

import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

/**
 * Created by Firedingo on 12/10/2016.
 */
public class Achievements {

    //The order of arguments for achievements is as follows:
    //id, name, x_coord, y_coord, Item Icon, Required achievement if any

    //create and define the achievements here
    public static final Achievement getPurpleFlower = (new Achievement("achievement.getPurpleFlowe", "getPurpleFlower", 0, 0, Blocks.red_flower, (Achievement)null));
    public static final Achievement getPurpleDye = (new Achievement("achievement.getPurpleDye", "getPurpleDye", 0, 2, Items.dye, getPurpleFlower));
    public static final Achievement getPurpleWool = (new Achievement("achievement.getPurpleWool", "getPurpleWool", 2, 2, Blocks.wool, getPurpleDye));
    public static final Achievement getPurpleGlass = (new Achievement("achievement.getPurpleGlass", "getPurpleGlass", 0, 4, Blocks.glass, getPurpleDye));
    public static final Achievement getPurplePane = (new Achievement("achievement.getPurplePane", "getPurplePane", 0, 6, Blocks.glass_pane, getPurpleGlass));
    public static final Achievement getPurpleCarpet = (new Achievement("achievement.getPurpleCarpet", "getPurpleCarpet", 4, 2, Blocks.carpet, getPurpleWool));
    public static final Achievement getPurpleClay = (new Achievement("achievement.getPurpleClay", "getPurpleClay", -2, 2, Blocks.clay, getPurpleDye));

}
