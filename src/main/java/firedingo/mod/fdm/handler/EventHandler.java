package firedingo.mod.fdm.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Firedingo on 15/05/2017.
 */
public class EventHandler {
    //Make Sure you add the annotation otherwise things may not fire correctly.
    //Go ahead and test without the annotation and then with and see what I mean :)
    @SubscribeEvent
    public void onLivingJumpEvent(LivingEvent.LivingJumpEvent event) {
        //Will set any entity that isn't a player that can jump on fire for 10 secs
        if (!(event.getEntity() instanceof EntityPlayer)) {
            event.getEntity().setFire(10);
        }
        //Will give only the player 1 level of experience every time they jump
        if (event.getEntity() instanceof EntityPlayer) {
            ((EntityPlayer) event.getEntity()).addExperienceLevel(1);
        }
    }
}
