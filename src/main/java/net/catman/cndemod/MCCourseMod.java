package net.catman.cndemod;

import net.fabricmc.api.ModInitializer;
import net.catman.cndemod.block.ModBlocks;
import net.catman.cndemod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "cndemod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// A Comment
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}
}
