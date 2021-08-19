package de.z0rdak.glazedpots.data.client;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.register.ModBlocks;
import de.z0rdak.glazedpots.register.ModItems;
import de.z0rdak.glazedpots.register.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator p_i232552_1_, BlockTagsProvider p_i232552_2_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_i232552_1_, p_i232552_2_, GlazedPots.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        copy(ModTags.Blocks.POT_PLANTABLE, ModTags.Items.POT_PLANTABLE);
        copy(ModTags.Blocks.FLOWER_POT, ModTags.Items.FLOWER_POT);
        copy(ModTags.Blocks.GLAZED_POT, ModTags.Items.GLAZED_POT);
    }
}
