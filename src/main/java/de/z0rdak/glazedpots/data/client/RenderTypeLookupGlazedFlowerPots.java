package de.z0rdak.glazedpots.data.client;

import de.z0rdak.glazedpots.GlazedPots;
import de.z0rdak.glazedpots.register.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public final class RenderTypeLookupGlazedFlowerPots {

    private RenderTypeLookupGlazedFlowerPots(){}
    public static void doClientStuff(final FMLClientSetupEvent event) {

        ModBlocks.GLAZED_FLOWER_POT_BY_COLOR.forEach((color,pot) -> {
            RenderTypeLookup.setRenderLayer(pot, RenderType.cutout());
        });

/*

        GlazedPots.LOGGER.debug("###");
        GlazedPots.LOGGER.debug("###");
        GlazedPots.LOGGER.debug("###");
        ModBlocks.POTTED_POTS_BY_COLOR_AND_NAME.forEach((color, map) -> {
            GlazedPots.LOGGER.debug("Color: " + color);
            map.forEach((name, pot) -> {
                GlazedPots.LOGGER.debug("Block: " + pot.getRegistryName());
            });
        });
        GlazedPots.LOGGER.debug("###");
        GlazedPots.LOGGER.debug("###");
        GlazedPots.LOGGER.debug("###");


 */
        // TODO: Fern is tinted -> BlockModel / State
        ModBlocks.POTTED_POTS_BY_COLOR_AND_NAME.forEach((color, potMap) -> {

            potMap.forEach((pottedBlockName, pot) ->  {
                RenderTypeLookup.setRenderLayer(pot, RenderType.cutout());
            });
        });

    }
}
