package com.dmh10s.minecraftexpansion.util.compat.jei.foundry;

import com.dmh10s.minecraftexpansion.util.Reference;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

public abstract class AbstractFoundryRecipeCategory<T extends IRecipeWrapper> implements IRecipeCategory<T>
{
	protected static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/foundry.png");
	
	protected static final int input1 = 0;
	protected static final int input2 = 1;
	protected static final int fuel = 2;
	protected static final int output = 3;
	
	protected final IDrawableStatic staticFlame;
	protected final IDrawableAnimated animatedFlame;
	protected final IDrawableAnimated animatedArrow;
	
	public AbstractFoundryRecipeCategory(IGuiHelper helper)
	{
		staticFlame = helper.createDrawable(TEXTURES, 176, 0, 14, 14);
		animatedFlame = helper.createAnimatedDrawable(staticFlame, 1200, IDrawableAnimated.StartDirection.TOP,  true);
		
		IDrawableStatic staticArrow = helper.createDrawable(TEXTURES, 176, 14, 24, 17);
		animatedArrow = helper.createAnimatedDrawable(staticArrow, 1200, IDrawableAnimated.StartDirection.LEFT, false);
	}
}
