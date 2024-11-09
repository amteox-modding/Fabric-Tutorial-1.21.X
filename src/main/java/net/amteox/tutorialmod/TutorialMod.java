package net.amteox.tutorialmod;

import net.amteox.tutorialmod.block.ModBlock;
import net.amteox.tutorialmod.item.ModItemGroups;
import net.amteox.tutorialmod.item.ModItems;
import net.amteox.tutorialmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlock.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}