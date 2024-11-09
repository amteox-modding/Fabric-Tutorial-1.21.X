package net.amteox.tutorialmod.datagen;


import net.amteox.tutorialmod.TutorialMod;
import net.amteox.tutorialmod.block.ModBlock;
import net.amteox.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {


//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlock.END_STONE_PALE_BLOCK)
//                .pattern("WL")
//                .input('W', Items.WATER_BUCKET)
//                .input('L', Items.LAVA_BUCKET)
//                .criterion(hasItem(Items.LAVA_BUCKET),conditionsFromItem(Items.LAVA_BUCKET))
//                .offerTo(exporter);



//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT,9)
//                .pattern("R")
//                .input('R', ModBlock.ENDERIUM_BLOCK)
//                .criterion(hasItem(ModBlock.ENDERIUM_BLOCK),conditionsFromItem(ModBlock.ENDERIUM_BLOCK))
//                .offerTo(exporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT,9)
                    .input(ModBlock.ENDERIUM_BLOCK)
                    .criterion(hasItem(ModBlock.ENDERIUM_BLOCK),conditionsFromItem(ModBlock.ENDERIUM_BLOCK))
                    .offerTo(exporter, Identifier.of(TutorialMod.MOD_ID, "enderium_ingot_from_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERIUM_INGOT,1)
                .pattern("SDS")
                .pattern("DPD")
                .pattern("SDS")
                .input('S', ModItems.ENDERIUM_SHARD)
                .input('D', ModItems.END_DUST)
                .input('P', Items.ENDER_PEARL)
                .criterion(hasItem(ModItems.ENDERIUM_SHARD),conditionsFromItem(ModItems.ENDERIUM_SHARD))
                .offerTo(exporter, Identifier.of(TutorialMod.MOD_ID, "enderium_ingot_from_shard"));






        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlock.ENDERIUM_BLOCK,1)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.ENDERIUM_INGOT)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlock.END_STONE_PILLAR,1)
                .pattern("R")
                .pattern("R")
                .input('R', Blocks.END_STONE_BRICK_SLAB)
                .criterion(hasItem(Blocks.END_STONE_BRICK_SLAB),conditionsFromItem(Blocks.END_STONE_BRICK_SLAB))
                .offerTo(exporter);





        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_SWORD,1)
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_PICKAXE,1)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_AXE,1)
                .pattern(" EE")
                .pattern(" SE")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_SHOVEL,1)
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERIUM_HOE,1)
                .pattern(" EE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', ModItems.ENDERIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ENDERIUM_INGOT),conditionsFromItem(ModItems.ENDERIUM_INGOT))
                .offerTo(exporter);










        //WOOD






        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK,4)
                .pattern("R")
                .pattern("R")
                .input('R', ModBlock.PALE_PLANKS)
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BOWL)
                .pattern("X X")
                .pattern(" X ")
                .input('X', ModBlock.PALE_PLANKS)
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlock.PALE_WOOD,3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlock.PALE_LOG)
                .criterion(hasItem(ModBlock.PALE_LOG),conditionsFromItem(ModBlock.PALE_LOG))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlock.STRIPPED_PALE_WOOD,3)
                .pattern("XX")
                .pattern("XX")
                .input('X', ModBlock.STRIPPED_PALE_LOG)
                .criterion(hasItem(ModBlock.STRIPPED_PALE_LOG),conditionsFromItem(ModBlock.STRIPPED_PALE_LOG))
                .offerTo(exporter);






        FabricRecipeProvider.createFenceRecipe(ModBlock.PALE_FENCE, Ingredient.ofItems(ModBlock.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createFenceGateRecipe(ModBlock.PALE_FENCE_GATE, Ingredient.ofItems(ModBlock.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createStairsRecipe(ModBlock.PALE_STAIRS, Ingredient.ofItems(ModBlock.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlock.PALE_SLAB, Ingredient.ofItems(ModBlock.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlock.PALE_BUTTON)
                .pattern("X")
                .input('X', ModBlock.PALE_PLANKS)
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlock.PALE_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModBlock.PALE_PLANKS)
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);






        FabricRecipeProvider.createDoorRecipe(ModBlock.PALE_DOOR, Ingredient.ofItems(ModBlock.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);

        FabricRecipeProvider.createTrapdoorRecipe(ModBlock.PALE_TRAPDOOR, Ingredient.ofItems(ModBlock.PALE_PLANKS.asItem()))
                .criterion(hasItem(ModBlock.PALE_PLANKS),conditionsFromItem(ModBlock.PALE_PLANKS))
                .offerTo(exporter);


    }


}
