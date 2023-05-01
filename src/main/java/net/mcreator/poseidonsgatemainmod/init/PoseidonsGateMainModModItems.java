
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poseidonsgatemainmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.poseidonsgatemainmod.item.CoreOfTheSeaItem;
import net.mcreator.poseidonsgatemainmod.PoseidonsGateMainModMod;

public class PoseidonsGateMainModModItems {
	public static Item SEA_STONE;
	public static Item CORE_OF_THE_SEA;

	public static void load() {
		SEA_STONE = Registry.register(Registry.ITEM, new ResourceLocation(PoseidonsGateMainModMod.MODID, "sea_stone"), new BlockItem(PoseidonsGateMainModModBlocks.SEA_STONE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		CORE_OF_THE_SEA = Registry.register(Registry.ITEM, new ResourceLocation(PoseidonsGateMainModMod.MODID, "core_of_the_sea"), new CoreOfTheSeaItem());
	}
}
