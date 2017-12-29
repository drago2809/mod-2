package com.drago2809.ModNaam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	//public static ToolMaterial Tutorial = EnumHelper.addToolMaterial("Naam materiaal van gereedschap", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	public static ToolMaterial Tutorial = EnumHelper.addToolMaterial("TUTORIAL", 2, 1561, 8.0F, 7.0F, 10);
	public static ToolMaterial Copper = EnumHelper.addToolMaterial("COPPER", 999999999, 999999999, 99999999999999999999999999999999999999F, 99999999999999999999999999999999999999F, 999999999);
	public static Item tutorialSword;
	public static Item tutorialSpade;
	public static Item tutorialHoe;
	public static Item tutorialAxe;
	public static Item chainsaw;
	public static Item tutorialPickaxe;
	public static Item momSword;
	public static Item hammer;
	
	
	
	public static Item copperIngot;// copper ingot
	public static Item tutorialItem; // tutorial item
	public static Item silicon; //silicon
	public static Item steelIngot; // steel ingot
	public static Item ironPlate;// iron plate
	public static Item diamondPlate;// diamond plate
	public static Item woodenPlate;// wooden Plate
	public static Item steelPlate;// steel plate
	public static Item copperPlate;// copper plate
	public static Item aluminumPlate;// aluminum plate
	public static Item siliconPlate; // silicon plate
	public static Item aluminum; // aluminum
	public static Item ironGear;
	public static Item diamondGear;
	public static Item steelGear;
	public static Item lithiumIngot;
	
	public static Item naamVoorwerp; // naam van het voorwerp
	
	public static void createItems() {
		GameRegistry.registerItem(copperIngot = new BasicItem("copper_ingot"), "copper_ingot");
		GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(silicon = new BasicItem("silicon"), "silicon");
		GameRegistry.registerItem(steelIngot = new BasicItem("steel_ingot"), "steel_ingot");
		GameRegistry.registerItem(ironPlate = new BasicItem("iron_plate"), "iron_plate");
		GameRegistry.registerItem(diamondPlate = new BasicItem("diamond_plate"), "diamond_plate");
		GameRegistry.registerItem(woodenPlate = new BasicItem("wooden_plate"), "wooden_plate");
		GameRegistry.registerItem(steelPlate = new BasicItem("steel_plate"), "steel_plate");
		GameRegistry.registerItem(copperPlate = new BasicItem("copper_plate"), "copper_plate");
		GameRegistry.registerItem(aluminumPlate = new BasicItem("aluminum_plate"), "aluminum_plate");
		GameRegistry.registerItem(siliconPlate = new BasicItem("silicon_plate"), "silicon_plate");
		GameRegistry.registerItem(aluminum = new BasicItem("aluminum"), "aluminum");
		GameRegistry.registerItem(ironGear = new BasicItem("iron_gear"), "iron_gear");
		GameRegistry.registerItem(diamondGear = new BasicItem("diamond_gear"), "diamond_gear");
		GameRegistry.registerItem(steelGear = new BasicItem("steel_gear"), "steel_gear");
		GameRegistry.registerItem(lithiumIngot = new BasicItem("lithium_ingot"), "lithium_ingot");
		
		//GameRegistry.registerItem(tutorialAxe = new BasicItem("tutorial_axe"), "tutorial_axe");
		
		GameRegistry.registerItem(naamVoorwerp = new BasicItem("naam_voorwerp"), "naam_voorwerp");
		
		GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", Tutorial), "tutorial_sword");
		GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", Tutorial), "tutorial_spade");
		GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", Tutorial), "tutorial_hoe");
		//GameRegistry.registerItem(tutorialAxe = new ItemModChainsaw("tutorial_axe", Tutorial), "tutorial_axe"); 
		//GameRegistry.registerItem(tutorialAxe = new ItemModAxe("tutorial_axe", Tutorial), "tutorial_axe");
		GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", Tutorial), "tutorial_pickaxe");
		GameRegistry.registerItem(momSword = new ItemModSword("mom_sword", Tutorial), "mom_sword");
		GameRegistry.registerItem(hammer = new BasicItem("hammer"), "hammer");
		}
	
	public static final CreativeTabs tabModNaam = new CreativeTabs("modnaam") {
		@Override public Item getTabIconItem() {
			return ModItems.copperIngot;
		}
	};
}
