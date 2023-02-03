package com.dmh10s.minecraftexpansion.init;

import java.util.ArrayList;
import java.util.List;

import com.dmh10s.minecraftexpansion.items.ItemBase;
import com.dmh10s.minecraftexpansion.items.armor.ArmorAluminum;
import com.dmh10s.minecraftexpansion.items.armor.ArmorCarbonFiber;
import com.dmh10s.minecraftexpansion.items.armor.ArmorCarbonSteel;
import com.dmh10s.minecraftexpansion.items.armor.ArmorChain;
import com.dmh10s.minecraftexpansion.items.armor.ArmorDiamond;
import com.dmh10s.minecraftexpansion.items.armor.ArmorGold;
import com.dmh10s.minecraftexpansion.items.armor.ArmorIron;
import com.dmh10s.minecraftexpansion.items.armor.ArmorKevlar;
import com.dmh10s.minecraftexpansion.items.armor.ArmorLead;
import com.dmh10s.minecraftexpansion.items.armor.ArmorNightVision;
import com.dmh10s.minecraftexpansion.items.armor.ArmorReinforced;
import com.dmh10s.minecraftexpansion.items.armor.ArmorRhondite;
import com.dmh10s.minecraftexpansion.items.armor.ArmorRuby;
import com.dmh10s.minecraftexpansion.items.armor.ArmorSteel;
import com.dmh10s.minecraftexpansion.items.crops.ItemCabbageSeed;
import com.dmh10s.minecraftexpansion.items.food.FoodBase;
import com.dmh10s.minecraftexpansion.items.food.HealBase;
import com.dmh10s.minecraftexpansion.items.tools.AluminumAxe;
import com.dmh10s.minecraftexpansion.items.tools.AluminumHoe;
import com.dmh10s.minecraftexpansion.items.tools.AluminumPickaxe;
import com.dmh10s.minecraftexpansion.items.tools.AluminumSpade;
import com.dmh10s.minecraftexpansion.items.tools.AluminumSword;
import com.dmh10s.minecraftexpansion.items.tools.CarbonFiberAxe;
import com.dmh10s.minecraftexpansion.items.tools.CarbonFiberHoe;
import com.dmh10s.minecraftexpansion.items.tools.CarbonFiberPickaxe;
import com.dmh10s.minecraftexpansion.items.tools.CarbonFiberSpade;
import com.dmh10s.minecraftexpansion.items.tools.CarbonFiberSword;
import com.dmh10s.minecraftexpansion.items.tools.CarbonSteelAxe;
import com.dmh10s.minecraftexpansion.items.tools.CarbonSteelHoe;
import com.dmh10s.minecraftexpansion.items.tools.CarbonSteelPickaxe;
import com.dmh10s.minecraftexpansion.items.tools.CarbonSteelSpade;
import com.dmh10s.minecraftexpansion.items.tools.CarbonSteelSword;
import com.dmh10s.minecraftexpansion.items.tools.FireAxe;
import com.dmh10s.minecraftexpansion.items.tools.FireHoe;
import com.dmh10s.minecraftexpansion.items.tools.FirePickaxe;
import com.dmh10s.minecraftexpansion.items.tools.FireSpade;
import com.dmh10s.minecraftexpansion.items.tools.FireSword;
import com.dmh10s.minecraftexpansion.items.tools.RhonditeAxe;
import com.dmh10s.minecraftexpansion.items.tools.RhonditeHoe;
import com.dmh10s.minecraftexpansion.items.tools.RhonditePickaxe;
import com.dmh10s.minecraftexpansion.items.tools.RhonditeSpade;
import com.dmh10s.minecraftexpansion.items.tools.RhonditeSword;
import com.dmh10s.minecraftexpansion.items.tools.RubyAxe;
import com.dmh10s.minecraftexpansion.items.tools.RubyHoe;
import com.dmh10s.minecraftexpansion.items.tools.RubyPickaxe;
import com.dmh10s.minecraftexpansion.items.tools.RubySpade;
import com.dmh10s.minecraftexpansion.items.tools.RubySword;
import com.dmh10s.minecraftexpansion.items.tools.SteelAxe;
import com.dmh10s.minecraftexpansion.items.tools.SteelHoe;
import com.dmh10s.minecraftexpansion.items.tools.SteelPickaxe;
import com.dmh10s.minecraftexpansion.items.tools.SteelSpade;
import com.dmh10s.minecraftexpansion.items.tools.SteelSword;
import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Creative Tabs
	public static final CreativeTabs ITEMS_TAB = (new CreativeTabs("tabItems") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.STEEL_INGOT);
		}
	});
	
	public static final CreativeTabs BLOCKS_TAB = (new CreativeTabs("tabBlocks") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.FOUNDRY);
		}
	});
	
	public static final CreativeTabs TOOLS_TAB = (new CreativeTabs("tabTools") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.STEEL_AXE);
		}
	});
	
	public static final CreativeTabs COMBAT_TAB = (new CreativeTabs("tabCombat") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.FIRE_SWORD);
		}
	});
	
	public static final CreativeTabs FOOD_TAB = (new CreativeTabs("tabFood") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.COOKED_TURKEY_DRUMSTICK);
		}
	});
	
	//Materials
	public static final ToolMaterial MATERIAL_ALUMINUM = EnumHelper.addToolMaterial("material_aluminum",  2, 400, 6.5F, 2.0F, 9).setRepairItem(new ItemStack(ModItems.ALUMINUM_INGOT));
	public static final ToolMaterial MATERIAL_BLAZE_POWDER = EnumHelper.addToolMaterial("material_blaze_powder",  3, 100, 9.0F, 3.0F, 20);
	public static final ToolMaterial MATERIAL_CARBON_FIBER = EnumHelper.addToolMaterial("material_carbon_fiber", 3, 1750, 8.5F, 3.5F, 10).setRepairItem(new ItemStack(ModItems.CARBON_FIBER_SHEET));
	public static final ToolMaterial MATERIAL_CARBON_STEEL = EnumHelper.addToolMaterial("material_carbon_steel", 3, 700, 6.0F, 2.75F, 9).setRepairItem(new ItemStack(ModItems.CARBON_STEEL_INGOT));
	public static final ToolMaterial MATERIAL_RHONDITE = EnumHelper.addToolMaterial("material_rhondite", 3, 600, 7.0F, 2.75F, 15).setRepairItem(new ItemStack(ModItems.RHONDITE));
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1600, 7.5F, 3.5F, 16).setRepairItem(new ItemStack(ModItems.RUBY));
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 500, 5.5F, 2.5F, 9).setRepairItem(new ItemStack(ModItems.STEEL_INGOT));
	
	public static final ArmorMaterial ARMOR_MATERIAL_ALUMINUM = EnumHelper.addArmorMaterial("armor_material_aluminum", Reference.MOD_ID + ":aluminum", 14, new int[] {2, 5, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.ALUMINUM_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_CARBON_FIBER = EnumHelper.addArmorMaterial("armor_material_carbon_fiber", Reference.MOD_ID + ":carbon_fiber", 16, new int[] {3, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(ModItems.CARBON_FIBER_SHEET));
	public static final ArmorMaterial ARMOR_MATERIAL_CARBON_STEEL = EnumHelper.addArmorMaterial("armor_material_carbon_steel", Reference.MOD_ID + ":carbon_steel", 14, new int[] {3, 6, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.CARBON_STEEL_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_KEVLAR = EnumHelper.addArmorMaterial("armor_material_kevlar", Reference.MOD_ID + ":kevlar", 17, new int[] {4, 7, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(ModItems.KEVLAR_SHEET));
	public static final ArmorMaterial ARMOR_MATERIAL_LEAD = EnumHelper.addArmorMaterial("armor_material_lead", Reference.MOD_ID + ":lead", 13, new int[] {2, 5, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.LEAD_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_NIGHT_VISION = EnumHelper.addArmorMaterial("armor_material_night_vision", Reference.MOD_ID + ":night_vision", 13, new int[] {0, 0, 0, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_RHONDITE = EnumHelper.addArmorMaterial("armor_material_rhondite", Reference.MOD_ID + ":rhondite", 14, new int[] {3, 6, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ModItems.RHONDITE));
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 16, new int[] {3, 7, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ModItems.RUBY));
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MOD_ID + ":steel", 13, new int[] {2, 5, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.STEEL_INGOT));
	
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_ALUMINUM = EnumHelper.addArmorMaterial("armor_material_enhanced_aluminum", Reference.MOD_ID + ":enhanced_aluminum", 14, new int[] {3, 7, 9, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.ALUMINUM_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_CARBON_FIBER = EnumHelper.addArmorMaterial("armor_material_enhanced_carbon_fiber", Reference.MOD_ID + ":enhanced_carbon_fiber", 16, new int[] {4, 8, 11, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(ModItems.CARBON_FIBER_SHEET));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_CARBON_STEEL = EnumHelper.addArmorMaterial("armor_material_enhanced_carbon_steel", Reference.MOD_ID + ":enhanced_carbon_steel", 14, new int[] {4, 8, 9, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.CARBON_STEEL_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_CHAIN = EnumHelper.addArmorMaterial("armor_material_enhanced_chain", Reference.MOD_ID + ":enhanced_chain", 13, new int[] {3, 6, 7, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(ModItems.CHAIN));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_DIAMOND = EnumHelper.addArmorMaterial("armor_material_enhanced_diamond", Reference.MOD_ID + ":enhanced_diamond", 15, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(Items.DIAMOND));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_GOLDEN = EnumHelper.addArmorMaterial("armor_material_enhanced_golden", Reference.MOD_ID + ":enhanced_golden", 12, new int[] {3, 5, 7, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F).setRepairItem(new ItemStack(Items.GOLD_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_IRON = EnumHelper.addArmorMaterial("armor_material_enhanced_iron", Reference.MOD_ID + ":enhanced_iron", 13, new int[] {3, 7, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Items.IRON_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_KEVLAR = EnumHelper.addArmorMaterial("armor_material_enhanced_kevlar", Reference.MOD_ID + ":enhanced_kevlar", 17, new int[] {4, 10, 12, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(ModItems.KEVLAR_SHEET));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_LEAD = EnumHelper.addArmorMaterial("armor_material_enhanced_lead", Reference.MOD_ID + ":enhanced_lead", 13, new int[] {3, 7, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.LEAD_INGOT));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_RHONDITE = EnumHelper.addArmorMaterial("armor_material_enhanced_rhondite", Reference.MOD_ID + ":enhanced_rhondite", 14, new int[] {4, 8, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ModItems.RHONDITE));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_RUBY = EnumHelper.addArmorMaterial("armor_material_enhanced_ruby", Reference.MOD_ID + ":enhanced_ruby", 16, new int[] {4, 9, 11, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ModItems.RUBY));
	public static final ArmorMaterial ARMOR_MATERIAL_ENHANCED_STEEL = EnumHelper.addArmorMaterial("armor_material_enhanced_steel", Reference.MOD_ID + ":enhanced_steel", 13, new int[] {4, 7, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(ModItems.STEEL_INGOT));
	
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_ALUMINUM = EnumHelper.addArmorMaterial("armor_material_reinforced_aluminum", Reference.MOD_ID + ":reinforced_aluminum", 16, new int[] {3, 7, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_CARBON_FIBER = EnumHelper.addArmorMaterial("armor_material_reinforced_carbon_fiber", Reference.MOD_ID + ":reinforced_carbon_fiber", 18, new int[] {3, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_CARBON_STEEL = EnumHelper.addArmorMaterial("armor_material_reinforced_carbon_steel", Reference.MOD_ID + ":reinforced_carbon_steel", 16, new int[] {3, 6, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_CHAIN = EnumHelper.addArmorMaterial("armor_material_reinforced_chain", Reference.MOD_ID + ":reinforced_chain", 15, new int[] {2, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_DIAMOND = EnumHelper.addArmorMaterial("armor_material_reinforced_diamond", Reference.MOD_ID + ":reinforced_diamond", 17, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_GOLDEN = EnumHelper.addArmorMaterial("armor_material_reinforced_golden", Reference.MOD_ID + ":reinforced_golden", 14, new int[] {2, 3, 5, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_IRON = EnumHelper.addArmorMaterial("armor_material_reinforced_iron", Reference.MOD_ID + ":reinforced_iron", 15, new int[] {2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_KEVLAR = EnumHelper.addArmorMaterial("armor_material_reinforced_kevlar", Reference.MOD_ID + ":reinforced_kevlar", 19, new int[] {4, 7, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_LEAD = EnumHelper.addArmorMaterial("armor_material_reinforced_lead", Reference.MOD_ID + ":reinforced_lead", 15, new int[] {2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_RHONDITE = EnumHelper.addArmorMaterial("armor_material_reinforced_rhondite", Reference.MOD_ID + ":reinforced_rhondite", 16, new int[] {3, 6, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_RUBY = EnumHelper.addArmorMaterial("armor_material_reinforced_ruby", Reference.MOD_ID + ":reinforced_ruby", 18, new int[] {3, 7, 9, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_STEEL = EnumHelper.addArmorMaterial("armor_material_reinforced_steel", Reference.MOD_ID + ":reinforced_steel", 15, new int[] {3, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	
	//Items
	public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot");
	public static final Item BELLOW = new ItemBase("bellow");
	public static final Item CARBON_FIBER = new ItemBase("carbon_fiber");
	public static final Item CARBON_FIBER_SHEET = new ItemBase("carbon_fiber_sheet");
	public static final Item CARBON_STEEL_INGOT = new ItemBase("carbon_steel_ingot");
	public static final Item CHAIN = new ItemBase("chain");
	public static final Item COKE = new ItemBase("coke");
	public static final Item KEVLAR_FIBER = new ItemBase("kevlar_fiber");
	public static final Item KEVLAR_SHEET = new ItemBase("kevlar_sheet");
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
	public static final Item MOLTEN_CARBON = new ItemBase("molten_carbon");
	public static final Item MOLTEN_IRON = new ItemBase("molten_iron");
	public static final Item RHONDITE = new ItemBase("rhondite");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	
	//Tools
	public static final ItemAxe ALUMINUM_AXE = new AluminumAxe("aluminum_axe", MATERIAL_ALUMINUM, 5.25F, -2.8F);
	public static final ItemHoe ALUMINUM_HOE = new AluminumHoe("aluminum_hoe", MATERIAL_ALUMINUM);
	public static final ItemPickaxe ALUMINUM_PICKAXE = new AluminumPickaxe("aluminum_pickaxe", MATERIAL_ALUMINUM);
	public static final ItemSpade ALUMINUM_SHOVEL = new AluminumSpade("aluminum_shovel", MATERIAL_ALUMINUM);
	public static final ItemSword ALUMINUM_SWORD = new AluminumSword("aluminum_sword", MATERIAL_ALUMINUM);
	public static final ItemAxe CARBON_FIBER_AXE = new CarbonFiberAxe("carbon_fiber_axe", MATERIAL_CARBON_FIBER, 6.5F, -2.8F);
	public static final ItemHoe CARBON_FIBER_HOE = new CarbonFiberHoe("carbon_fiber_hoe", MATERIAL_CARBON_FIBER);
	public static final ItemPickaxe CARBON_FIBER_PICKAXE = new CarbonFiberPickaxe("carbon_fiber_pickaxe", MATERIAL_CARBON_FIBER);
	public static final ItemSpade CARBON_FIBER_SHOVEL = new CarbonFiberSpade("carbon_fiber_shovel", MATERIAL_CARBON_FIBER);
	public static final ItemSword CARBON_FIBER_SWORD = new CarbonFiberSword("carbon_fiber_sword", MATERIAL_CARBON_FIBER);
	public static final ItemAxe CARBON_STEEL_AXE = new CarbonSteelAxe("carbon_steel_axe", MATERIAL_CARBON_STEEL, 5.75F, -3.2F);
	public static final ItemHoe CARBON_STEEL_HOE = new CarbonSteelHoe("carbon_steel_hoe", MATERIAL_CARBON_STEEL);
	public static final ItemPickaxe CARBON_STEEL_PICKAXE = new CarbonSteelPickaxe("carbon_steel_pickaxe", MATERIAL_CARBON_STEEL);
	public static final ItemSpade CARBON_STEEL_SHOVEL = new CarbonSteelSpade("carbon_steel_shovel", MATERIAL_CARBON_STEEL);
	public static final ItemSword CARBON_STEEL_SWORD = new CarbonSteelSword("carbon_steel_sword", MATERIAL_CARBON_STEEL);
	public static final ItemAxe FIRE_AXE = new FireAxe("fire_axe", MATERIAL_BLAZE_POWDER, 6.0F, -3.0F);
	public static final ItemHoe FIRE_HOE = new FireHoe("fire_hoe", MATERIAL_BLAZE_POWDER);
	public static final ItemPickaxe FIRE_PICKAXE = new FirePickaxe("fire_pickaxe", MATERIAL_BLAZE_POWDER);
	public static final ItemSpade FIRE_SHOVEL = new FireSpade("fire_shovel", MATERIAL_BLAZE_POWDER);
	public static final ItemSword FIRE_SWORD = new FireSword("fire_sword", MATERIAL_BLAZE_POWDER);
	public static final ItemAxe RHONDITE_AXE = new RhonditeAxe("rhondite_axe", MATERIAL_RHONDITE, 5.75F, -3.2F);
	public static final ItemHoe RHONDITE_HOE = new RhonditeHoe("rhondite_hoe", MATERIAL_RHONDITE);
	public static final ItemPickaxe RHONDITE_PICKAXE = new RhonditePickaxe("rhondite_pickaxe", MATERIAL_RHONDITE);
	public static final ItemSpade RHONDITE_SHOVEL = new RhonditeSpade("rhondite_shovel", MATERIAL_RHONDITE);
	public static final ItemSword RHONDITE_SWORD = new RhonditeSword("rhondite_sword", MATERIAL_RHONDITE);
	public static final ItemAxe RUBY_AXE = new RubyAxe("ruby_axe", MATERIAL_RUBY, 6.5F, -3.2F);
	public static final ItemHoe RUBY_HOE = new RubyHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new RubyPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new RubySpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemSword RUBY_SWORD = new RubySword("ruby_sword", MATERIAL_RUBY);
	public static final ItemAxe STEEL_AXE = new SteelAxe("steel_axe", MATERIAL_STEEL, 5.5F, -3.2F);
	public static final ItemHoe STEEL_HOE = new SteelHoe("steel_hoe", MATERIAL_STEEL);
	public static final ItemPickaxe STEEL_PICKAXE = new SteelPickaxe("steel_pickaxe", MATERIAL_STEEL);
	public static final ItemSpade STEEL_SHOVEL = new SteelSpade("steel_shovel", MATERIAL_STEEL);
	public static final ItemSword STEEL_SWORD = new SteelSword("steel_sword", MATERIAL_STEEL);
	
	//Armor
	public static final Item ALUMINUM_HELMET = new ArmorAluminum("aluminum_helmet", ARMOR_MATERIAL_ALUMINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item ALUMINUM_CHESTPLATE = new ArmorAluminum("aluminum_chestplate", ARMOR_MATERIAL_ALUMINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item ALUMINUM_LEGGINGS = new ArmorAluminum("aluminum_leggings", ARMOR_MATERIAL_ALUMINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item ALUMINUM_BOOTS = new ArmorAluminum("aluminum_boots", ARMOR_MATERIAL_ALUMINUM, 1, EntityEquipmentSlot.FEET);
	public static final Item CARBON_FIBER_HELMET = new ArmorCarbonFiber("carbon_fiber_helmet", ARMOR_MATERIAL_CARBON_FIBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CARBON_FIBER_CHESTPLATE = new ArmorCarbonFiber("carbon_fiber_chestplate", ARMOR_MATERIAL_CARBON_FIBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item CARBON_FIBER_LEGGINGS = new ArmorCarbonFiber("carbon_fiber_leggings", ARMOR_MATERIAL_CARBON_FIBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item CARBON_FIBER_BOOTS = new ArmorCarbonFiber("carbon_fiber_boots", ARMOR_MATERIAL_CARBON_FIBER, 1, EntityEquipmentSlot.FEET);
	public static final Item CARBON_STEEL_HELMET = new ArmorCarbonSteel("carbon_steel_helmet", ARMOR_MATERIAL_CARBON_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CARBON_STEEL_CHESTPLATE = new ArmorCarbonSteel("carbon_steel_chestplate", ARMOR_MATERIAL_CARBON_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item CARBON_STEEL_LEGGINGS = new ArmorCarbonSteel("carbon_steel_leggings", ARMOR_MATERIAL_CARBON_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item CARBON_STEEL_BOOTS = new ArmorCarbonSteel("carbon_steel_boots", ARMOR_MATERIAL_CARBON_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item KEVLAR_HELMET = new ArmorKevlar("kevlar_helmet", ARMOR_MATERIAL_KEVLAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item KEVLAR_CHESTPLATE = new ArmorKevlar("kevlar_chestplate", ARMOR_MATERIAL_KEVLAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item KEVLAR_LEGGINGS = new ArmorKevlar("kevlar_leggings", ARMOR_MATERIAL_KEVLAR, 2, EntityEquipmentSlot.LEGS);
	public static final Item KEVLAR_BOOTS = new ArmorKevlar("kevlar_boots", ARMOR_MATERIAL_KEVLAR, 1, EntityEquipmentSlot.FEET);
	public static final Item LEAD_HELMET = new ArmorLead("lead_helmet", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item LEAD_CHESTPLATE = new ArmorLead("lead_chestplate", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEAD_LEGGINGS = new ArmorLead("lead_leggings", ARMOR_MATERIAL_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEAD_BOOTS = new ArmorLead("lead_boots", ARMOR_MATERIAL_LEAD, 1, EntityEquipmentSlot.FEET);
	public static final Item NIGHT_VISION_VISOR = new ArmorNightVision("night_vision_visor", ARMOR_MATERIAL_NIGHT_VISION, 1, EntityEquipmentSlot.HEAD);
	public static final Item RHONDITE_HELMET = new ArmorRhondite("rhondite_helmet", ARMOR_MATERIAL_RHONDITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item RHONDITE_CHESTPLATE = new ArmorRhondite("rhondite_chestplate", ARMOR_MATERIAL_RHONDITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item RHONDITE_LEGGINGS = new ArmorRhondite("rhondite_leggings", ARMOR_MATERIAL_RHONDITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item RHONDITE_BOOTS = new ArmorRhondite("rhondite_boots", ARMOR_MATERIAL_RHONDITE, 1, EntityEquipmentSlot.FEET);
	public static final Item RUBY_HELMET = new ArmorRuby("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorRuby("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorRuby("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorRuby("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item STEEL_HELMET = new ArmorSteel("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorSteel("steel_chestplate", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorSteel("steel_leggings", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorSteel("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ENHANCED_ALUMINUM_HELMET = new ArmorAluminum("enhanced_aluminum_helmet", ARMOR_MATERIAL_ENHANCED_ALUMINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_ALUMINUM_CHESTPLATE = new ArmorAluminum("enhanced_aluminum_chestplate", ARMOR_MATERIAL_ENHANCED_ALUMINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_ALUMINUM_LEGGINGS = new ArmorAluminum("enhanced_aluminum_leggings", ARMOR_MATERIAL_ENHANCED_ALUMINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_ALUMINUM_BOOTS = new ArmorAluminum("enhanced_aluminum_boots", ARMOR_MATERIAL_ENHANCED_ALUMINUM, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_CARBON_FIBER_HELMET = new ArmorCarbonFiber("enhanced_carbon_fiber_helmet", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_CARBON_FIBER_CHESTPLATE = new ArmorCarbonFiber("enhanced_carbon_fiber_chestplate", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_CARBON_FIBER_LEGGINGS = new ArmorCarbonFiber("enhanced_carbon_fiber_leggings", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_CARBON_FIBER_BOOTS = new ArmorCarbonFiber("enhanced_carbon_fiber_boots", ARMOR_MATERIAL_ENHANCED_CARBON_FIBER, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_CARBON_STEEL_HELMET = new ArmorCarbonSteel("enhanced_carbon_steel_helmet", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_CARBON_STEEL_CHESTPLATE = new ArmorCarbonSteel("enhanced_carbon_steel_chestplate", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_CARBON_STEEL_LEGGINGS = new ArmorCarbonSteel("enhanced_carbon_steel_leggings", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_CARBON_STEEL_BOOTS = new ArmorCarbonSteel("enhanced_carbon_steel_boots", ARMOR_MATERIAL_ENHANCED_CARBON_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_CHAIN_HELMET = new ArmorChain("enhanced_chain_helmet", ARMOR_MATERIAL_ENHANCED_CHAIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_CHAIN_CHESTPLATE = new ArmorChain("enhanced_chain_chestplate", ARMOR_MATERIAL_ENHANCED_CHAIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_CHAIN_LEGGINGS = new ArmorChain("enhanced_chain_leggings", ARMOR_MATERIAL_ENHANCED_CHAIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_CHAIN_BOOTS = new ArmorChain("enhanced_chain_boots", ARMOR_MATERIAL_ENHANCED_CHAIN, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_DIAMOND_HELMET = new ArmorDiamond("enhanced_diamond_helmet", ARMOR_MATERIAL_ENHANCED_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_DIAMOND_CHESTPLATE = new ArmorDiamond("enhanced_diamond_chestplate", ARMOR_MATERIAL_ENHANCED_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_DIAMOND_LEGGINGS = new ArmorDiamond("enhanced_diamond_leggings", ARMOR_MATERIAL_ENHANCED_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_DIAMOND_BOOTS = new ArmorDiamond("enhanced_diamond_boots", ARMOR_MATERIAL_ENHANCED_DIAMOND, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_GOLDEN_HELMET = new ArmorGold("enhanced_golden_helmet", ARMOR_MATERIAL_ENHANCED_GOLDEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_GOLDEN_CHESTPLATE = new ArmorGold("enhanced_golden_chestplate", ARMOR_MATERIAL_ENHANCED_GOLDEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_GOLDEN_LEGGINGS = new ArmorGold("enhanced_golden_leggings", ARMOR_MATERIAL_ENHANCED_GOLDEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_GOLDEN_BOOTS = new ArmorGold("enhanced_golden_boots", ARMOR_MATERIAL_ENHANCED_GOLDEN, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_IRON_HELMET = new ArmorIron("enhanced_iron_helmet", ARMOR_MATERIAL_ENHANCED_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_IRON_CHESTPLATE = new ArmorIron("enhanced_iron_chestplate", ARMOR_MATERIAL_ENHANCED_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_IRON_LEGGINGS = new ArmorIron("enhanced_iron_leggings", ARMOR_MATERIAL_ENHANCED_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_IRON_BOOTS = new ArmorIron("enhanced_iron_boots", ARMOR_MATERIAL_ENHANCED_IRON, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_KEVLAR_HELMET = new ArmorKevlar("enhanced_kevlar_helmet", ARMOR_MATERIAL_ENHANCED_KEVLAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_KEVLAR_CHESTPLATE = new ArmorKevlar("enhanced_kevlar_chestplate", ARMOR_MATERIAL_ENHANCED_KEVLAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_KEVLAR_LEGGINGS = new ArmorKevlar("enhanced_kevlar_leggings", ARMOR_MATERIAL_ENHANCED_KEVLAR, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_KEVLAR_BOOTS = new ArmorKevlar("enhanced_kevlar_boots", ARMOR_MATERIAL_ENHANCED_KEVLAR, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_LEAD_HELMET = new ArmorLead("enhanced_lead_helmet", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_LEAD_CHESTPLATE = new ArmorLead("enhanced_lead_chestplate", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_LEAD_LEGGINGS = new ArmorLead("enhanced_lead_leggings", ARMOR_MATERIAL_ENHANCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_LEAD_BOOTS = new ArmorLead("enhanced_lead_boots", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_RHONDITE_HELMET = new ArmorRhondite("enhanced_rhondite_helmet", ARMOR_MATERIAL_ENHANCED_RHONDITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_RHONDITE_CHESTPLATE = new ArmorRhondite("enhanced_rhondite_chestplate", ARMOR_MATERIAL_ENHANCED_RHONDITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_RHONDITE_LEGGINGS = new ArmorRhondite("enhanced_rhondite_leggings", ARMOR_MATERIAL_ENHANCED_RHONDITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_RHONDITE_BOOTS = new ArmorRhondite("enhanced_rhondite_boots", ARMOR_MATERIAL_ENHANCED_RHONDITE, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_RUBY_HELMET = new ArmorRuby("enhanced_ruby_helmet", ARMOR_MATERIAL_ENHANCED_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_RUBY_CHESTPLATE = new ArmorRuby("enhanced_ruby_chestplate", ARMOR_MATERIAL_ENHANCED_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_RUBY_LEGGINGS = new ArmorRuby("enhanced_ruby_leggings", ARMOR_MATERIAL_ENHANCED_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_RUBY_BOOTS = new ArmorRuby("enhanced_ruby_boots", ARMOR_MATERIAL_ENHANCED_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item ENHANCED_STEEL_HELMET = new ArmorSteel("enhanced_steel_helmet", ARMOR_MATERIAL_ENHANCED_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENHANCED_STEEL_CHESTPLATE = new ArmorSteel("enhanced_steel_chestplate", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENHANCED_STEEL_LEGGINGS = new ArmorSteel("enhanced_steel_leggings", ARMOR_MATERIAL_ENHANCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENHANCED_STEEL_BOOTS = new ArmorSteel("enhanced_steel_boots", ARMOR_MATERIAL_ENHANCED_LEAD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item REINFORCED_ALUMINUM_HELMET = new ArmorReinforced("reinforced_aluminum_helmet", ARMOR_MATERIAL_REINFORCED_ALUMINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_ALUMINUM_CHESTPLATE = new ArmorReinforced("reinforced_aluminum_chestplate", ARMOR_MATERIAL_REINFORCED_ALUMINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_ALUMINUM_LEGGINGS = new ArmorReinforced("reinforced_aluminum_leggings", ARMOR_MATERIAL_REINFORCED_ALUMINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_ALUMINUM_BOOTS = new ArmorReinforced("reinforced_aluminum_boots", ARMOR_MATERIAL_REINFORCED_ALUMINUM, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_CARBON_FIBER_HELMET = new ArmorReinforced("reinforced_carbon_fiber_helmet", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_CARBON_FIBER_CHESTPLATE = new ArmorReinforced("reinforced_carbon_fiber_chestplate", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_CARBON_FIBER_LEGGINGS = new ArmorReinforced("reinforced_carbon_fiber_leggings", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_CARBON_FIBER_BOOTS = new ArmorReinforced("reinforced_carbon_fiber_boots", ARMOR_MATERIAL_REINFORCED_CARBON_FIBER, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_CARBON_STEEL_HELMET = new ArmorReinforced("reinforced_carbon_steel_helmet", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_CARBON_STEEL_CHESTPLATE = new ArmorReinforced("reinforced_carbon_steel_chestplate", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_CARBON_STEEL_LEGGINGS = new ArmorReinforced("reinforced_carbon_steel_leggings", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_CARBON_STEEL_BOOTS = new ArmorReinforced("reinforced_carbon_steel_boots", ARMOR_MATERIAL_REINFORCED_CARBON_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_CHAIN_HELMET = new ArmorReinforced("reinforced_chain_helmet", ARMOR_MATERIAL_REINFORCED_CHAIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_CHAIN_CHESTPLATE = new ArmorReinforced("reinforced_chain_chestplate", ARMOR_MATERIAL_REINFORCED_CHAIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_CHAIN_LEGGINGS = new ArmorReinforced("reinforced_chain_leggings", ARMOR_MATERIAL_REINFORCED_CHAIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_CHAIN_BOOTS = new ArmorReinforced("reinforced_chain_boots", ARMOR_MATERIAL_REINFORCED_CHAIN, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_DIAMOND_HELMET = new ArmorReinforced("reinforced_diamond_helmet", ARMOR_MATERIAL_REINFORCED_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_DIAMOND_CHESTPLATE = new ArmorReinforced("reinforced_diamond_chestplate", ARMOR_MATERIAL_REINFORCED_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_DIAMOND_LEGGINGS = new ArmorReinforced("reinforced_diamond_leggings", ARMOR_MATERIAL_REINFORCED_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_DIAMOND_BOOTS = new ArmorReinforced("reinforced_diamond_boots", ARMOR_MATERIAL_REINFORCED_DIAMOND, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_GOLDEN_HELMET = new ArmorReinforced("reinforced_golden_helmet", ARMOR_MATERIAL_REINFORCED_GOLDEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_GOLDEN_CHESTPLATE = new ArmorReinforced("reinforced_golden_chestplate", ARMOR_MATERIAL_REINFORCED_GOLDEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_GOLDEN_LEGGINGS = new ArmorReinforced("reinforced_golden_leggings", ARMOR_MATERIAL_REINFORCED_GOLDEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_GOLDEN_BOOTS = new ArmorReinforced("reinforced_golden_boots", ARMOR_MATERIAL_REINFORCED_GOLDEN, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_IRON_HELMET = new ArmorReinforced("reinforced_iron_helmet", ARMOR_MATERIAL_REINFORCED_IRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_IRON_CHESTPLATE = new ArmorReinforced("reinforced_iron_chestplate", ARMOR_MATERIAL_REINFORCED_IRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_IRON_LEGGINGS = new ArmorReinforced("reinforced_iron_leggings", ARMOR_MATERIAL_REINFORCED_IRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_IRON_BOOTS = new ArmorReinforced("reinforced_iron_boots", ARMOR_MATERIAL_REINFORCED_IRON, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_KEVLAR_HELMET = new ArmorReinforced("reinforced_kevlar_helmet", ARMOR_MATERIAL_REINFORCED_KEVLAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_KEVLAR_CHESTPLATE = new ArmorReinforced("reinforced_kevlar_chestplate", ARMOR_MATERIAL_REINFORCED_KEVLAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_KEVLAR_LEGGINGS = new ArmorReinforced("reinforced_kevlar_leggings", ARMOR_MATERIAL_REINFORCED_KEVLAR, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_KEVLAR_BOOTS = new ArmorReinforced("reinforced_kevlar_boots", ARMOR_MATERIAL_REINFORCED_KEVLAR, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_LEAD_HELMET = new ArmorReinforced("reinforced_lead_helmet", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_LEAD_CHESTPLATE = new ArmorReinforced("reinforced_lead_chestplate", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_LEAD_LEGGINGS = new ArmorReinforced("reinforced_lead_leggings", ARMOR_MATERIAL_REINFORCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_LEAD_BOOTS = new ArmorReinforced("reinforced_lead_boots", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_RHONDITE_HELMET = new ArmorReinforced("reinforced_rhondite_helmet", ARMOR_MATERIAL_REINFORCED_RHONDITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_RHONDITE_CHESTPLATE = new ArmorReinforced("reinforced_rhondite_chestplate", ARMOR_MATERIAL_REINFORCED_RHONDITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_RHONDITE_LEGGINGS = new ArmorReinforced("reinforced_rhondite_leggings", ARMOR_MATERIAL_REINFORCED_RHONDITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_RHONDITE_BOOTS = new ArmorReinforced("reinforced_rhondite_boots", ARMOR_MATERIAL_REINFORCED_RHONDITE, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_RUBY_HELMET = new ArmorReinforced("reinforced_ruby_helmet", ARMOR_MATERIAL_REINFORCED_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_RUBY_CHESTPLATE = new ArmorReinforced("reinforced_ruby_chestplate", ARMOR_MATERIAL_REINFORCED_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_RUBY_LEGGINGS = new ArmorReinforced("reinforced_ruby_leggings", ARMOR_MATERIAL_REINFORCED_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_RUBY_BOOTS = new ArmorReinforced("reinforced_ruby_boots", ARMOR_MATERIAL_REINFORCED_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item REINFORCED_STEEL_HELMET = new ArmorReinforced("reinforced_steel_helmet", ARMOR_MATERIAL_REINFORCED_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item REINFORCED_STEEL_CHESTPLATE = new ArmorReinforced("reinforced_steel_chestplate", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item REINFORCED_STEEL_LEGGINGS = new ArmorReinforced("reinforced_steel_leggings", ARMOR_MATERIAL_REINFORCED_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item REINFORCED_STEEL_BOOTS = new ArmorReinforced("reinforced_steel_boots", ARMOR_MATERIAL_REINFORCED_LEAD, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item CABBAGE = new FoodBase("cabbage", 4, 1.0F, false);
	public static final Item COOKED_BOAR_MEAT = new FoodBase("cooked_boar_meat", 8, 10.0F, true);
	public static final Item COOKED_TURKEY_BREAST = new FoodBase("cooked_turkey_breast", 7, 8.0F, true);
	public static final Item COOKED_TURKEY_DRUMSTICK = new FoodBase("cooked_turkey_drumstick", 4, 5.0F, true);
	public static final Item RAINBOW_APPLE = new FoodBase("rainbow_apple", 6, 2.4F, false);
	public static final Item RAINBOW_CARROT = new FoodBase("rainbow_carrot", 6, 3.6F, false);
	public static final Item RAW_BOAR_MEAT = new FoodBase("raw_boar_meat", 3, 0.5F, true);
	public static final Item RAW_TURKEY_BREAST = new FoodBase("raw_turkey_breast", 3, 0.5F, true);
	public static final Item RAW_TURKEY_DRUMSTICK = new FoodBase("raw_turkey_drumstick", 1, 0.25F, true);
	
	//Heals
	public static final Item MEDKIT = new HealBase("medkit", 0, 0, false);
	
	//Crops
	public static final Item CABBAGE_SEED = new ItemCabbageSeed("cabbage_seed");
}