package net.gremi.elementalmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_AMETHYST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_SAPPHIRE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_AMETHYST_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.PURE_SAPPHIRE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ElementalModBlocks.ENDERITE_BLOCK);
        blockStateModelGenerator.registerSingleton(ElementalModBlocks.VOID_DEBRIS, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ElementalModItems.PURE_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.PURE_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.PURE_OPAL, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.PURE_RUBY, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.PURE_SAPPHIRE, Models.GENERATED);

        itemModelGenerator.register(ElementalModItems.ENDERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.ENDERITE_INGOT, Models.GENERATED);

    }
}
