package de.z0rdak.glazedpots.data.client;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.register.ModBlocks;
import net.minecraft.data.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, GlazedPots.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // generate blockstates
        ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach((color,block) -> simpleBlock(block.get()));

        // generate models
        // models for glazed pots
        ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach((color, block) -> {
            this.models().generatedModels.put(
                    block.getId(),
                    new GlazedFlowerPotBlockModelProvider(block.getId(), this.models().existingFileHelper));
        });

        // models for glazed pots cross
        ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach((color, block) -> {
            this.models().generatedModels.put(
                    block.getId(),
                    new GlazedFlowerPotCrossBlockModelProvider(block.getId(), this.models().existingFileHelper));
        });

        // models for potted glazed pots
        //ModBlocks.REGISTERED_POTTED_POTS_BY_NAME.forEach((resourceLoc, block) -> {
        //    this.models().generatedModels.put(
        //            block.getId(),
        //            new PottedGlazedFlowerPotBlockModelProvider(block.getId(), this.models().existingFileHelper));
        //    this.models().singleTexture("black_glazed_flower_pot_with_" + resourceLoc.getPath(), new ResourceLocation("glazedpots:black_glazed_flower_pot_cross"), "plant", resourceLoc);
        //});
    }
}
