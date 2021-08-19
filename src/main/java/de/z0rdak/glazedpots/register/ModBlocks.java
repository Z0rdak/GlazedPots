package de.z0rdak.glazedpots.register;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.block.GlazedFlowerPot;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GlazedPots.MOD_ID);
    public static final List<RegistryObject<GlazedFlowerPot>> REGISTERED_BLOCKS = new ArrayList<>(16);
    public static final Map<String, GlazedFlowerPot> GLAZED_FLOWER_POT_BY_COLOR = new HashMap<>(16);

    public static GlazedFlowerPot newGlazedFlowerPot(){
        return new GlazedFlowerPot();
    }

    public static final GlazedFlowerPot BLACK_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot BLUE_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot BROWN_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot CYAN_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot GRAY_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot GREEN_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot LIGHT_BLUE_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot LIGHT_GRAY_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot LIME_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot MAGENTA_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot ORANGE_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot PINK_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot PURPLE_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot RED_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot WHITE_GLAZED_FLOWER_POT = newGlazedFlowerPot();
    public static final GlazedFlowerPot YELLOW_GLAZED_FLOWER_POT = newGlazedFlowerPot();

    static {
        GLAZED_FLOWER_POT_BY_COLOR.put(DyeColor.BLACK.getName(), BLACK_GLAZED_FLOWER_POT);
        GLAZED_FLOWER_POT_BY_COLOR.put("blue", BLUE_GLAZED_FLOWER_POT);
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

        for (final DyeColor dyeColor : DyeColor.values()) {
            RegistryObject<GlazedFlowerPot> registeredBlock = BLOCKS.register(dyeColor.getName() + "_glazed_flower_pot", () -> GLAZED_FLOWER_POT_BY_COLOR.get(dyeColor.getName()));
            REGISTERED_BLOCKS.add(registeredBlock);
        }
        ModItems.registerBlockItems();
    }

    public static void register() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.register();
    }
}
