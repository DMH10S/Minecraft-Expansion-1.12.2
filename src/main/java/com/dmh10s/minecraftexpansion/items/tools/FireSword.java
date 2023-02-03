package com.dmh10s.minecraftexpansion.items.tools;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class FireSword extends ItemSword implements IHasModel
{

	public FireSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.COMBAT_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
	{
		par1ItemStack.damageItem(5, par3EntityLiving);
		par2EntityLiving.setFire(5);
		return true;
	}
}
