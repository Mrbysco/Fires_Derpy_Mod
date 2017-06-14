package firedingo.mod.fdm.gui;

import firedingo.mod.fdm.reference.Reference;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;

/**
 * Created by Firedingo on 2/08/2015.
 */
public class GuiDerpyFurnace extends GuiContainer 
{
    private static final ResourceLocation DERPYFURNACE_GUI_TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/derpyfurnace.png");
    /** The player inventory bound to this GUI. */
    private final InventoryPlayer playerInventory;
    private final IInventory tileFurnace;
    
    public GuiDerpyFurnace(InventoryPlayer playerInv, IInventory furnaceInv) 
	{
        super(new ContainerFurnace(playerInv, furnaceInv));
        this.playerInventory = playerInv;
        this.tileFurnace = furnaceInv;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int one, int two) {
        //the parameters for drawString are: string, x, y, color
        //NOTE tutorials may refer to this as fontRenderer not fontRendererObj but they are the same.
        //This is the text on the gui
    	String s = this.tileFurnace.getDisplayName().getUnformattedText();
    	this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
        //fontRendererObj.drawString("Derpy Furnace", 50, 6, 0xFFFFFF);

        //This is the text on the gui
        //fontRendererObj.drawString(I18n.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 0xFFFFFF);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float One, int one, int two) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(DERPYFURNACE_GUI_TEXTURES);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

        if (TileEntityDerpyFurnace.isBurning(this.tileFurnace))
        {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l + 1, 16);
    }
    
    private int getCookProgressScaled(int pixels)
    {
        int i = this.tileFurnace.getField(2);
        int j = this.tileFurnace.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }

    private int getBurnLeftScaled(int pixels)
    {
        int i = this.tileFurnace.getField(1);

        if (i == 0)
        {
            i = 200;
        }

        return this.tileFurnace.getField(0) * pixels / i;
    }
}
