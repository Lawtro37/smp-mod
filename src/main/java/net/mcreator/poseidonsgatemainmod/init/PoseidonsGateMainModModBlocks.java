
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poseidonsgatemainmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.poseidonsgatemainmod.block.SeaStoneBlock;
import net.mcreator.poseidonsgatemainmod.PoseidonsGateMainModMod;

public class PoseidonsGateMainModModBlocks {
	public static Block SEA_STONE;

	public static void load() {
		SEA_STONE = Registry.register(Registry.BLOCK, new ResourceLocation(PoseidonsGateMainModMod.MODID, "sea_stone"), new SeaStoneBlock());
	}

	public static void clientLoad() {
		SeaStoneBlock.clientInit();
	}
}
