package firedingo.mod.fdm.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import firedingo.mod.fdm.stats.Achievements;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

/**
 * Created by Firedingo on 13/10/2016.
 */
public class AchievementHandler {

    @SubscribeEvent
    public void ItemPickupEvent(ItemEvent event) {
        EntityPlayer player = event.entityPlayer;


            if (event.item == Blocks.red_flower) {
               player.addStat(Achievements.getPurpleFlower, 1);
            }
    }


}
