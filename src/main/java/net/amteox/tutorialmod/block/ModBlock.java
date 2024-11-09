package net.amteox.tutorialmod.block;

import net.amteox.tutorialmod.TutorialMod;
//import net.amteox.tutorialmod.block.entity.CrushingStationBlockEntity;
import net.amteox.tutorialmod.block.custom.MagicBlock;
import net.amteox.tutorialmod.plants.PaleCrops;
import net.amteox.tutorialmod.world.tree.PaleSaplingGenerator;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

import static net.amteox.tutorialmod.world.tree.PaleSaplingGenerator.PALE;

public class ModBlock {



    public static final Block END_STONE_PALE_BLOCK = registerBlock("end_stone_pale_grass_block",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE)));

    public static final Block PALE_LOG = registerBlock("pale_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block PALE_WOOD = registerBlock("pale_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block STRIPPED_PALE_LOG = registerBlock("stripped_pale_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block STRIPPED_PALE_WOOD = registerBlock("stripped_pale_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f).sounds((BlockSoundGroup.WOOD))));

    public static final Block PALE_PLANKS = registerBlock("pale_planks",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f).sounds((BlockSoundGroup.WOOD))));

    //Wyroby

    public static final Block PALE_STAIRS = registerBlock("pale_stairs",
            new StairsBlock(ModBlock.PALE_PLANKS.getDefaultState(),
            AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_SLAB = registerBlock("pale_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));


    public static final Block PALE_BUTTON = registerBlock("pale_button",
            new ButtonBlock(BlockSetType.IRON,5, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_PRESSURE_PLATE = registerBlock("pale_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));


    public static final Block PALE_FENCE = registerBlock("pale_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_FENCE_GATE = registerBlock("pale_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD)));


    public static final Block PALE_DOOR = registerBlock("pale_door",
            new DoorBlock(BlockSetType.ACACIA,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_TRAPDOOR = registerBlock("pale_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque().sounds(BlockSoundGroup.WOOD)));

    public static final Block PALE_LEAVES = registerBlock("pale_leaves",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES)));


    public static final Block PALE_SAPLING = registerBlock("pale_sapling",
            new SaplingBlock(PALE, AbstractBlock.Settings.create().strength(1f).requiresTool().nonOpaque().noCollision().sounds(BlockSoundGroup.CHERRY_SAPLING)));

    public static final Block PALE_GRASS = registerBlock("pale_grass",
            new PaleCrops(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));

    public static final Block PALE_STEM = registerBlock("pale_stem",
            new PaleCrops(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));

    public static final Block PALE_ROOT = registerBlock("pale_root",
            new PaleCrops( AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));

    public static final Block PALE_BUSH = registerBlock("pale_bush",
            new PaleCrops(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));

    public static final Block PALE_ROOTS = registerBlock("pale_roots",
            new PaleCrops( AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).nonOpaque().noCollision()));

    public static final Block ENDERIUM_ORE = registerBlock("enderium_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ENDERIUM_BLOCK = registerBlock("enderium_block",
            new Block(AbstractBlock.Settings.create().strength(6f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block END_MAGIC_BLOCK = registerBlock("end_magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR).strength(3f).sounds((BlockSoundGroup.STONE))));



//    public static final Block CRUSHING_STATION_BLOCK = registerBlock("crushing_station_block",
//            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));




    private static Block registerBlock(String name, Block block){
        registerBlocksItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID,name), block);

    }

    private static void registerBlocksItem(String name, Block block) {

        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }




    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering Mod Blocks for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlock.END_STONE_PALE_BLOCK);
            entries.add(ModBlock.PALE_LOG);
            entries.add(ModBlock.PALE_WOOD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {

        });
    }

}
