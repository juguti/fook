
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fook.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fook.block.entity.PlachauffanteBlockEntity;
import net.mcreator.fook.FookMod;

public class FookModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FookMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PLACHAUFFANTE = register("plachauffante", FookModBlocks.PLACHAUFFANTE,
			PlachauffanteBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
