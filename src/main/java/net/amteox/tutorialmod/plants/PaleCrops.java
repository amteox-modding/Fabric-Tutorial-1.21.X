package net.amteox.tutorialmod.plants;

import com.mojang.serialization.MapCodec;
import net.amteox.tutorialmod.block.ModBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class PaleCrops extends PlantBlock {
    public PaleCrops(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        // Check if the block is end_stone_pale_grass_block
        return floor.isOf(ModBlock.END_STONE_PALE_BLOCK) || super.canPlantOnTop(floor, world, pos);
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return null;
    }
}
