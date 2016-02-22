package firedingo.mod.fdm.gui;

import firedingo.mod.fdm.ContainerDerpyFurnace;
import firedingo.mod.fdm.reference.Reference;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

/**
 * Created by Firedingo on 2/08/2015.
 */
public class GuiDerpyFurnace extends GuiContainer {
    public GuiDerpyFurnace(InventoryPlayer playerInv, TileEntityDerpyFurnace tileEntityDF) {
        super(new ContainerDerpyFurnace(playerInv, tileEntityDF));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int one, int two) {
        //the parameters for drawString are: string, x, y, color
        //NOTE tutorials may refer to this as fontRenderer not fontRendererObj but they are the same.
        //This is the text on the gui
        fontRendererObj.drawString("Derpy Furnace", 50, 6, 0xFFFFFF);

        //This is the text on the gui
        fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 0xFFFFFF);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float One, int one, int two) {
        //GUI code to follow apparently only path needs changing
        final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/derpyfurnace.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(texture); //code defintely be refined here but for learning purposes it will work.
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);

    }
}
