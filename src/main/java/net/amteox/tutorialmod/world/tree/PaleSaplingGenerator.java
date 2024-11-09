package net.amteox.tutorialmod.world.tree;


import net.amteox.tutorialmod.world.ModConfiguredFeatures;

import net.amteox.tutorialmod.world.ModPlacedFeatures;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

public class PaleSaplingGenerator {


    public static final SaplingGenerator PALE = new SaplingGenerator(
            "pale",
            2F,
            Optional.of(ModConfiguredFeatures.PALE_KEY),
            Optional.of(ModConfiguredFeatures.PALE_KEY),
            Optional.of(ModConfiguredFeatures.PALE_KEY),
            Optional.empty(),
            Optional.empty(),
            Optional.empty()
    );






    protected RegistryKey<ConfiguredFeature<?,?>> getTreeFeature(Random random, boolean bees)
    {
        return ModConfiguredFeatures.PALE_KEY;
    }

}
