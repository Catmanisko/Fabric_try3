package net.catman.cndemod;

import net.catman.cndemod.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.catman.cndemod.block.ModBlocks;
import net.catman.cndemod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "cndemod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// A Comment
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		GeckoLib.initialize();
		ModRegistries.registerModStuffs();

	}
}
