package de.z0rdak.glazedpots.register;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.block.GlazedFlowerPotBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;

public class ModBlocks {

    public static final List<Block> POTABLE_BLOCKS = new ArrayList<>();

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GlazedPots.MOD_ID);

    // empty glazed flower pots by color
    public static final Map<String, FlowerPotBlock> GLAZED_FLOWER_POT_BY_COLOR = new HashMap<>(16);
    // registered empty glazed flower pots by color
    public static final Map<String, RegistryObject<FlowerPotBlock>> REGISTERED_GLAZED_FLOWER_POT_BY_COLOR = new HashMap<>(16);

    // color -> registryName(potableBlock) -> potableBlock
    public static final Map<String, Map<String, Block>> POTTED_POTS_BY_COLOR_AND_NAME = new HashMap<>();
    // color -> registryName(potableBlock) -> RegistryObject(potableBlock)
    public static final Map<String, Map<String, RegistryObject<Block>>> REGISTERED_POTTED_POTS_BY_COLOR_AND_NAME = new HashMap<>();
    // registered potted glazed pots by registry name
    public static final Map<ResourceLocation, RegistryObject<Block>> REGISTERED_POTTED_POTS_BY_NAME = new HashMap<>();

    public static FlowerPotBlock newEmptyFlowerPot(){
        return new FlowerPotBlock(null, () -> Blocks.AIR, AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion());
    }

    public static final FlowerPotBlock BLACK_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock BLUE_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock BROWN_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock CYAN_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock GRAY_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock GREEN_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock LIGHT_BLUE_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock LIGHT_GRAY_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock LIME_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock MAGENTA_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock ORANGE_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock PINK_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock PURPLE_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock RED_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock WHITE_GLAZED_FLOWER_POT = newEmptyFlowerPot();
    public static final FlowerPotBlock YELLOW_GLAZED_FLOWER_POT = newEmptyFlowerPot();

    static {
        GLAZED_FLOWER_POT_BY_COLOR.put(DyeColor.BLACK.getName(), BLACK_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put(DyeColor.BLUE.getName(), BLUE_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("brown", BROWN_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("cyan", CYAN_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("gray", GRAY_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("green", GREEN_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("light_blue", LIGHT_BLUE_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("light_gray", LIGHT_GRAY_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("lime", LIME_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("magenta", MAGENTA_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("orange", ORANGE_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("pink", PINK_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("purple", PURPLE_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("red", RED_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("white", WHITE_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("yellow", YELLOW_GLAZED_FLOWER_POT);

        ModBlocks.POTABLE_BLOCKS.addAll(Arrays.asList(Blocks.DANDELION, Blocks.POPPY, Blocks.BLUE_ORCHID, Blocks.ALLIUM, Blocks.AZURE_BLUET,
                Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.WHITE_TULIP, Blocks.PINK_TULIP, Blocks.OXEYE_DAISY, Blocks.CORNFLOWER, Blocks.LILY_OF_THE_VALLEY, Blocks.WITHER_ROSE));
        // ModBlocks.POTABLE_BLOCKS.addAll(Arrays.asList(Blocks.SUNFLOWER, Blocks.LILAC, Blocks.PEONY, Blocks.ROSE_BUSH));
        ModBlocks.POTABLE_BLOCKS.addAll(Arrays.asList(Blocks.OAK_SAPLING, Blocks.SPRUCE_SAPLING, Blocks.BIRCH_SAPLING,
                Blocks.JUNGLE_SAPLING, Blocks.ACACIA_SAPLING, Blocks.DARK_OAK_SAPLING));
        ModBlocks.POTABLE_BLOCKS.addAll(Arrays.asList(Blocks.FERN, Blocks.BAMBOO, Blocks.CACTUS, Blocks.RED_MUSHROOM, Blocks.BROWN_MUSHROOM,
                Blocks.DEAD_BUSH, Blocks.CRIMSON_FUNGUS, Blocks.WARPED_FUNGUS, Blocks.WARPED_ROOTS,Blocks.CRIMSON_ROOTS));

        // register empty glazed pots
        for (final DyeColor dyeColor : DyeColor.values()) {
            RegistryObject<FlowerPotBlock> registeredBlock = BLOCKS.register(dyeColor.getName() + "_glazed_flower_pot", () -> GLAZED_FLOWER_POT_BY_COLOR.get(dyeColor.getName()));
            REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.put(dyeColor.getName(), registeredBlock);
        }

        // registering potted glazed pots
        GLAZED_FLOWER_POT_BY_COLOR.forEach((color, flowerPot) -> {
            Map<String, Block> pottedBlocksByName =  new HashMap<>();
            Map<String, RegistryObject<Block>> registeredPottedBlocksByName =  new HashMap<>();
            POTABLE_BLOCKS.forEach(block -> {
                GlazedFlowerPotBlock pot = new GlazedFlowerPotBlock(() -> GLAZED_FLOWER_POT_BY_COLOR.get(color), block);
                String glazedPotRegistryName = color + "_glazed_potted_" + block.getRegistryName().getPath();
                RegistryObject<Block> registeredPottedPot = BLOCKS.register(glazedPotRegistryName, () -> pot);
                String potableBlockRegistryName = Objects.requireNonNull(block.getRegistryName()).toString();
                pottedBlocksByName.put(potableBlockRegistryName, pot);
                registeredPottedBlocksByName.put(potableBlockRegistryName, registeredPottedPot);
                REGISTERED_POTTED_POTS_BY_NAME.put(block.getRegistryName(), registeredPottedPot);
            });
            REGISTERED_POTTED_POTS_BY_COLOR_AND_NAME.put(color, registeredPottedBlocksByName);
            POTTED_POTS_BY_COLOR_AND_NAME.put(color, pottedBlocksByName);
        });

        // POTTED_POTS_BY_COLOR_AND_NAME not populated/available here yet

        ModItems.registerBlockItems();
    }

    public static void register() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.register();
    }
}
