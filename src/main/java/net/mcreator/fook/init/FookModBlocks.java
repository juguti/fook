
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fook.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.fook.block.Saladestade0Block;
import net.mcreator.fook.block.PoeleBlock;
import net.mcreator.fook.block.PlachauffanteBlock;
import net.mcreator.fook.FookMod;

public class FookModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FookMod.MODID);
	public static final RegistryObject<Block> PLACHAUFFANTE = REGISTRY.register("plachauffante", () -> new PlachauffanteBlock());
	public static final RegistryObject<Block> SALADESTADE_0 = REGISTRY.register("saladestade_0", () -> new Saladestade0Block());
	public static final RegistryObject<Block> POELE = REGISTRY.register("poele", () -> new PoeleBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Saladestade0Block.registerRenderLayer();
			PoeleBlock.registerRenderLayer();
		}
	}
}
