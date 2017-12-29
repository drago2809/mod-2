package com.drago2809.ModNaam.client.render.items;

import com.drago2809.ModNaam.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public final class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperIngot, 0, new ModelResourceLocation("dmm:copper_ingot", "inventory")); // tutorial item
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialItem, 0, new ModelResourceLocation("dmm:tutorial_item", "inventory")); //copper ingot
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.silicon, 0, new ModelResourceLocation("dmm:silicon", "inventory"));// silicon
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelIngot, 0, new ModelResourceLocation("dmm:steel_ingot", "inventory")); // steel ingot
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironPlate, 0, new ModelResourceLocation("dmm:iron_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.diamondPlate, 0, new ModelResourceLocation("dmm:diamond_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.woodenPlate, 0, new ModelResourceLocation("dmm:wooden_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelPlate, 0, new ModelResourceLocation("dmm:steel_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperPlate, 0, new ModelResourceLocation("dmm:copper_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.aluminumPlate, 0, new ModelResourceLocation("dmm:aluminum_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.siliconPlate, 0, new ModelResourceLocation("dmm:silicon_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.aluminum, 0, new ModelResourceLocation("dmm:aluminum", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironGear, 0, new ModelResourceLocation("dmm:iron_gear", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.diamondGear, 0, new ModelResourceLocation("dmm:diamond_gear", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelGear, 0, new ModelResourceLocation("dmm:steel_gear", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.lithiumIngot, 0, new ModelResourceLocation("dmm:lithium_ingot", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialSword, 0, new ModelResourceLocation("dmm:tutorial_sword", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialSpade, 0, new ModelResourceLocation("dmm:tutorial_spade", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialHoe, 0, new ModelResourceLocation("dmm:tutorial_hoe", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialAxe, 0, new ModelResourceLocation("dmm:tutorial_axe", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialPickaxe, 0, new ModelResourceLocation("dmm:tutorial_pickaxe", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.momSword, 0, new ModelResourceLocation("dmm:mom_sword", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.hammer, 0, new ModelResourceLocation("dmm:hammer", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.naamVoorwerp, 0, new ModelResourceLocation("dmm:naam_voorwerp", "inventory")); //naam van het voorwerp invullen
	}
}
	
	

