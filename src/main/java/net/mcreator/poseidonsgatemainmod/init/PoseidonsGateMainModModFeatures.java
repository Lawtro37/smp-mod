
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.poseidonsgatemainmod.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.poseidonsgatemainmod.world.features.ores.SeaCrystalOreFeature;
import net.mcreator.poseidonsgatemainmod.PoseidonsGateMainModMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class PoseidonsGateMainModModFeatures {
	public static void load() {
		register("sea_crystal_ore", SeaCrystalOreFeature.feature(), SeaCrystalOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(PoseidonsGateMainModMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(PoseidonsGateMainModMod.MODID, registryName)));
	}
}
