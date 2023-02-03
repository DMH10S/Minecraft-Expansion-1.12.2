package com.dmh10s.minecraftexpansion.items.tools;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class FireAxe extends ItemAxe implements IHasModel
{
	public FireAxe(String name, ToolMaterial material, float damage, float recoveryTime)
	{
		super(material, damage, recoveryTime);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.TOOLS_TAB);
		
		
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
