package de.z0rdak.glazedpots.data.client;

import de.z0rdak.glazedpots.register.ModBlocks;
import net.minecraft.client.renderer.model.BlockFaceUV;
import net.minecraft.client.renderer.model.BlockPartFace;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GlazedFlowerPotBlockModelProvider extends BlockModelBuilder {
    public GlazedFlowerPotBlockModelProvider(ResourceLocation outputLocation, ExistingFileHelper existingFileHelper) {
        super(outputLocation, existingFileHelper);

        // TODO: parent   "parent" : "minecraft:block/flower_pot",
        this.texture("particle", this.location.getNamespace() + ":" + ModelProvider.BLOCK_FOLDER + "/" + this.location.getPath());
        this.texture("flowerpot", this.location.getNamespace() + ":" + ModelProvider.BLOCK_FOLDER + "/" + this.location.getPath());

    }

    public static void registerBlockModels(ExistingFileHelper existingFileHelper) {
        ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach((color,block) -> {
            GlazedFlowerPotBlockModelProvider modBlockModelProvider = new GlazedFlowerPotBlockModelProvider(block.getId(), existingFileHelper);
        });
    }
}
