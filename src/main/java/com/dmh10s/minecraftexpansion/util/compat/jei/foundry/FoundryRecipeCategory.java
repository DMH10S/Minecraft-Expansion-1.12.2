package com.dmh10s.minecraftexpansion.util.compat.jei.foundry;

import com.dmh10s.minecraftexpansion.util.Reference;
import com.dmh10s.minecraftexpansion.util.compat.jei.RecipeCategories;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.Minecraft;

public class FoundryRecipeCategory extends AbstractFoundryRecipeCategory<FoundryRecipe>
{
	private final IDrawable background;
	private final String name;
	
	public FoundryRecipeCategory(IGuiHelper helper)
	{
		super(helper);
		background = helper.createDrawable(TEXTURES, 4, 4, 150, 75);
		name = "Foundry";
	}
	
	@Override
	public IDrawable getBackground()
	{
		return background;
	}
	
	@Override
	public void drawExtras(Minecraft minecraft)
	{
		animatedFlame.draw(minecraft, 4, 50);
		animatedArrow.draw(minecraft, 40, 31);
	}
	
	@Override
	public String getTitle()
	{
		return name;
	}
	
	@Override
	public String getModName()
	{
		return Reference.NAME;
	}
	
	@Override
	public String getUid()
	{
		return RecipeCategories.FOUNDRY;
	}
	
	public void setRecipe(IRecipeLayout recipeLayout, FoundryRecipe recipeWrapper, IIngredients ingredients)
	{
		IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
		stacks.init(input1, true, 21, 5);
		stacks.init(input2, true, 21, 54);
		stacks.init(output, false, 76, 32);
		stacks.set(ingredients);
	};
}
