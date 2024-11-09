package net.amteox.tutorialmod.datagen;


import net.amteox.tutorialmod.block.ModBlock;
import net.amteox.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;



import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture, null);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {






        getOrCreateTagBuilder(ItemTags.STONE_BRICKS)
                .add(ModBlock.END_STONE_PALE_BLOCK.asItem())
                .add(ModBlock.ENDERIUM_ORE.asItem())
                .add(ModBlock.ENDERIUM_BLOCK.asItem())
                .add(ModBlock.PALE_GRASS.asItem())
                .add(ModBlock.PALE_BUSH.asItem())
                .add(ModBlock.PALE_STEM.asItem())
                .add(ModBlock.PALE_ROOT.asItem())
                .add(ModBlock.PALE_ROOTS.asItem())
                .add(ModBlock.END_MAGIC_BLOCK.asItem())
                .add(ModBlock.END_STONE_PILLAR.asItem());




        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlock.PALE_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlock.PALE_LOG.asItem())
                .add(ModBlock.PALE_WOOD.asItem())
                .add(ModBlock.STRIPPED_PALE_LOG.asItem())
                .add(ModBlock.STRIPPED_PALE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.WOOL)
                .add(ModItems.ENDERIUM_INGOT)
                .add(ModItems.END_DUST)
                .add(ModItems.ENDERIUM_SHARD)
                .add(ModBlock.PALE_LEAVES.asItem());


        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.ENDERIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.ENDERIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.ENDERIUM_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.ENDERIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.ENDERIUM_HOE);











    }
}
