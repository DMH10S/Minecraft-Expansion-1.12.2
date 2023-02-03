package com.dmh10s.minecraftexpansion.items.food;

import com.dmh10s.minecraftexpansion.items.ItemBase;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class HealBase extends FoodBase {

	
	public HealBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(name, amount, saturation, isAnimalFood);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		float health = player.getHealth();
		player.setHealth(health + 4);
	}
}
