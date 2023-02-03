package com.dmh10s.minecraftexpansion.blocks.coke_furnace;

import java.util.Map;
import java.util.Map.Entry;

import com.dmh10s.minecraftexpansion.init.ModBlocks;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CokeFurnaceRecipes
{
	 	private static final CokeFurnaceRecipes INSTANCE = new CokeFurnaceRecipes();
	 	private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
	    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	    
	    public static CokeFurnaceRecipes getInstance()
	    {
	        return INSTANCE;
	    }
	    
	    public void addCokeFurnace(Item input, ItemStack result, float experience) 
	    {
	    	this.addCokeFurnaceRecipes(new ItemStack(input, 1, 32767), result, experience);

	    }
	    
	    public void addCokeFurnaceRecipes(ItemStack input, ItemStack stack, float experience)
	    {
	        if (getCokeFurnaceResult(input) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.log.info("Ignored smelting recipe with conflicting input: {} = {}", input, stack); return; }
	        this.smeltingList.put(input, stack);
	        this.experienceList.put(stack, Float.valueOf(experience));
	    }
	    
	    public ItemStack getCokeFurnaceResult(ItemStack input) 
	    {
	            for (Entry<ItemStack, ItemStack> entry : this.smeltingList.entrySet())
	            {
	                if (this.compareItemStacks(input, entry.getKey()))
	                {
	                    return entry.getValue();
	                }
	            }

	            return ItemStack.EMPTY;
	    }
	    
	    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	    {
	        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	    }
	    
	    public Map<ItemStack, ItemStack> getSmeltingList()
	    {
	        return this.smeltingList;
	    }
	    
	    public void addCokeFurnaceRecipeForBlock(Block block, ItemStack stack, float experience)
	    {
	        this.addCokeFurnace(Item.getItemFromBlock(block), stack, experience);
	    }
	    
	    public float getSmeltingExperience(ItemStack stack)
	    {
	        /*float ret = stack.getItem().getSmeltingExperience(stack);
	        if (ret != -1) return ret;*/

	        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
	        {
	            if (this.compareItemStacks(stack, entry.getKey()))
	            {
	                return ((Float)entry.getValue()).floatValue();
	            }
	        }

	        return 0.0F;
	    }

	private CokeFurnaceRecipes()
	{
		this.addCokeFurnaceRecipeForBlock(Blocks.IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.7F);
        this.addCokeFurnaceRecipeForBlock(Blocks.GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1.0F);
        this.addCokeFurnaceRecipeForBlock(Blocks.DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1.0F);
        this.addCokeFurnaceRecipeForBlock(Blocks.SAND, new ItemStack(Blocks.GLASS), 0.1F);
        this.addCokeFurnace(Items.PORKCHOP, new ItemStack(Items.COOKED_PORKCHOP), 0.35F);
        this.addCokeFurnace(Items.BEEF, new ItemStack(Items.COOKED_BEEF), 0.35F);
        this.addCokeFurnace(Items.CHICKEN, new ItemStack(Items.COOKED_CHICKEN), 0.35F);
        this.addCokeFurnace(Items.RABBIT, new ItemStack(Items.COOKED_RABBIT), 0.35F);
        this.addCokeFurnace(Items.MUTTON, new ItemStack(Items.COOKED_MUTTON), 0.35F);
        this.addCokeFurnaceRecipeForBlock(Blocks.COBBLESTONE, new ItemStack(Blocks.STONE), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.DEFAULT_META), new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.CRACKED_META), 0.1F);
        this.addCokeFurnace(Items.CLAY_BALL, new ItemStack(Items.BRICK), 0.3F);
        this.addCokeFurnaceRecipeForBlock(Blocks.CLAY, new ItemStack(Blocks.HARDENED_CLAY), 0.35F);
        this.addCokeFurnaceRecipeForBlock(Blocks.CACTUS, new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), 0.2F);
        this.addCokeFurnaceRecipeForBlock(Blocks.LOG, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addCokeFurnaceRecipeForBlock(Blocks.LOG2, new ItemStack(Items.COAL, 1, 1), 0.15F);
        this.addCokeFurnaceRecipeForBlock(Blocks.EMERALD_ORE, new ItemStack(Items.EMERALD), 1.0F);
        this.addCokeFurnace(Items.POTATO, new ItemStack(Items.BAKED_POTATO), 0.35F);
        this.addCokeFurnaceRecipeForBlock(Blocks.NETHERRACK, new ItemStack(Items.NETHERBRICK), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.SPONGE, 1, 1), new ItemStack(Blocks.SPONGE, 1, 0), 0.15F);
        this.addCokeFurnace(Items.CHORUS_FRUIT, new ItemStack(Items.CHORUS_FRUIT_POPPED), 0.1F);

        for (ItemFishFood.FishType itemfishfood$fishtype : ItemFishFood.FishType.values())
        {
            if (itemfishfood$fishtype.canCook())
            {
                this.addCokeFurnaceRecipes(new ItemStack(Items.FISH, 1, itemfishfood$fishtype.getMetadata()), new ItemStack(Items.COOKED_FISH, 1, itemfishfood$fishtype.getMetadata()), 0.35F);
            }
        }

        this.addCokeFurnaceRecipeForBlock(Blocks.COAL_ORE, new ItemStack(Items.COAL), 0.1F);
        this.addCokeFurnaceRecipeForBlock(Blocks.REDSTONE_ORE, new ItemStack(Items.REDSTONE), 0.7F);
        this.addCokeFurnaceRecipeForBlock(Blocks.LAPIS_ORE, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), 0.2F);
        this.addCokeFurnaceRecipeForBlock(Blocks.QUARTZ_ORE, new ItemStack(Items.QUARTZ), 0.2F);
        this.addCokeFurnace(Items.CHAINMAIL_HELMET, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.CHAINMAIL_CHESTPLATE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.CHAINMAIL_LEGGINGS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.CHAINMAIL_BOOTS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_PICKAXE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_SHOVEL, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_AXE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_HOE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_SWORD, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_HELMET, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_CHESTPLATE, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_LEGGINGS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_BOOTS, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.IRON_HORSE_ARMOR, new ItemStack(Items.IRON_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_PICKAXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_SHOVEL, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_AXE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_HOE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_SWORD, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_HELMET, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_CHESTPLATE, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_LEGGINGS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_BOOTS, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnace(Items.GOLDEN_HORSE_ARMOR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.WHITE.getMetadata()), new ItemStack(Blocks.WHITE_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.ORANGE.getMetadata()), new ItemStack(Blocks.ORANGE_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.MAGENTA.getMetadata()), new ItemStack(Blocks.MAGENTA_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIGHT_BLUE.getMetadata()), new ItemStack(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.YELLOW.getMetadata()), new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIME.getMetadata()), new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PINK.getMetadata()), new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GRAY.getMetadata()), new ItemStack(Blocks.GRAY_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.SILVER.getMetadata()), new ItemStack(Blocks.SILVER_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.CYAN.getMetadata()), new ItemStack(Blocks.CYAN_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PURPLE.getMetadata()), new ItemStack(Blocks.PURPLE_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLUE.getMetadata()), new ItemStack(Blocks.BLUE_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BROWN.getMetadata()), new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GREEN.getMetadata()), new ItemStack(Blocks.GREEN_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.RED.getMetadata()), new ItemStack(Blocks.RED_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnaceRecipes(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLACK.getMetadata()), new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA), 0.1F);
        this.addCokeFurnace(Items.COAL, new ItemStack(ModItems.COKE, 1), 0);
        this.addCokeFurnaceRecipeForBlock(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT, 1), 1.0F);
        this.addCokeFurnace(ModItems.RAW_BOAR_MEAT, new ItemStack(ModItems.COOKED_BOAR_MEAT, 1), 1.0f);
        this.addCokeFurnace(ModItems.RAW_TURKEY_BREAST, new ItemStack(ModItems.COOKED_TURKEY_BREAST, 1), 0.35f);
		this.addCokeFurnace(ModItems.RAW_TURKEY_DRUMSTICK, new ItemStack(ModItems.COOKED_TURKEY_DRUMSTICK, 1), 0.35f);
		this.addCokeFurnaceRecipeForBlock(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT, 1), 0.7f);
		this.addCokeFurnaceRecipeForBlock(ModBlocks.ENDER_ORE, new ItemStack(Items.ENDER_PEARL, 1), 0.2F);
		this.addCokeFurnaceRecipeForBlock(ModBlocks.FOSSILIZED_STONE, new ItemStack(Items.BONE, 1), 0.1F);
		this.addCokeFurnaceRecipeForBlock(ModBlocks.NETHER_GOLD_ORE, new ItemStack(Items.GOLD_INGOT, 1), 1.0F);
		this.addCokeFurnaceRecipeForBlock(ModBlocks.RHONDITE_ORE, new ItemStack(ModItems.RHONDITE, 1), 0.7F);
		this.addCokeFurnaceRecipeForBlock(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 1.0F);
	}
}
