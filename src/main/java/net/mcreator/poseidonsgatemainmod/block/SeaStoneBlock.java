
package net.mcreator.poseidonsgatemainmod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.poseidonsgatemainmod.init.PoseidonsGateMainModModBlocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class SeaStoneBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = FabricBlockSettings.of(Material.METAL, MaterialColor.ICE).requiresCorrectToolForDrops().sound(SoundType.TUFF).strength(5f, 20f).lightLevel(s -> 2).requiresCorrectToolForDrops().friction(0.7f)
			.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true);

	public SeaStoneBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(PoseidonsGateMainModModBlocks.SEA_STONE, RenderType.solid());
	}
}
