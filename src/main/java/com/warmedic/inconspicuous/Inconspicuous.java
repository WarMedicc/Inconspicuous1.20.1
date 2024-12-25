package com.warmedic.inconspicuous;

import com.warmedic.inconspicuous.Item.ModItemGroups;
import com.warmedic.inconspicuous.Item.ModItems;
import com.warmedic.inconspicuous.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inconspicuous implements ModInitializer {
	public static final String MOD_ID = "inconspicuous";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}