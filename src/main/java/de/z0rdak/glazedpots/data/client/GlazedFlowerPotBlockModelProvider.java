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
    }

    public static void registerBlockModels(ExistingFileHelper existingFileHelper) {
        ModBlocks.REGISTERED_BLOCKS.forEach(block -> {
            GlazedFlowerPotBlockModelProvider modBlockModelProvider = new GlazedFlowerPotBlockModelProvider(block.getId(), existingFileHelper).generateModel();
        });
    }

    public GlazedFlowerPotBlockModelProvider generateModel() {
        this.ambientOcclusion = false;

        this.texture("particle", this.location.getNamespace() + ":" + ModelProvider.BLOCK_FOLDER + "/" + this.location.getPath());
        this.texture("flowerpot", this.location.getNamespace() + ":" + ModelProvider.BLOCK_FOLDER + "/" + this.location.getPath());
        this.texture("dirt", "minecraft:block/dirt");
        this.element().allFaces((dir, facebuilder) -> {
            if (dir == Direction.DOWN) {
                facebuilder.cullface(Direction.DOWN);
            }
            facebuilder.texture("#flowerpot");
        })
                .from(10, 0, 5)
                .to(11, 6, 11)
                .face(Direction.UP).uvs(10, 5, 11, 11).end()
                .face(Direction.DOWN).uvs(10, 5, 11, 11).end()
                .face(Direction.NORTH).uvs(5, 10, 6, 16).end()
                .face(Direction.SOUTH).uvs(10, 10, 11, 16).end()
                .face(Direction.WEST).uvs(5, 10, 11, 16).end()
                .face(Direction.EAST).uvs(5, 10, 11, 16).end()
                .end();



        ElementBuilder five = new ElementBuilder();
        five.from(6, 0, 6);
        five.to(10, 4, 10);
        five.face(Direction.DOWN).uvs(6, 12, 10, 16).texture("#flowerpot").cullface(Direction.DOWN);
        five.face(Direction.UP).uvs(6, 6, 10, 10).texture("#dirt").cullface(null);

        elements.add(five);

        /*
        ElementBuilder two = new ElementBuilder();
        two.from(10, 0, 5);
        two.to(11, 6, 11);
        two.face(Direction.DOWN).uvs(10, 5, 11, 11).texture("#flowerpot").cullface(Direction.DOWN);
        two.face(Direction.UP).uvs(10, 5, 11, 11).texture("#flowerpot");
        two.face(Direction.NORTH).uvs(5, 10, 6, 16).texture("#flowerpot");
        two.face(Direction.SOUTH).uvs(10, 10, 11, 16).texture("#flowerpot");
        two.face(Direction.WEST).uvs(5, 10, 11, 16).texture("#flowerpot");
        two.face(Direction.EAST).uvs(5, 10, 11, 16).texture("#flowerpot");

        ElementBuilder three = new ElementBuilder();
        three.from(6, 0, 5);
        three.to(10, 6, 6);
        three.face(Direction.DOWN).uvs(6, 10, 10, 11).texture("#flowerpot").cullface(Direction.DOWN);
        three.face(Direction.UP).uvs(6, 5, 10, 6).texture("#flowerpot");
        three.face(Direction.NORTH).uvs(6, 10, 10, 16).texture("#flowerpot");
        three.face(Direction.SOUTH).uvs(6, 10, 10, 16).texture("#flowerpot");

        ElementBuilder four = new ElementBuilder();
        four.from(6, 0, 10);
        four.to(10, 6, 11);
        four.face(Direction.DOWN).uvs(6, 5, 10, 6).texture("#flowerpot").cullface(Direction.DOWN);
        four.face(Direction.UP).uvs(6, 10, 10, 11).texture("#flowerpot");
        four.face(Direction.NORTH).uvs(6, 10, 10, 16).texture("#flowerpot");
        four.face(Direction.SOUTH).uvs(6, 10, 10, 16).texture("#flowerpot");

        ElementBuilder five = new ElementBuilder();
        five.from(6, 0, 6);
        five.to(10, 4, 10);
        five.face(Direction.DOWN).uvs(6, 12, 10, 16).texture("#flowerpot").cullface(Direction.DOWN);
        five.face(Direction.UP).uvs(6, 6, 10, 10).texture("#dirt");
*/

        return this;
    }
}
