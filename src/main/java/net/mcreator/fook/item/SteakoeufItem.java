
package net.mcreator.fook.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.fook.init.FookModTabs;

public class SteakoeufItem extends Item {
	public SteakoeufItem() {
		super(new Item.Properties().tab(FookModTabs.TAB_FOOK).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f)

						.build()));
	}
}
