package com.dmh10s.minecraftexpansion.blocks.foundry;

import java.util.Map;
import java.util.Map.Entry;

import com.dmh10s.minecraftexpansion.init.ModItems;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FoundryRecipes
{
	 private static final FoundryRecipes INSTANCE = new FoundryRecipes();
	    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	    
	    public static FoundryRecipes getInstance()
	    {
	        return INSTANCE;
	    }
	    
	    public void addFoundry(Item input1, Item input2, ItemStack result, float experience) 
	    {
	    	this.addFoundryRecipes(new ItemStack(input1, 1, 32767), new ItemStack(input2, 1, 32767), result, experience);

	    }
	    
	    public void addFoundryRecipes(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	    {
	        if(getFoundryResult(input1, input2) != ItemStack.EMPTY) return;
	        this.smeltingList.put(input1, input2, result);
	        this.experienceList.put(result, Float.valueOf(experience));
	    }
	    
	    public ItemStack getFoundryResult(ItemStack input1, ItemStack input2) 
	    {
	        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
	        {
	            if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
	            {
	                for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
	                {
	                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
	                    {
	                        return (ItemStack)ent.getValue();
	                    }
	                }
	            }
	        }
	        return ItemStack.EMPTY;
	    }
	    
	    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	    {
	        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	    }
	    
	    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	    {
	        return this.smeltingList;
	    }
	    
	    public float getSmeltingExperience(ItemStack stack)
	    {
	        /*float ret = stack.getItem().getSmeltingExperience(stack);
	        if (ret != -1) return ret;*/

	        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
	        {
	            if (this.compareItemStacks(stack, entry.getKey()))
	            {
	                return ((Float)entry.getValue()).floatValue();
	            }
	        }

	        return 0.0F;
	    }
	
	private FoundryRecipes()
	{
		addFoundryRecipes(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.COAL), new ItemStack(ModItems.STEEL_INGOT), 0.7F);
		addFoundryRecipes(new ItemStack(Items.COAL), new ItemStack(Items.IRON_INGOT), new ItemStack(ModItems.STEEL_INGOT), 0.7F);
		addFoundryRecipes(new ItemStack(ModItems.STEEL_INGOT), new ItemStack(Items.COAL), new ItemStack(ModItems.CARBON_STEEL_INGOT), 0.7F);
		addFoundryRecipes(new ItemStack(Items.COAL), new ItemStack(ModItems.STEEL_INGOT), new ItemStack(ModItems.CARBON_STEEL_INGOT), 0.7F);
		addFoundryRecipes(new ItemStack(Items.COAL), new ItemStack(Items.COAL), new ItemStack(ModItems.MOLTEN_CARBON, 4), 0.7F);
		addFoundryRecipes(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_INGOT), new ItemStack(ModItems.MOLTEN_IRON, 4), 0.7F);
	}
}
