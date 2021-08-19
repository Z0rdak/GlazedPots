package de.z0rdak.glazedpots;

import de.z0rdak.glazedpots.register.ModBlocks;
import de.z0rdak.glazedpots.register.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.common.BasicTrade;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Mod(GlazedPots.MOD_ID)
public class GlazedPots {

    public static final String MOD_ID = "glazedpots";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup GLAZED_POTS_TAB = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GLAZED_FLOWER_POT_ITEMS_BY_COLOR.get("white").asItem());
        }
    };
    
    public GlazedPots() {
        MinecraftForge.EVENT_BUS.register(this);
        ModBlocks.register();
    }

    // TODO: stat for unique glazed pots collected
    // TODO: Advancement all pots: special advancement with xp (maybe needs a trigger with worldsaveddata
}
