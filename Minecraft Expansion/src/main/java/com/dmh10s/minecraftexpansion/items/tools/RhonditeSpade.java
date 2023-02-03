package com.dmh10s.minecraftexpansion.items.tools;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.util.IHasModel;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class RhonditeSpade extends ItemSpade implements IHasModel {
	public RhonditeSpade(String name, ToolMaterial material)
	{
		super(material);
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
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        if (repair.getItem().equals(ModItems.RHONDITE))
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
}