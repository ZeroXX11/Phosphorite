package net.zeroxxii.phosphorite;

import net.fabricmc.api.ModInitializer;

import net.zeroxxii.phosphorite.item.ModItemGroups;
import net.zeroxxii.phosphorite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Phosphorite implements ModInitializer {
	public static final String MOD_ID = "phosphorite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
	}
}