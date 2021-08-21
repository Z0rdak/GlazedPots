package de.z0rdak.glazedpots.data.client;

import de.z0rdak.glazedpots.register.ModBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PottedGlazedFlowerPotBlockModelProvider extends BlockModelBuilder {
    public PottedGlazedFlowerPotBlockModelProvider(ResourceLocation outputLocation, ExistingFileHelper existingFileHelper) {
        super(outputLocation, existingFileHelper);

        // todo: parent:   "parent": "glazed_bricks:block/black_glazed_flower_pot_cross",
        this.texture("plant", this.location.getNamespace() + ":" + ModelProvider.BLOCK_FOLDER + "/" + this.location.getPath());

    }

    public static void registerBlockModels(ExistingFileHelper existingFileHelper) {
        ModBlocks.REGISTERED_GLAZED_FLOWER_POT_BY_COLOR.forEach((color, block) -> {
            PottedGlazedFlowerPotBlockModelProvider modBlockModelProvider = new PottedGlazedFlowerPotBlockModelProvider(block.getId(), existingFileHelper);
        });
    }

}