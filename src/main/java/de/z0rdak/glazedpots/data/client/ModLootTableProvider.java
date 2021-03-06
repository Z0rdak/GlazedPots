package de.z0rdak.glazedpots.data.client;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.register.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((a,b) -> LootTableManager.validate(validationtracker, a, b));
    }

    public static class ModBlockLootTables extends BlockLootTables {
        @Override
        protected void addTables() {
            //ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach((color, block) -> {
            //    dropSelf(block.get());
            //});

            //ModBlocks.REGISTERED_POTTED_POTS_BY_NAME.forEach((resourceLoc, block) -> {
            //    dropPottedContents(RegistryObject.of(resourceLoc, ForgeRegistries.BLOCKS).get());
            //});
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }
}
