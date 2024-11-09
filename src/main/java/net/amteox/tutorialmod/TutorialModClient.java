package net.amteox.tutorialmod;

import net.amteox.tutorialmod.block.ModBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_SAPLING,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_GRASS,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_STEM,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_BUSH,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_ROOTS,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PALE_ROOT,RenderLayer.getCutout());

    }
}
