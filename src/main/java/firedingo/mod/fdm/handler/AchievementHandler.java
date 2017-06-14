package firedingo.mod.fdm.handler;

import firedingo.mod.fdm.stats.Achievements;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

/**
 * Created by Firedingo on 13/10/2016.
 */
public class AchievementHandler {

    @SubscribeEvent
    public void ItemPickupEvent(ItemPickupEvent event) {
            if (event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Blocks.RED_FLOWER))) {
            	event.player.addStat(Achievements.getPurpleFlower, 1);
            }
    }


}
