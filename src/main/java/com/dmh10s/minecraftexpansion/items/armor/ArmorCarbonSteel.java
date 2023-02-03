package com.dmh10s.minecraftexpansion.items.armor;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorCarbonSteel extends ItemArmor implements IHasModel
{
	public ArmorCarbonSteel(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        if (repair.getItem().equals(ModItems.CARBON_STEEL_INGOT))
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
}
