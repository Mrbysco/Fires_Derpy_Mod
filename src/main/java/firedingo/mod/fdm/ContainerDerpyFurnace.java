package firedingo.mod.fdm;


import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;

/**
 * Created by Firedingo on 6/08/2015.
 */
//Add Slot not happening
//Pahimar puts this under the inventory package
public class ContainerDerpyFurnace extends Container {

    private TileEntityDerpyFurnace TEDerpyFurnace;

    public ContainerDerpyFurnace(InventoryPlayer playerInv, TileEntityDerpyFurnace TEDerpyFurnace) {
        this.TEDerpyFurnace = TEDerpyFurnace;

        //Add Furnace Slots
        this.addSlotToContainer(new Slot(TEDerpyFurnace, 0, 56, 17));
        this.addSlotToContainer(new Slot(TEDerpyFurnace, 1, 56, 53));
        this.addSlotToContainer(new Slot(TEDerpyFurnace, 2, 116, 35));

        int x;
        int y;

        //the Slot constructor takes the IInventory and the slot number in that it binds to
        //and the x-y coordinates it resides on-screen
        for (y = 0; y < 3; y++) {
            for (x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }

        for (x = 0; x < 9; x++) {
            addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 142));
        }

        //bind player's inventory
      //  bindPlayerInventory(playerInv);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerInv) {
      //  return this.TEDerpyFurnace.isUseableByPlayer(playerInv);
        return true;
    }

    public void bindPlayerInventory(InventoryPlayer PlayerInv) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("BindPLayerInventory First thing");
                this.addSlotToContainer(new Slot(PlayerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("BindPLayerInventory Second thing");
            this.addSlotToContainer(new Slot(PlayerInv, i, 8 + i * 18, 142));
        }
    }

//This code is likely causing shift clicking errors and crashes
    @Override
    public ItemStack transferStackInSlot (EntityPlayer player, int slot) {
        ItemStack stack = null;
        Slot Slot = (Slot) inventorySlots.get(slot);

        //null checks and checks if the item can be stacked (maxStackSize > 1)
        if (Slot != null && Slot.getHasStack()) {
            ItemStack StackInSlot = Slot.getStack();
            stack = StackInSlot.copy();

            //merges the item into player inventory since its in the tileEntity
            if (slot < TEDerpyFurnace.getSizeInventory()) {
                if (!this.mergeItemStack(StackInSlot, TEDerpyFurnace.getSizeInventory(), 36 + TEDerpyFurnace.getSizeInventory(), true)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(StackInSlot, 0, TEDerpyFurnace.getSizeInventory(), false)) {
                return null;
            }
            if (StackInSlot.stackSize == 0) {
                Slot.putStack(null);
            }
            else {
                Slot.onSlotChanged();
            }
            if (StackInSlot.stackSize == stack.stackSize) {
                return null;
            }
            Slot.onPickupFromSlot(player, StackInSlot);
        }
        return stack;
    }
}
