package com.dmh10s.minecraftexpansion.util.compat.jei.foundry;

import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;

public class FoundryRecipe implements IRecipeWrapper
{
	private final List<ItemStack> inputs;
	private final ItemStack output;
	
	public FoundryRecipe(List<ItemStack> inputs, ItemStack output)
	{
		this.inputs = inputs;
		this.output = output;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients)
	{
		ingredients.setInputs(ItemStack.class, inputs);
		ingredients.setOutput(ItemStack.class, output);
	}
}
