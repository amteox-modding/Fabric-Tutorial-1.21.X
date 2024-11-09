package net.amteox.tutorialmod.datagen;

import net.amteox.tutorialmod.block.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlock.END_STONE_PALE_BLOCK);
        addDrop(ModBlock.ENDERIUM_ORE);
        addDrop(ModBlock.ENDERIUM_BLOCK);
        addDrop(ModBlock.PALE_LOG);
        addDrop(ModBlock.PALE_WOOD);
        addDrop(ModBlock.STRIPPED_PALE_LOG);
        addDrop(ModBlock.STRIPPED_PALE_LOG);
        addDrop(ModBlock.PALE_PLANKS);
        addDrop(ModBlock.END_MAGIC_BLOCK);
        addDrop(ModBlock.END_STONE_PILLAR);


        addDrop(ModBlock.PALE_STAIRS);
        addDrop(ModBlock.PALE_SLAB, slabDrops(ModBlock.PALE_SLAB));
        addDrop(ModBlock.PALE_BUTTON);
        addDrop(ModBlock.PALE_PRESSURE_PLATE);
        addDrop(ModBlock.PALE_FENCE);
        addDrop(ModBlock.PALE_FENCE_GATE);
        addDrop(ModBlock.PALE_DOOR, doorDrops(ModBlock.PALE_DOOR));
        addDrop(ModBlock.PALE_TRAPDOOR);


        addDrop(ModBlock.ENDERIUM_BLOCK);
//        addDrop(ModBlock.CRUSHING_STATION_BLOCK);
        addDrop(ModBlock.ENDERIUM_ORE);
//        addDrop(ModBlock.PALE_GRASS);


        addDrop(ModBlock.PALE_LEAVES, leavesDrops(ModBlock.PALE_LEAVES, ModBlock.PALE_SAPLING, 0.0025f));


    }
}
