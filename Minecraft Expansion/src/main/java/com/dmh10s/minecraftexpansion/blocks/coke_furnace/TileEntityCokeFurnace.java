package com.dmh10s.minecraftexpansion.blocks.coke_furnace;

import javax.annotation.Nonnull;

import org.apache.commons.lang3.ArrayUtils;

import com.dmh10s.minecraftexpansion.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class TileEntityCokeFurnace extends TileEntity implements ITickable
{
	private static final int[] slotsTop = Slots.INPUT_SLOT.slots();
	private static final int[] slotsBottom = Slots.OUTPUT_SLOT.slots();
	private static final int[] slotsSides = Slots.FUEL_SLOT.slots();
    
	public static final int SIZE = 4;
    
    private int burnTime;
    private int currentBurnTime;
    private int cookTime;
    private int totalCookTime=154;
    
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
    {
        if (direction == EnumFacing.DOWN && index == 1)
        {
            Item item = stack.getItem();

            if (item != Items.WATER_BUCKET && item != Items.BUCKET)
            {
                return false;
            }
        }

        return true;
    }
    
    private ItemStackHandler itemStackHandler = new ItemStackHandler(SIZE)
    {
        @Override
        protected void onContentsChanged(int slot) {
            
           TileEntityCokeFurnace.this.markDirty();
        }
    };
    
    public static int getItemBurnTime(ItemStack fuel) 
    {
        if(fuel.isEmpty()) return 0;
        else 
        {
            Item item = fuel.getItem();
            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR) {}
            
            if(item == ModItems.COKE) return 1540;

            return GameRegistry.getFuelValue(fuel);
        }
    }
    
    public static boolean isItemFuel(ItemStack fuel)
    {
        return getItemBurnTime(fuel) > 0;
    }
    
    
    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
    {
        return true;
    }
    
    public boolean isBurning() 
    {
        return this.burnTime > 0;
    }
    
    @SideOnly(Side.CLIENT)
      public static boolean isBurning(TileEntityCokeFurnace te) {

        return te.getField(0) > 0;
    }
    
    public void update() 
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;
        
        if(this.isBurning()) --this.burnTime;
        
        if(!this.world.isRemote) 
        {

                ItemStack fuel = this.itemStackHandler.getStackInSlot(1);
            
            
            if(this.isBurning() || !fuel.isEmpty() && !(this.itemStackHandler.getStackInSlot(0)).isEmpty() || (this.itemStackHandler.getStackInSlot(0)).isEmpty())
            {
                if(!this.isBurning() && this.canSmelt()) 
                {
                    this.burnTime = getItemBurnTime(fuel);
                    this.currentBurnTime = this.burnTime;
                    
                    if(this.isBurning()) 
                    {
                        flag1 = true;
                        
                        if(!fuel.isEmpty()) 
                        {
                            Item item = fuel.getItem();
                            fuel.shrink(1);
                            
                            if(fuel.isEmpty()) 
                            {
                                ItemStack item1 = item.getContainerItem(fuel);
                                this.itemStackHandler.setStackInSlot(1, item1);
                            }
                        }
                    }
                } 
                if(this.isBurning() && this.canSmelt()) 
                {
                    ++this.cookTime;
                    
//the 20 here is the total cook time i want. The cook lasts 20 ticks then the item is cooked
                    
                    if(this.cookTime == 154) 
                    {
                        this.cookTime = 0;
                        this.smeltItem();
                        flag1 = true;
                    }
                } 
                else this.cookTime = 0;
            } 
            else if(!this.isBurning() && this.cookTime > 0) 
                
//same here : 20 is for 20 ticks of cooking                
            {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, 154);
            }
            if(flag != this.isBurning()) 
            {
                flag1 = true;
                BlockCokeFurnace.setState(this.isBurning(), this.world, this.pos);
            }
        } 
        if(flag1) this.markDirty();
    }
    
    private boolean canSmelt() 
    {  
        
        if((this.itemStackHandler.getStackInSlot(0)).isEmpty() || ((this.itemStackHandler.getStackInSlot(0)).isEmpty())) return false;
        else 
        {
                
            ItemStack result = CokeFurnaceRecipes.getInstance().getCokeFurnaceResult(this.itemStackHandler.getStackInSlot(0));    
            
            if(result.isEmpty()) return false;
            else
            {
                ItemStack output = this.itemStackHandler.getStackInSlot(2);
                
                if(output.isEmpty()) return true;
                if(!output.isItemEqual(result)) return false;
                int res = output.getCount() + result.getCount();
                return res <= getInventoryStackLimit() && res <= output.getMaxStackSize();
            }
        }
    }
    
    private int getInventoryStackLimit() {
        return 64;
    }
    
    public void smeltItem() 
    {
                
        if(this.canSmelt()) 
        {
            
            ItemStack input = this.itemStackHandler.getStackInSlot(0);
            ItemStack output = this.itemStackHandler.getStackInSlot(2);
            ItemStack result = CokeFurnaceRecipes.getInstance().getCokeFurnaceResult(input);    
            
            
            if(output.isEmpty()) this.itemStackHandler.setStackInSlot(2, result.copy());
            else if(output.getItem() == result.getItem()) output.grow(result.getCount());
            
            input.shrink(1);
        }
    }
    
     public int getField(int id)
        {
            switch(id)
            {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentBurnTime;
            case 2:
                return this.cookTime;
            case 3:
            	return this.totalCookTime;
            default:
                return 0;
            }
        }
            public void setField(int id, int value)
        {
            switch(id)
            {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            }
        }
    
    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);

        this.burnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        
         if (compound.hasKey("items")) {itemStackHandler.deserializeNBT((NBTTagCompound) compound.getTag("items"));}
        
        }
    
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) 
    {
        super.writeToNBT(compound);
        
        compound.setInteger("BurnTime", this.burnTime);
        compound.setInteger("CookTime", this.cookTime);

        
        compound.setTag("items", itemStackHandler.serializeNBT());
         return compound;
    }
        
     @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing)
        {
            if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
            else return false;
        }
        
     @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing)
        {
            if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(itemStackHandler);
            return super.getCapability(capability, facing);
        }
    
        public boolean isUsablebyplayer(EntityPlayer playerIn) {
            return !isInvalid() && playerIn.getDistanceSq(pos.add(0.5D, 0.5D, 0.5D)) <= 64D;
        }
        
        public boolean isUsableByPlayer(EntityPlayer player) 
        {
        	return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
        }
        
        public enum Slots {

    		INPUT_SLOT(0), OUTPUT_SLOT(2), FUEL_SLOT(1);

    		private final int[] slots;

    		Slots(int... slots)
    		{
    			this.slots = slots;
    		}

    		public int[] slots()
    		{
    			return slots;
    		}

    		public boolean contains(int i)
    		{
    			return ArrayUtils.contains(slots, i);
    		}
    	}

}
