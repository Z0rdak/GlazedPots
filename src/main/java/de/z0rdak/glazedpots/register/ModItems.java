package de.z0rdak.glazedpots.register;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.block.GlazedFlowerPot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlazedPots.MOD_ID);
    public static final List<RegistryObject<Item>> REGISTERED_ITEMS = new ArrayList<>(16);
    public static final Map<String, BlockItem> GLAZED_FLOWER_POT_ITEMS_BY_COLOR = new HashMap<>(16);

    public static final BlockItem BLACK_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.BLACK_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem BLUE_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.BLUE_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem BROWN_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.BROWN_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem CYAN_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.CYAN_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem GRAY_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.GRAY_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem GREEN_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.GREEN_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem LIGHT_BLUE_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.LIGHT_BLUE_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem LIGHT_GRAY_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.LIGHT_GRAY_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem LIME_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.LIME_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem MAGENTA_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.MAGENTA_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem ORANGE_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.ORANGE_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem PINK_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.PINK_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem PURPLE_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.PURPLE_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem RED_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.RED_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem WHITE_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.WHITE_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));
    public static final BlockItem YELLOW_GLAZED_FLOWER_POT_BLOCK_ITEM = new BlockItem(ModBlocks.YELLOW_GLAZED_FLOWER_POT, new Item.Properties().tab(GlazedPots.GLAZED_POTS_TAB));

    static {
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("black", BLACK_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("blue", BLUE_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("brown", BROWN_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("cyan", CYAN_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("gray", GRAY_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("green", GREEN_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("light_blue", LIGHT_BLUE_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("light_gray", LIGHT_GRAY_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("lime", LIME_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("magenta", MAGENTA_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("orange", ORANGE_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("pink", PINK_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("purple", PURPLE_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("red", RED_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("white", WHITE_GLAZED_FLOWER_POT_BLOCK_ITEM);
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.put("yellow", YELLOW_GLAZED_FLOWER_POT_BLOCK_ITEM);
    }

    public static void registerBlockItems(){
        GLAZED_FLOWER_POT_ITEMS_BY_COLOR.forEach((color, blockItem) -> {
            RegistryObject<Item> flowerPotItem = ITEMS.register(color + "_glazed_flower_pot", blockItem::asItem);
            REGISTERED_ITEMS.add(flowerPotItem);
        });
    }

    public static void register(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
