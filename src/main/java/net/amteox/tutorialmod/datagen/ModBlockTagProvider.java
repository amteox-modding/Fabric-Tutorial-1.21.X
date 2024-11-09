package net.amteox.tutorialmod.datagen;

import net.amteox.tutorialmod.block.ModBlock;
import net.amteox.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlock.END_STONE_PALE_BLOCK)
                .add(ModBlock.ENDERIUM_ORE)
                .add(ModBlock.ENDERIUM_BLOCK)
                .add(ModBlock.END_MAGIC_BLOCK)
                .add(ModBlock.END_STONE_PILLAR);


        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlock.PALE_LEAVES);






        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlock.PALE_LOG)
                .add(ModBlock.PALE_WOOD)
                .add(ModBlock.PALE_PLANKS);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlock.PALE_LOG)
                .add(ModBlock.PALE_WOOD)
                .add(ModBlock.STRIPPED_PALE_LOG)
                .add(ModBlock.STRIPPED_PALE_WOOD);


        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlock.PALE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlock.PALE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlock.ENDERIUM_BLOCK)
                .add(ModBlock.ENDERIUM_ORE);


        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ENDERIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlock.ENDERIUM_BLOCK)
                .add(ModBlock.ENDERIUM_ORE);




    }
}
