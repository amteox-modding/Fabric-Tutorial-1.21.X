package net.amteox.tutorialmod.block.custom;

import net.amteox.tutorialmod.block.ModBlock;
import net.amteox.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class MagicBlock extends Block {


    public MagicBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player,pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1f,1f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if (entity instanceof ItemEntity itemEntity) {
            if (itemEntity.getStack().getItem() == ModBlock.ENDERIUM_ORE.asItem()) {

                itemEntity.setStack(new ItemStack(ModItems.ENDERIUM_SHARD, itemEntity.getStack().getCount()));


                int particleCount = 20; // Increase the number of particles for visibility
                double spread = 0.5; // Control the spread of the particles

                for (int i = 0; i < particleCount; i++) {
                    // Play the sound for every particle (you may want to reduce this to once per event)
                    world.playSound(entity, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_STEP, SoundCategory.BLOCKS, 1f, 1f);

                    // Spawn particles with a spread effect
                    world.addParticle(ParticleTypes.ENCHANT,
                            pos.getX() + 0.5,
                            pos.getY() + 1.5, // Increase height for more visibility
                            pos.getZ() + 0.5,
                            (world.random.nextDouble() - 0.5) * spread * 2, // More spread
                            (world.random.nextDouble()) * 2, // Positive upward movement
                            (world.random.nextDouble() - 0.5) * spread * 2); // More spread
                }
            }
        }

        if (entity instanceof ItemEntity itemEntity) {
            if (itemEntity.getStack().getItem() == Items.ENDER_PEARL) {

                itemEntity.setStack(new ItemStack(ModItems.END_DUST, itemEntity.getStack().getCount()));


                int particleCount = 20; // Increase the number of particles for visibility
                double spread = 0.5; // Control the spread of the particles

                for (int i = 0; i < particleCount; i++) {
                    // Play the sound for every particle (you may want to reduce this to once per event)
                    world.playSound(entity, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_STEP, SoundCategory.BLOCKS, 1f, 1f);

                    // Spawn particles with a spread effect
                    world.addParticle(ParticleTypes.ENCHANT,
                            pos.getX() + 0.5,
                            pos.getY() + 1.5, // Increase height for more visibility
                            pos.getZ() + 0.5,
                            (world.random.nextDouble() - 0.5) * spread * 2, // More spread
                            (world.random.nextDouble()) * 2, // Positive upward movement
                            (world.random.nextDouble() - 0.5) * spread * 2); // More spread
                }
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
