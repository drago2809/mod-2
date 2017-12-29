package com.drago2809.ModNaam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block tutorialBlock; // tutorial block
	public static Block copperBlock; //copper block
	public static Block copperOre; // copper ore
	public static Block siliconBlock; // silicon block
	public static Block siliconOre; // silicon ore
	public static Block steelBlock; // steel block
	public static Block aluminumBlock;
	public static Block aluminumOre;
	public static Block tutorialMultiOre;
	public static Block lithiumOre;
	public static Block lithiumBlock;
	
	public static Block naamBlok; // naamBlok = naam van het blok invullen
	
	public static void createBlocks() {
		
		GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block"); //tutorial block
		GameRegistry.registerBlock(copperBlock = new BasicBlock("copper_block"), "copper_block"); //copper block
		GameRegistry.registerBlock(copperOre = new ModBlockCopperOre("copper_ore", Material.IRON), "copper_ore");
		GameRegistry.registerBlock(siliconBlock = new BasicBlock("silicon_block"), "silicon_block"); // silicon block
		GameRegistry.registerBlock(siliconOre = new ModBlockAluminumOre("silicon_ore", Material.IRON), "silicon_ore"); // silicon ore
		GameRegistry.registerBlock(steelBlock = new BasicBlock("steel_block"), "steel_block");// steel block
		GameRegistry.registerBlock(aluminumBlock = new BasicBlock("aluminum_block"), "aluminum_block");
		GameRegistry.registerBlock(lithiumBlock = new BasicBlock( "lithium_block"), "lithium_block");
		GameRegistry.registerBlock(aluminumOre = new ModBlockAluminumOre("aluminum_ore", Material.IRON), "aluminum_ore"); 
		GameRegistry.registerBlock(tutorialMultiOre = new ModBlockMultiOre("tutorial_multi_ore", Material.IRON), "tutorial_multi_ore");
		GameRegistry.registerBlock(lithiumOre = new ModBlockLithiumOre("lithium_ore", Material.IRON), "lithium_ore");
		
		GameRegistry.registerBlock(naamBlok = new BasicBlock("naam_blok"), "naam_blok"); // naam_blok =naam van het blok invullen
	}

}
