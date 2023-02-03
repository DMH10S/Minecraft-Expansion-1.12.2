package com.dmh10s.minecraftexpansion.items.armor;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorNightVision extends ItemArmor implements IHasModel
{

	public ArmorNightVision(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
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
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
	{
		if(player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.NIGHT_VISION_VISOR && player.getActivePotionEffects() != MobEffects.NIGHT_VISION)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1200, 0, false, false));
		}
	}
	
}