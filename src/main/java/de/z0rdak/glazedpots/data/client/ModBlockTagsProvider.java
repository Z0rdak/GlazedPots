package de.z0rdak.glazedpots.data.client;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.register.ModBlocks;
import de.z0rdak.glazedpots.register.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator p_i48256_1_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_i48256_1_, GlazedPots.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        Builder<Block> potPlantableTagBuilder = tag(ModTags.Blocks.POT_PLANTABLE);
        // small flowers
        potPlantableTagBuilder.add(Blocks.DANDELION, Blocks.POPPY, Blocks.BLUE_ORCHID, Blocks.ALLIUM, Blocks.AZURE_BLUET,
                Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.WHITE_TULIP, Blocks.PINK_TULIP, Blocks.OXEYE_DAISY, Blocks.CORNFLOWER, Blocks.LILY_OF_THE_VALLEY, Blocks.WITHER_ROSE);
        // big flowers
        potPlantableTagBuilder.add(Blocks.SUNFLOWER, Blocks.LILAC, Blocks.PEONY, Blocks.ROSE_BUSH);
        // saplings
        potPlantableTagBuilder.add(Blocks.OAK_SAPLING, Blocks.SPRUCE_SAPLING, Blocks.BIRCH_SAPLING,
                Blocks.JUNGLE_SAPLING, Blocks.ACACIA_SAPLING, Blocks.DARK_OAK_SAPLING);
        potPlantableTagBuilder.add(Blocks.BAMBOO);
        potPlantableTagBuilder.add(Blocks.CACTUS);
        potPlantableTagBuilder.add(Blocks.RED_MUSHROOM);
        potPlantableTagBuilder.add(Blocks.BROWN_MUSHROOM);
        potPlantableTagBuilder.add(Blocks.DEAD_BUSH);
        potPlantableTagBuilder.add(Blocks.CRIMSON_FUNGUS);
        potPlantableTagBuilder.add(Blocks.WARPED_FUNGUS);
        potPlantableTagBuilder.add(Blocks.WARPED_ROOTS);
        potPlantableTagBuilder.add(Blocks.CRIMSON_ROOTS);

        Builder<Block> flowerPotTagBuilder = tag(ModTags.Blocks.FLOWER_POT);
        ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach( (color, block) -> {
            flowerPotTagBuilder.add(block.get());
        });

        Builder<Block> glazedPotTagBuilder = tag(ModTags.Blocks.GLAZED_POT);
        ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach( (color, block) -> {
            glazedPotTagBuilder.add(block.get());
        });
    }
}
