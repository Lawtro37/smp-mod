/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.poseidonsgatemainmod;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.nbt.CompoundTag;

import net.mcreator.poseidonsgatemainmod.init.PoseidonsGateMainModModProcedures;
import net.mcreator.poseidonsgatemainmod.init.PoseidonsGateMainModModItems;
import net.mcreator.poseidonsgatemainmod.init.PoseidonsGateMainModModBlocks;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.api.ModInitializer;

public class PoseidonsGateMainModMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "poseidons_gate_main_mod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PoseidonsGateMainModMod");

		PoseidonsGateMainModModBlocks.load();
		PoseidonsGateMainModModItems.load();

		PoseidonsGateMainModModProcedures.load();

		GeckoLib.initialize();
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			if (handler.getPlayer().getExtraCustomData().getCompound("PlayerPersisted").isEmpty()) {
				handler.getPlayer().getExtraCustomData().put("PlayerPersisted", new CompoundTag());
			}
			PoseidonsGateMainModMod.LOGGER.info(handler.getPlayer().getExtraCustomData());
		});
	}
}
