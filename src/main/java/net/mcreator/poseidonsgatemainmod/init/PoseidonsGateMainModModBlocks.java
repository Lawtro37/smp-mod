
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poseidonsgatemainmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.poseidonsgatemainmod.block.SeaStoneBlock;
import net.mcreator.poseidonsgatemainmod.block.SeaCrystalOreBlock;
import net.mcreator.poseidonsgatemainmod.block.SeaCrystalBlockBlock;
import net.mcreator.poseidonsgatemainmod.PoseidonsGateMainModMod;

public class PoseidonsGateMainModModBlocks {
	public static Block SEA_STONE;
	public static Block SEA_CRYSTAL_ORE;
	public static Block SEA_CRYSTAL_BLOCK;

	public static void load() {
		SEA_STONE = Registry.register(Registry.BLOCK, new ResourceLocation(PoseidonsGateMainModMod.MODID, "sea_stone"), new SeaStoneBlock());
		SEA_CRYSTAL_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(PoseidonsGateMainModMod.MODID, "sea_crystal_ore"), new SeaCrystalOreBlock());
		SEA_CRYSTAL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(PoseidonsGateMainModMod.MODID, "sea_crystal_block"), new SeaCrystalBlockBlock());
	}

	public static void clientLoad() {
		SeaStoneBlock.clientInit();
		SeaCrystalOreBlock.clientInit();
		SeaCrystalBlockBlock.clientInit();
	}
}
