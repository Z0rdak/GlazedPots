package de.z0rdak.glazedpots.register;

import de.z0rdak.glazedpots.GlazedPots;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {

    public static final class Blocks{
        public static final ITag.INamedTag<Block> GLAZED_POT = modTag("glazed_pots");
        public static final ITag.INamedTag<Block> FLOWER_POT = forgeTag("flower_pots");
        public static final ITag.INamedTag<Block> POT_PLANTABLE = forgeTag("pot_plantable");

        private static ITag.INamedTag<Block> forgeTag(String path){
            return BlockTags.createOptional(new ResourceLocation("forge", path));
        }

        private static ITag.INamedTag<Block> modTag(String path){
            return BlockTags.createOptional(new ResourceLocation(GlazedPots.MOD_ID, path));
        }
    }

    public static final class Items{
        public static final ITag.INamedTag<Item> GLAZED_POT = modTag("glazed_pots");
        public static final ITag.INamedTag<Item> FLOWER_POT = forgeTag("flower_pots");
        public static final ITag.INamedTag<Item> POT_PLANTABLE = forgeTag("pot_plantable");

        private static ITag.INamedTag<Item> forgeTag(String path){
            return ItemTags.createOptional(new ResourceLocation("forge", path));
        }

        private static ITag.INamedTag<Item> modTag(String path){
            return ItemTags.createOptional(new ResourceLocation(GlazedPots.MOD_ID, path));
        }
    }

}
