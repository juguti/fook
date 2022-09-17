
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fook.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FookModTabs {
	public static CreativeModeTab TAB_FOOK;

	public static void load() {
		TAB_FOOK = new CreativeModeTab("tabfook") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CRACKED_DEEPSLATE_TILES);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
