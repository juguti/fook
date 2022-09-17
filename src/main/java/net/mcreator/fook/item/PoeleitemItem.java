
package net.mcreator.fook.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PoeleitemItem extends Item {
	public PoeleitemItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(64).rarity(Rarity.COMMON));
	}
}
