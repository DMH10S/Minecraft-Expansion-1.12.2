package com.dmh10s.minecraftexpansion.util.compat.jei.foundry;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.dmh10s.minecraftexpansion.blocks.foundry.FoundryRecipes;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

public class FoundryRecipeMaker
{
	public static List<FoundryRecipe> getRecipes(IJeiHelpers helpers)
	{
		IStackHelper stackHelper = helpers.getStackHelper();
		FoundryRecipes instance = FoundryRecipes.getInstance();
		Table<ItemStack, ItemStack, ItemStack> recipes = instance.getDualSmeltingList();
		List<FoundryRecipe> jeiRecipes = Lists.newArrayList();
		
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : recipes.columnMap().entrySet())
		{
			for (Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
			{
				ItemStack input1 = entry.getKey();
				ItemStack input2 = ent.getKey();
				ItemStack output = ent.getValue();
				List<ItemStack> inputs = Lists.newArrayList(input1, input2);
				FoundryRecipe recipe = new FoundryRecipe(inputs, output);
				jeiRecipes.add(recipe);
			}
		}
		
		return jeiRecipes;
	}
}
