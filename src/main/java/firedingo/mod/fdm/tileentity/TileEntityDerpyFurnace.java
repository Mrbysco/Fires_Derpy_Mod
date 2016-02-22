package firedingo.mod.fdm.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import firedingo.mod.fdm.block.BlockDerpyFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.*;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import java.lang.String;

/**
 * Created by Firedingo on 24/06/2015.
 */
public class TileEntityDerpyFurnace extends TileEntity implements ISidedInventory {

    public int FuelBurnTime;
    public int FurnaceBurnProcess;
    private ItemStack[] FurnaceContentStack = new ItemStack[3];
    public int CookProcessTime;


    private String name = "tileEntityDerpyFurnace";
    private ItemStack[] inventory;

    public static final String publicname = "tileEntityDerpyFurnace";

    public TileEntityDerpyFurnace() {
        this.inventory = new ItemStack[3]; // this plus getter throws error
    }

    public String getName() {
        return name;
    }


    @Override
    public int getSizeInventory() {
        if (inventory == null) { //was crashing cause null value. Not crashing any more but if statement helped figure out there was a null value.
            System.out.println("Inventory Is Null");
            return 3;
        }
        else {
            System.out.println("Inventory Is NOT Null");
            return inventory.length;
        }
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inventory[slot];
        }

    @Override
    public ItemStack decrStackSize(int slot, int amt) {
        ItemStack stack = getStackInSlot(slot);
        if (stack != null) {
            if (stack.stackSize <= amt) {
                setInventorySlotContents(slot, null);
            }
            else {
                stack = stack.splitStack(amt);
                if (stack.stackSize == 0) {
                    setInventorySlotContents(slot, null);
                }
            }
        }
        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        ItemStack stack = getStackInSlot(slot);
        if (stack != null) {
            setInventorySlotContents(slot, null);
        }
        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        inventory[slot] = stack;
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {
        return "fdm.tileentityderpyfurnace";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false; //THIS IS NEW! NEED MORE READING ON IT!
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return worldObj.getTileEntity(xCoord, yCoord, zCoord) == this &&
                player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
    }

    @Override
    public void openInventory() {
        //NOOP
    }

    @Override
    public void closeInventory() {
        //NOOP
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        switch(slot) {
            case 0: //Fuel
                return TileEntityFurnace.isItemFuel(stack);
            case 1: //Input
                return true;
            case 2: //Output
                return false;
        }
        return true;
    } //THIS IS NEW! NEED MORE READING ON IT!

    //NEED TO LEARN MORE ABOUT THE FOLLOWING NBT METHODS
    @Override
    public void readFromNBT(NBTTagCompound NBTtagC) {
        super.readFromNBT(NBTtagC);

        NBTTagList tagList = NBTtagC.getTagList("Inventory",0);
        for (int i = 0; i < tagList.tagCount(); i++) {
            NBTTagCompound nbtTag = (NBTTagCompound) tagList.getCompoundTagAt(i);
            byte slot = nbtTag.getByte("Slot");
            if (slot >= 0 && slot < inventory.length) {
                inventory[slot] = ItemStack.loadItemStackFromNBT(nbtTag);
            }
            FurnaceBurnProcess = NBTtagC.getInteger("Process");
            FuelBurnTime = NBTtagC.getInteger("MaxTime");
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound NBTtagC) {
        super.writeToNBT(NBTtagC);

        NBTTagList itemList = new NBTTagList();
        for (int i = 0; i < inventory.length; i++) {
            ItemStack stack = inventory[i];
            if (stack != null) {
                NBTTagCompound NBTtag = new NBTTagCompound();
                NBTtag.setByte("slot", (byte) i);
                stack.writeToNBT(NBTtag);
                itemList.appendTag(NBTtag);
            }
        }
        NBTtagC.setTag("inventory", itemList);

        NBTtagC.setInteger("Process", FurnaceBurnProcess);
        NBTtagC.setInteger("MaxTime", FuelBurnTime);
    }

   // /*
    @Override
    public int[] getAccessibleSlotsFromSide(int sideInt) { //Required by ISidedInventory
        return new int[0];
        //or null
    }

    @Override
    public boolean canInsertItem(int slot, ItemStack stack, int side) { //Required by ISidedInventory
        return isItemValidForSlot(slot, stack);
    }

    @Override
    public boolean canExtractItem(int slot, ItemStack stack, int side) { //Required by ISidedInventory
        return true;
    }
    //*/

    public int getBurnTimeRemainingScaled(int something) {
        if (FuelBurnTime == 0) {
            this.FuelBurnTime = 200;
        }
        return this.FurnaceBurnProcess * something / this.FuelBurnTime;
    }

    public boolean isBurning() {
        return this.FurnaceBurnProcess > 0;
    }

    public void updateEntity() {
        boolean flag = FurnaceBurnProcess > 0;
        boolean flag1 = false;

        if (this.FurnaceBurnProcess > 0) {
            --this.FurnaceBurnProcess;
        }

        if (!this.worldObj.isRemote) {
            if (this.FurnaceBurnProcess != 0 || this.FurnaceContentStack[1] != null && this.FurnaceContentStack[0] != null) {
                if (this.FurnaceBurnProcess == 0 && this.canSmelt()) {
                    this.FuelBurnTime = this.FurnaceBurnProcess = getItemBurnTime(this.FurnaceContentStack[1]);
                    if (this.FurnaceBurnProcess > 0) {
                        flag1 = true;

                        if(this.FurnaceContentStack[1] != null) {
                            --this.FurnaceContentStack[1].stackSize;

                            if (this.FurnaceContentStack[1].stackSize == 0) {
                                this.FurnaceContentStack[1] = FurnaceContentStack[1].getItem().getContainerItem(FurnaceContentStack[1]);
                            }
                        }
                    }
                }
                if (this.isBurning() && this.canSmelt()) {
                    ++this.CookProcessTime;

                    if(this.CookProcessTime == 200) {
                        this.CookProcessTime = 0;
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else {
                    this.CookProcessTime = 0;
                }
            }

            if (flag != this.FurnaceBurnProcess > 0) {
                flag1 = true;
                BlockDerpyFurnace.updateFurnaceBlockState(this.FurnaceBurnProcess > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if (flag1) {
            this.markDirty();
        }
    }
    private boolean canSmelt() {
        if (this.FurnaceContentStack[0] == null) {
            return false;
        }
        else {
            ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.FurnaceContentStack[0]);
            if (stack == null) { return false; }
            if (FurnaceContentStack[2] == null) { return true; }
            if (!FurnaceContentStack[2].isItemEqual(stack)) { return false; }
            int result = FurnaceContentStack[2].stackSize + stack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.FurnaceContentStack[2].getMaxStackSize();
        }
    }
    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.FurnaceContentStack[0]);
            if (this.FurnaceContentStack[2] == null) {
                this.FurnaceContentStack[2] = stack.copy();
            }
            else if (this.FurnaceContentStack[2].getItem() == stack.getItem()) {
                this.FurnaceContentStack[2].stackSize += stack.stackSize;
            }
            --this.FurnaceContentStack[0].stackSize;
            if (this.FurnaceContentStack[0].stackSize <= 0) {
                this.FurnaceContentStack[0] = null;
            }
        }
    }

    public static int getItemBurnTime(ItemStack stack) {
        if (stack == null) {
            return 0;
        }
        else {
            Item item = stack.getItem();
            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab) {
                    return 150;
                }
                if (block.getMaterial() == Material.wood) {
                    return 300;
                }
                if (block == Blocks.coal_block) {
                    return 16000;
                }
            }
            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) {return 200;}
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")){return 200;}
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")){return 200;}
            if (item == Items.stick){return 100;}
            if (item == Items.coal){return 1600;}
            if (item == Items.lava_bucket){return 20000;}
            if (item == Item.getItemFromBlock(Blocks.sapling)){return 100;}
            if (item == Items.blaze_rod){ return 2400;}
            return GameRegistry.getFuelValue(stack);
        }
    }
}//END CLASS
