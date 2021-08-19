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

    // TODO: model not generated correctly - FIXME
    // TODO: fix resourcelocations (output path)

    @Override
    protected void registerStatesAndModels() {
        //ModBlocks.REGISTERED_BLOCKS.forEach(block -> simpleBlock(block.get()));

        // TODO:
        //this.models().generatedModels.put(
        //        new ResourceLocation("glazedpots:blocks/black_glazed_flower_pot"),
        //        new GlazedFlowerPotBlockModelProvider(new ResourceLocation("glazedpots:black_glazed_flower_pot"), this.models().existingFileHelper).generateModel());
    }
}
