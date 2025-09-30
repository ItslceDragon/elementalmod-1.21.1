package net.gremi.elementalmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

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

        itemModelGenerator.register(ElementalModItems.FIRE_ORB, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.WATER_ORB, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.EARTH_ORB, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.AIR_ORB, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.LIGHTNING_ORB, Models.GENERATED);

        itemModelGenerator.register(ElementalModItems.RUBY_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.EMERALD_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.AMETHYST_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.OPAL_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.ENDERITE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ElementalModItems.REINFORCED_RUBY, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.REINFORCED_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.REINFORCED_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.REINFORCED_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.REINFORCED_OPAL, Models.GENERATED);

        itemModelGenerator.register(ElementalModItems.ENDERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.ENDERITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ElementalModItems.RUBY_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.SAPPHIRE_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.EMERALD_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.AMETHYST_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.OPAL_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.TRIM_6_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.TRIM_7_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.TRIM_8_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.TRIM_9_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ElementalModItems.NETHERITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ElementalModItems.ENDERITE_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ElementalModItems.PURE_RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.PURE_SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.PURE_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.PURE_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.PURE_OPAL_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ElementalModItems.ENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.ENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.ENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.ENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.ENDERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ElementalModItems.END_RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.END_SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.END_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.END_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.END_OPAL_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ElementalModItems.NETH_RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.NETH_SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.NETH_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.NETH_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ElementalModItems.NETH_OPAL_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_RUBY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_SAPPHIRE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_EMERALD_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_AMETHYST_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_OPAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_OPAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_OPAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.PURE_OPAL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_RUBY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_SAPPHIRE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_EMERALD_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_AMETHYST_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_OPAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_OPAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_OPAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.NETH_OPAL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_RUBY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_SAPPHIRE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_EMERALD_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_AMETHYST_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_OPAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_OPAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_OPAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.END_OPAL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.ENDERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.ENDERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.ENDERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ElementalModItems.ENDERITE_BOOTS));
    }
}
