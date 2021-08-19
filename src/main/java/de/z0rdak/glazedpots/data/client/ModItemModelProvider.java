package de.z0rdak.glazedpots.data.client;

import de.z0rdak.glazedpots.GlazedPots;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GlazedPots.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        for (final DyeColor dyeColor : DyeColor.values()) {
            builderFor(itemGenerated, dyeColor.getName() + "_glazed_flower_pot");
        }
    }

    private ItemModelBuilder builderFor(ModelFile itemGenerated, String name){
        return getBuilder(name)
                .parent(itemGenerated)
                .texture("layer0", "item/" + name);
    }
}
