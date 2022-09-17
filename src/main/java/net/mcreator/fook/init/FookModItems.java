
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fook.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fook.item.SteakoeufItem;
import net.mcreator.fook.item.PoeleitemItem;
import net.mcreator.fook.item.GraineItem;
import net.mcreator.fook.FookMod;

public class FookModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FookMod.MODID);
	public static final RegistryObject<Item> PLACHAUFFANTE = block(FookModBlocks.PLACHAUFFANTE, FookModTabs.TAB_FOOK);
	public static final RegistryObject<Item> STEAKOEUF = REGISTRY.register("steakoeuf", () -> new SteakoeufItem());
	public static final RegistryObject<Item> GRAINE = REGISTRY.register("graine", () -> new GraineItem());
	public static final RegistryObject<Item> SALADESTADE_0 = block(FookModBlocks.SALADESTADE_0, null);
	public static final RegistryObject<Item> POELE = block(FookModBlocks.POELE, null);
	public static final RegistryObject<Item> POELEITEM = REGISTRY.register("poeleitem", () -> new PoeleitemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
