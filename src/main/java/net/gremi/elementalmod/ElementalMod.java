package net.gremi.elementalmod;

import net.fabricmc.api.ModInitializer;

import net.gremi.elementalmod.block.ElementalModBlocks;
import net.gremi.elementalmod.item.ElementalModItemGroups;
import net.gremi.elementalmod.item.ElementalModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementalMod implements ModInitializer {
	public static final String MOD_ID = "elementalmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ElementalModItemGroups.registerItemGroups();
        ElementalModItems.registerModItems();
        ElementalModBlocks.registerModBlocks();
	}
}