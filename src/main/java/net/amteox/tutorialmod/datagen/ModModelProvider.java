package net.amteox.tutorialmod.datagen;

import net.amteox.tutorialmod.block.ModBlock;
import net.amteox.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlock.PALE_LOG).log(ModBlock.PALE_LOG).wood(ModBlock.PALE_WOOD);
        blockStateModelGenerator.registerLog(ModBlock.STRIPPED_PALE_LOG).log(ModBlock.STRIPPED_PALE_LOG).wood(ModBlock.STRIPPED_PALE_WOOD);
        BlockStateModelGenerator.BlockTexturePool palePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlock.PALE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.END_STONE_PALE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.ENDERIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.ENDERIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.END_MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.PALE_LEAVES);
        blockStateModelGenerator.registerLog(ModBlock.END_STONE_PILLAR).log(ModBlock.END_STONE_PILLAR);


        blockStateModelGenerator.registerTintableCross(ModBlock.PALE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.PALE_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.PALE_STEM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.PALE_ROOT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.PALE_ROOTS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.PALE_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);



        palePlanksPool.stairs(ModBlock.PALE_STAIRS);
        palePlanksPool.slab(ModBlock.PALE_SLAB);
        palePlanksPool.button(ModBlock.PALE_BUTTON);
        palePlanksPool.pressurePlate(ModBlock.PALE_PRESSURE_PLATE);
        palePlanksPool.fence(ModBlock.PALE_FENCE);
        palePlanksPool.fenceGate(ModBlock.PALE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlock.PALE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlock.PALE_TRAPDOOR);






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.END_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERIUM_SHARD, Models.GENERATED);




        itemModelGenerator.register(ModItems.ENDERIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERIUM_HOE, Models.HANDHELD);





    }
}
