package net.elumni.dawnarchway;

import item.ModItemGroups;
import item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchwayOfDawn implements ModInitializer {
	public static final String MOD_ID = "archway-of-dawn";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}