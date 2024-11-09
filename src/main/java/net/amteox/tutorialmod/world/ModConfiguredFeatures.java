package net.amteox.tutorialmod.world;

import net.amteox.tutorialmod.TutorialMod;
import net.amteox.tutorialmod.block.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {


    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERIUM_ORE_KEY = registerKey("enderium_ore");

    public static final RegistryKey<ConfiguredFeature<?,?>> PALE_KEY = registerKey("pale");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){

        RuleTest endReplacables  = new BlockMatchRuleTest(Blocks.END_STONE);


        List <OreFeatureConfig.Target> enderiumOre =
                List.of(OreFeatureConfig.createTarget(endReplacables, ModBlock.ENDERIUM_ORE.getDefaultState()));

        register(context,ENDERIUM_ORE_KEY,Feature.ORE, new OreFeatureConfig(enderiumOre, 2));



        register(context,PALE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlock.PALE_LOG),
                new StraightTrunkPlacer(5,4,3),
                BlockStateProvider.of(ModBlock.PALE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create((2)),4),
                new TwoLayersFeatureSize(5,4,3)).build());

    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        // Use the Identifier constructor correctly
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.tryParse(TutorialMod.MOD_ID + ":" + name));
    }

    // Your register method remains the same
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }


}
