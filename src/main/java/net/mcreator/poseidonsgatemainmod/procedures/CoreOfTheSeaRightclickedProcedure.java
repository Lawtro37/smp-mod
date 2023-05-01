package net.mcreator.poseidonsgatemainmod.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.poseidonsgatemainmod.PoseidonsGateMainModMod;

import java.util.Map;

public class CoreOfTheSeaRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PoseidonsGateMainModMod.LOGGER.warn("Failed to load dependency entity for procedure CoreOfTheSeaRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getY() < 0) {
			if (entity.isInWater()) {
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("poseidons_gate_main_mod:the_depths"));
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1, nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
		}
	}
}
