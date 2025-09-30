package net.gremi.elementalmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gremi.elementalmod.ElementalMod;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        Map<Item, Item> RUBY_UPGRADES = Map.ofEntries(
                Map.entry(Items.DIAMOND_HELMET, ElementalModItems.PURE_RUBY_HELMET),
                Map.entry(Items.DIAMOND_CHESTPLATE, ElementalModItems.PURE_RUBY_CHESTPLATE),
                Map.entry(Items.DIAMOND_LEGGINGS, ElementalModItems.PURE_RUBY_LEGGINGS),
                Map.entry(Items.DIAMOND_BOOTS, ElementalModItems.PURE_RUBY_BOOTS),
                Map.entry(Items.DIAMOND_SWORD, ElementalModItems.PURE_RUBY_SWORD),
                Map.entry(Items.NETHERITE_HELMET, ElementalModItems.NETH_RUBY_HELMET),
                Map.entry(Items.NETHERITE_CHESTPLATE, ElementalModItems.NETH_RUBY_CHESTPLATE),
                Map.entry(Items.NETHERITE_LEGGINGS, ElementalModItems.NETH_RUBY_LEGGINGS),
                Map.entry(Items.NETHERITE_BOOTS, ElementalModItems.NETH_RUBY_BOOTS),
                Map.entry(Items.NETHERITE_SWORD, ElementalModItems.NETH_RUBY_SWORD),
                Map.entry(ElementalModItems.ENDERITE_HELMET, ElementalModItems.END_RUBY_HELMET),
                Map.entry(ElementalModItems.ENDERITE_CHESTPLATE, ElementalModItems.END_RUBY_CHESTPLATE),
                Map.entry(ElementalModItems.ENDERITE_LEGGINGS, ElementalModItems.END_RUBY_LEGGINGS),
                Map.entry(ElementalModItems.ENDERITE_BOOTS, ElementalModItems.END_RUBY_BOOTS),
                Map.entry(ElementalModItems.ENDERITE_SWORD, ElementalModItems.END_RUBY_SWORD)
        );

        Map<Item, Item> SAPPHIRE_UPGRADES = Map.ofEntries(
                Map.entry(Items.DIAMOND_HELMET, ElementalModItems.PURE_SAPPHIRE_HELMET),
                Map.entry(Items.DIAMOND_CHESTPLATE, ElementalModItems.PURE_SAPPHIRE_CHESTPLATE),
                Map.entry(Items.DIAMOND_LEGGINGS, ElementalModItems.PURE_SAPPHIRE_LEGGINGS),
                Map.entry(Items.DIAMOND_BOOTS, ElementalModItems.PURE_SAPPHIRE_BOOTS),
                Map.entry(Items.DIAMOND_SWORD, ElementalModItems.PURE_SAPPHIRE_SWORD),
                Map.entry(Items.NETHERITE_HELMET, ElementalModItems.NETH_SAPPHIRE_HELMET),
                Map.entry(Items.NETHERITE_CHESTPLATE, ElementalModItems.NETH_SAPPHIRE_CHESTPLATE),
                Map.entry(Items.NETHERITE_LEGGINGS, ElementalModItems.NETH_SAPPHIRE_LEGGINGS),
                Map.entry(Items.NETHERITE_BOOTS, ElementalModItems.NETH_SAPPHIRE_BOOTS),
                Map.entry(Items.NETHERITE_SWORD, ElementalModItems.NETH_SAPPHIRE_SWORD),
                Map.entry(ElementalModItems.ENDERITE_HELMET, ElementalModItems.END_SAPPHIRE_HELMET),
                Map.entry(ElementalModItems.ENDERITE_CHESTPLATE, ElementalModItems.END_SAPPHIRE_CHESTPLATE),
                Map.entry(ElementalModItems.ENDERITE_LEGGINGS, ElementalModItems.END_SAPPHIRE_LEGGINGS),
                Map.entry(ElementalModItems.ENDERITE_BOOTS, ElementalModItems.END_SAPPHIRE_BOOTS),
                Map.entry(ElementalModItems.ENDERITE_SWORD, ElementalModItems.END_SAPPHIRE_SWORD)
        );

        Map<Item, Item> EMERALD_UPGRADES = Map.ofEntries(
                Map.entry(Items.DIAMOND_HELMET, ElementalModItems.PURE_EMERALD_HELMET),
                Map.entry(Items.DIAMOND_CHESTPLATE, ElementalModItems.PURE_EMERALD_CHESTPLATE),
                Map.entry(Items.DIAMOND_LEGGINGS, ElementalModItems.PURE_EMERALD_LEGGINGS),
                Map.entry(Items.DIAMOND_BOOTS, ElementalModItems.PURE_EMERALD_BOOTS),
                Map.entry(Items.DIAMOND_SWORD, ElementalModItems.PURE_EMERALD_SWORD),
                Map.entry(Items.NETHERITE_HELMET, ElementalModItems.NETH_EMERALD_HELMET),
                Map.entry(Items.NETHERITE_CHESTPLATE, ElementalModItems.NETH_EMERALD_CHESTPLATE),
                Map.entry(Items.NETHERITE_LEGGINGS, ElementalModItems.NETH_EMERALD_LEGGINGS),
                Map.entry(Items.NETHERITE_BOOTS, ElementalModItems.NETH_EMERALD_BOOTS),
                Map.entry(Items.NETHERITE_SWORD, ElementalModItems.NETH_EMERALD_SWORD),
                Map.entry(ElementalModItems.ENDERITE_HELMET, ElementalModItems.END_EMERALD_HELMET),
                Map.entry(ElementalModItems.ENDERITE_CHESTPLATE, ElementalModItems.END_EMERALD_CHESTPLATE),
                Map.entry(ElementalModItems.ENDERITE_LEGGINGS, ElementalModItems.END_EMERALD_LEGGINGS),
                Map.entry(ElementalModItems.ENDERITE_BOOTS, ElementalModItems.END_EMERALD_BOOTS),
                Map.entry(ElementalModItems.ENDERITE_SWORD, ElementalModItems.END_EMERALD_SWORD)
        );

        Map<Item, Item> AMETHYST_UPGRADES = Map.ofEntries(
                Map.entry(Items.DIAMOND_HELMET, ElementalModItems.PURE_AMETHYST_HELMET),
                Map.entry(Items.DIAMOND_CHESTPLATE, ElementalModItems.PURE_AMETHYST_CHESTPLATE),
                Map.entry(Items.DIAMOND_LEGGINGS, ElementalModItems.PURE_AMETHYST_LEGGINGS),
                Map.entry(Items.DIAMOND_BOOTS, ElementalModItems.PURE_AMETHYST_BOOTS),
                Map.entry(Items.DIAMOND_SWORD, ElementalModItems.PURE_AMETHYST_SWORD),
                Map.entry(Items.NETHERITE_HELMET, ElementalModItems.NETH_AMETHYST_HELMET),
                Map.entry(Items.NETHERITE_CHESTPLATE, ElementalModItems.NETH_AMETHYST_CHESTPLATE),
                Map.entry(Items.NETHERITE_LEGGINGS, ElementalModItems.NETH_AMETHYST_LEGGINGS),
                Map.entry(Items.NETHERITE_BOOTS, ElementalModItems.NETH_AMETHYST_BOOTS),
                Map.entry(Items.NETHERITE_SWORD, ElementalModItems.NETH_AMETHYST_SWORD),
                Map.entry(ElementalModItems.ENDERITE_HELMET, ElementalModItems.END_AMETHYST_HELMET),
                Map.entry(ElementalModItems.ENDERITE_CHESTPLATE, ElementalModItems.END_AMETHYST_CHESTPLATE),
                Map.entry(ElementalModItems.ENDERITE_LEGGINGS, ElementalModItems.END_AMETHYST_LEGGINGS),
                Map.entry(ElementalModItems.ENDERITE_BOOTS, ElementalModItems.END_AMETHYST_BOOTS),
                Map.entry(ElementalModItems.ENDERITE_SWORD, ElementalModItems.END_AMETHYST_SWORD)
        );

        Map<Item, Item> OPAL_UPGRADES = Map.ofEntries(
                Map.entry(Items.DIAMOND_HELMET, ElementalModItems.PURE_OPAL_HELMET),
                Map.entry(Items.DIAMOND_CHESTPLATE, ElementalModItems.PURE_OPAL_CHESTPLATE),
                Map.entry(Items.DIAMOND_LEGGINGS, ElementalModItems.PURE_OPAL_LEGGINGS),
                Map.entry(Items.DIAMOND_BOOTS, ElementalModItems.PURE_OPAL_BOOTS),
                Map.entry(Items.DIAMOND_SWORD, ElementalModItems.PURE_OPAL_SWORD),
                Map.entry(Items.NETHERITE_HELMET, ElementalModItems.NETH_OPAL_HELMET),
                Map.entry(Items.NETHERITE_CHESTPLATE, ElementalModItems.NETH_OPAL_CHESTPLATE),
                Map.entry(Items.NETHERITE_LEGGINGS, ElementalModItems.NETH_OPAL_LEGGINGS),
                Map.entry(Items.NETHERITE_BOOTS, ElementalModItems.NETH_OPAL_BOOTS),
                Map.entry(Items.NETHERITE_SWORD, ElementalModItems.NETH_OPAL_SWORD),
                Map.entry(ElementalModItems.ENDERITE_HELMET, ElementalModItems.END_OPAL_HELMET),
                Map.entry(ElementalModItems.ENDERITE_CHESTPLATE, ElementalModItems.END_OPAL_CHESTPLATE),
                Map.entry(ElementalModItems.ENDERITE_LEGGINGS, ElementalModItems.END_OPAL_LEGGINGS),
                Map.entry(ElementalModItems.ENDERITE_BOOTS, ElementalModItems.END_OPAL_BOOTS),
                Map.entry(ElementalModItems.ENDERITE_SWORD, ElementalModItems.END_OPAL_SWORD)
        );

        Map<Item, Item> NETH_UPGRADES = Map.ofEntries(
                Map.entry(ElementalModItems.PURE_RUBY_HELMET, ElementalModItems.NETH_RUBY_HELMET),
                Map.entry(ElementalModItems.PURE_RUBY_CHESTPLATE, ElementalModItems.NETH_RUBY_CHESTPLATE),
                Map.entry(ElementalModItems.PURE_RUBY_LEGGINGS, ElementalModItems.NETH_RUBY_LEGGINGS),
                Map.entry(ElementalModItems.PURE_RUBY_BOOTS, ElementalModItems.NETH_RUBY_BOOTS),
                Map.entry(ElementalModItems.PURE_RUBY_SWORD, ElementalModItems.NETH_RUBY_SWORD),
                Map.entry(ElementalModItems.PURE_SAPPHIRE_HELMET, ElementalModItems.NETH_SAPPHIRE_HELMET),
                Map.entry(ElementalModItems.PURE_SAPPHIRE_CHESTPLATE, ElementalModItems.NETH_SAPPHIRE_CHESTPLATE),
                Map.entry(ElementalModItems.PURE_SAPPHIRE_LEGGINGS, ElementalModItems.NETH_SAPPHIRE_LEGGINGS),
                Map.entry(ElementalModItems.PURE_SAPPHIRE_BOOTS, ElementalModItems.NETH_SAPPHIRE_BOOTS),
                Map.entry(ElementalModItems.PURE_SAPPHIRE_SWORD, ElementalModItems.NETH_SAPPHIRE_SWORD),
                Map.entry(ElementalModItems.PURE_EMERALD_HELMET, ElementalModItems.NETH_EMERALD_HELMET),
                Map.entry(ElementalModItems.PURE_EMERALD_CHESTPLATE, ElementalModItems.NETH_EMERALD_CHESTPLATE),
                Map.entry(ElementalModItems.PURE_EMERALD_LEGGINGS, ElementalModItems.NETH_EMERALD_LEGGINGS),
                Map.entry(ElementalModItems.PURE_EMERALD_BOOTS, ElementalModItems.NETH_EMERALD_BOOTS),
                Map.entry(ElementalModItems.PURE_EMERALD_SWORD, ElementalModItems.NETH_EMERALD_SWORD),
                Map.entry(ElementalModItems.PURE_AMETHYST_HELMET, ElementalModItems.NETH_AMETHYST_HELMET),
                Map.entry(ElementalModItems.PURE_AMETHYST_CHESTPLATE, ElementalModItems.NETH_AMETHYST_CHESTPLATE),
                Map.entry(ElementalModItems.PURE_AMETHYST_LEGGINGS, ElementalModItems.NETH_AMETHYST_LEGGINGS),
                Map.entry(ElementalModItems.PURE_AMETHYST_BOOTS, ElementalModItems.NETH_AMETHYST_BOOTS),
                Map.entry(ElementalModItems.PURE_AMETHYST_SWORD, ElementalModItems.NETH_AMETHYST_SWORD),
                Map.entry(ElementalModItems.PURE_OPAL_HELMET, ElementalModItems.NETH_OPAL_HELMET),
                Map.entry(ElementalModItems.PURE_OPAL_CHESTPLATE, ElementalModItems.NETH_OPAL_CHESTPLATE),
                Map.entry(ElementalModItems.PURE_OPAL_LEGGINGS, ElementalModItems.NETH_OPAL_LEGGINGS),
                Map.entry(ElementalModItems.PURE_OPAL_BOOTS, ElementalModItems.NETH_OPAL_BOOTS),
                Map.entry(ElementalModItems.PURE_OPAL_SWORD, ElementalModItems.NETH_OPAL_SWORD)
        );

        Map<Item, Item> END_UPGRADES = Map.ofEntries(
                Map.entry(ElementalModItems.NETH_RUBY_HELMET, ElementalModItems.END_RUBY_HELMET),
                Map.entry(ElementalModItems.NETH_RUBY_CHESTPLATE, ElementalModItems.END_RUBY_CHESTPLATE),
                Map.entry(ElementalModItems.NETH_RUBY_LEGGINGS, ElementalModItems.END_RUBY_LEGGINGS),
                Map.entry(ElementalModItems.NETH_RUBY_BOOTS, ElementalModItems.END_RUBY_BOOTS),
                Map.entry(ElementalModItems.NETH_RUBY_SWORD, ElementalModItems.END_RUBY_SWORD),
                Map.entry(ElementalModItems.NETH_SAPPHIRE_HELMET, ElementalModItems.END_SAPPHIRE_HELMET),
                Map.entry(ElementalModItems.NETH_SAPPHIRE_CHESTPLATE, ElementalModItems.END_SAPPHIRE_CHESTPLATE),
                Map.entry(ElementalModItems.NETH_SAPPHIRE_LEGGINGS, ElementalModItems.END_SAPPHIRE_LEGGINGS),
                Map.entry(ElementalModItems.NETH_SAPPHIRE_BOOTS, ElementalModItems.END_SAPPHIRE_BOOTS),
                Map.entry(ElementalModItems.NETH_SAPPHIRE_SWORD, ElementalModItems.END_SAPPHIRE_SWORD),
                Map.entry(ElementalModItems.NETH_EMERALD_HELMET, ElementalModItems.END_EMERALD_HELMET),
                Map.entry(ElementalModItems.NETH_EMERALD_CHESTPLATE, ElementalModItems.END_EMERALD_CHESTPLATE),
                Map.entry(ElementalModItems.NETH_EMERALD_LEGGINGS, ElementalModItems.END_EMERALD_LEGGINGS),
                Map.entry(ElementalModItems.NETH_EMERALD_BOOTS, ElementalModItems.END_EMERALD_BOOTS),
                Map.entry(ElementalModItems.NETH_EMERALD_SWORD, ElementalModItems.END_EMERALD_SWORD),
                Map.entry(ElementalModItems.NETH_AMETHYST_HELMET, ElementalModItems.END_AMETHYST_HELMET),
                Map.entry(ElementalModItems.NETH_AMETHYST_CHESTPLATE, ElementalModItems.END_AMETHYST_CHESTPLATE),
                Map.entry(ElementalModItems.NETH_AMETHYST_LEGGINGS, ElementalModItems.END_AMETHYST_LEGGINGS),
                Map.entry(ElementalModItems.NETH_AMETHYST_BOOTS, ElementalModItems.END_AMETHYST_BOOTS),
                Map.entry(ElementalModItems.NETH_AMETHYST_SWORD, ElementalModItems.END_AMETHYST_SWORD),
                Map.entry(ElementalModItems.NETH_OPAL_HELMET, ElementalModItems.END_OPAL_HELMET),
                Map.entry(ElementalModItems.NETH_OPAL_CHESTPLATE, ElementalModItems.END_OPAL_CHESTPLATE),
                Map.entry(ElementalModItems.NETH_OPAL_LEGGINGS, ElementalModItems.END_OPAL_LEGGINGS),
                Map.entry(ElementalModItems.NETH_OPAL_BOOTS, ElementalModItems.END_OPAL_BOOTS),
                Map.entry(ElementalModItems.NETH_OPAL_SWORD, ElementalModItems.END_OPAL_SWORD),
                Map.entry(Items.NETHERITE_HELMET, ElementalModItems.ENDERITE_HELMET),
                Map.entry(Items.NETHERITE_CHESTPLATE, ElementalModItems.ENDERITE_CHESTPLATE),
                Map.entry(Items.NETHERITE_LEGGINGS, ElementalModItems.ENDERITE_LEGGINGS),
                Map.entry(Items.NETHERITE_BOOTS, ElementalModItems.ENDERITE_BOOTS),
                Map.entry(Items.NETHERITE_SWORD, ElementalModItems.ENDERITE_SWORD),
                Map.entry(Items.NETHERITE_PICKAXE, ElementalModItems.ENDERITE_PICKAXE),
                Map.entry(Items.NETHERITE_AXE, ElementalModItems.ENDERITE_AXE),
                Map.entry(Items.NETHERITE_SHOVEL, ElementalModItems.ENDERITE_SHOVEL),
                Map.entry(Items.NETHERITE_HOE, ElementalModItems.ENDERITE_HOE)
        );

        generateSmithingRecipes(RUBY_UPGRADES, ElementalModItems.RUBY_SMITHING_TEMPLATE, ElementalModItems.REINFORCED_RUBY, recipeExporter);
        generateSmithingRecipes(SAPPHIRE_UPGRADES, ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE, ElementalModItems.REINFORCED_SAPPHIRE, recipeExporter);
        generateSmithingRecipes(EMERALD_UPGRADES, ElementalModItems.EMERALD_SMITHING_TEMPLATE, ElementalModItems.REINFORCED_EMERALD, recipeExporter);
        generateSmithingRecipes(AMETHYST_UPGRADES, ElementalModItems.AMETHYST_SMITHING_TEMPLATE, ElementalModItems.REINFORCED_AMETHYST, recipeExporter);
        generateSmithingRecipes(OPAL_UPGRADES, ElementalModItems.OPAL_SMITHING_TEMPLATE, ElementalModItems.REINFORCED_OPAL, recipeExporter);
        generateSmithingRecipes(NETH_UPGRADES, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT, recipeExporter);
        generateSmithingRecipes(END_UPGRADES, ElementalModItems.ENDERITE_SMITHING_TEMPLATE, ElementalModItems.ENDERITE_INGOT, recipeExporter);

        offerSmelting(recipeExporter, List.of(ElementalModBlocks.PURE_AMETHYST_ORE), RecipeCategory.MISC, ElementalModItems.PURE_AMETHYST, 1f, 200, "elementalmod");
        offerSmelting(recipeExporter, List.of(ElementalModBlocks.PURE_EMERALD_ORE), RecipeCategory.MISC, ElementalModItems.PURE_EMERALD, 1f, 200, "elementalmod");
        offerSmelting(recipeExporter, List.of(ElementalModBlocks.PURE_OPAL_ORE), RecipeCategory.MISC, ElementalModItems.PURE_OPAL, 1f, 200, "elementalmod");
        offerSmelting(recipeExporter, List.of(ElementalModBlocks.PURE_RUBY_ORE), RecipeCategory.MISC, ElementalModItems.PURE_RUBY, 1f, 200, "elementalmod");
        offerSmelting(recipeExporter, List.of(ElementalModBlocks.PURE_SAPPHIRE_ORE), RecipeCategory.MISC, ElementalModItems.PURE_SAPPHIRE, 1f, 200, "elementalmod");
        offerSmelting(recipeExporter, List.of(ElementalModBlocks.VOID_DEBRIS), RecipeCategory.MISC, ElementalModItems.ENDERITE_SCRAP, 2f, 200, "elementalmod");

        offerBlasting(recipeExporter, List.of(ElementalModBlocks.PURE_AMETHYST_ORE), RecipeCategory.MISC, ElementalModItems.PURE_AMETHYST, 1f, 100, "elementalmod");
        offerBlasting(recipeExporter, List.of(ElementalModBlocks.PURE_EMERALD_ORE), RecipeCategory.MISC, ElementalModItems.PURE_EMERALD, 1f, 100, "elementalmod");
        offerBlasting(recipeExporter, List.of(ElementalModBlocks.PURE_OPAL_ORE), RecipeCategory.MISC, ElementalModItems.PURE_OPAL, 1f, 100, "elementalmod");
        offerBlasting(recipeExporter, List.of(ElementalModBlocks.PURE_RUBY_ORE), RecipeCategory.MISC, ElementalModItems.PURE_RUBY, 1f, 100, "elementalmod");
        offerBlasting(recipeExporter, List.of(ElementalModBlocks.PURE_SAPPHIRE_ORE), RecipeCategory.MISC, ElementalModItems.PURE_SAPPHIRE, 1f, 100, "elementalmod");
        offerBlasting(recipeExporter, List.of(ElementalModBlocks.VOID_DEBRIS), RecipeCategory.MISC, ElementalModItems.ENDERITE_SCRAP, 2f, 100, "elementalmod");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ElementalModItems.PURE_AMETHYST, RecipeCategory.MISC, ElementalModBlocks.PURE_AMETHYST_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ElementalModItems.PURE_EMERALD, RecipeCategory.MISC, ElementalModBlocks.PURE_EMERALD_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ElementalModItems.PURE_OPAL, RecipeCategory.MISC, ElementalModBlocks.PURE_OPAL_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ElementalModItems.PURE_RUBY, RecipeCategory.MISC, ElementalModBlocks.PURE_RUBY_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ElementalModItems.PURE_SAPPHIRE, RecipeCategory.MISC, ElementalModBlocks.PURE_SAPPHIRE_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ElementalModItems.ENDERITE_INGOT, RecipeCategory.MISC, ElementalModBlocks.ENDERITE_BLOCK);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.ENDERITE_INGOT, 1)
                .input(Items.DIAMOND, 4)
                .input(ElementalModItems.ENDERITE_SCRAP, 4)
                .criterion("has_diamond", conditionsFromItem(Items.DIAMOND))
                .criterion("has_enderite_scrap", conditionsFromItem(ElementalModItems.ENDERITE_SCRAP))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "enderite_scrap_to_enderite_ingot"));

        offerSmithingTrimRecipe(recipeExporter, ElementalModItems.RUBY_TEMPLATE, Identifier.of(ElementalMod.MOD_ID, "ruby_armor_trim"));
        offerSmithingTrimRecipe(recipeExporter, ElementalModItems.SAPPHIRE_TEMPLATE, Identifier.of(ElementalMod.MOD_ID, "sapphire_armor_trim"));
        offerSmithingTrimRecipe(recipeExporter, ElementalModItems.EMERALD_TEMPLATE, Identifier.of(ElementalMod.MOD_ID, "emerald_armor_trim"));
        offerSmithingTrimRecipe(recipeExporter, ElementalModItems.AMETHYST_TEMPLATE, Identifier.of(ElementalMod.MOD_ID, "amethyst_armor_trim"));
        offerSmithingTrimRecipe(recipeExporter, ElementalModItems.OPAL_TEMPLATE, Identifier.of(ElementalMod.MOD_ID, "opal_armor_trim"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ENDER_EYE, 1)
                .input(Items.ECHO_SHARD)
                .input(Items.PRISMARINE_SHARD)
                .input(Items.WIND_CHARGE)
                .input(Items.BLAZE_POWDER)
                .input(Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(Items.ENDER_PEARL),
                        FabricRecipeProvider.conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(recipeExporter, Identifier.of("minecraft", "eye_of_ender"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.RUBY_SMITHING_TEMPLATE)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_RUBY)
                .input('O', ElementalModItems.FIRE_ORB)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.FIRE_ORB), conditionsFromItem(ElementalModItems.FIRE_ORB))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "ruby_smithing_template"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_SAPPHIRE)
                .input('O', ElementalModItems.WATER_ORB)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.WATER_ORB), conditionsFromItem(ElementalModItems.WATER_ORB))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "sapphire_smithing_template"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.EMERALD_SMITHING_TEMPLATE)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_EMERALD)
                .input('O', ElementalModItems.EARTH_ORB)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.EARTH_ORB), conditionsFromItem(ElementalModItems.EARTH_ORB))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "emerald_smithing_template"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.AMETHYST_SMITHING_TEMPLATE)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_AMETHYST)
                .input('O', ElementalModItems.AIR_ORB)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.AIR_ORB), conditionsFromItem(ElementalModItems.AIR_ORB))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "amethyst_smithing_template"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.OPAL_SMITHING_TEMPLATE)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_OPAL)
                .input('O', ElementalModItems.LIGHTNING_ORB)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.LIGHTNING_ORB), conditionsFromItem(ElementalModItems.LIGHTNING_ORB))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "opal_smithing_template"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.RUBY_SMITHING_TEMPLATE, 2)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_RUBY)
                .input('O', ElementalModItems.RUBY_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.RUBY_SMITHING_TEMPLATE), conditionsFromItem(ElementalModItems.RUBY_SMITHING_TEMPLATE))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "ruby_duplicate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE, 2)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_SAPPHIRE)
                .input('O', ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE), conditionsFromItem(ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "sapphire_duplicate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.EMERALD_SMITHING_TEMPLATE, 2)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_EMERALD)
                .input('O', ElementalModItems.EMERALD_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.EMERALD_SMITHING_TEMPLATE), conditionsFromItem(ElementalModItems.EMERALD_SMITHING_TEMPLATE))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "emerald_duplicate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.AMETHYST_SMITHING_TEMPLATE, 2)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_AMETHYST)
                .input('O', ElementalModItems.AMETHYST_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.AMETHYST_SMITHING_TEMPLATE), conditionsFromItem(ElementalModItems.AMETHYST_SMITHING_TEMPLATE))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "amethyst_duplicate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ElementalModItems.OPAL_SMITHING_TEMPLATE, 2)
                .pattern("PDP")
                .pattern("POP")
                .pattern("PPP")
                .input('P', ElementalModItems.PURE_OPAL)
                .input('O', ElementalModItems.OPAL_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ElementalModItems.OPAL_SMITHING_TEMPLATE), conditionsFromItem(ElementalModItems.OPAL_SMITHING_TEMPLATE))
                .offerTo(recipeExporter, Identifier.of(ElementalMod.MOD_ID, "opal_duplicate"));
    }

    private void generateSmithingRecipes(Map<Item, Item> upgrades, Item template, Item addition, RecipeExporter recipeExporter) {
        for (Map.Entry<Item, Item> entry : upgrades.entrySet()) {
            Item base = entry.getKey();
            Item result = entry.getValue();

            SmithingTransformRecipeJsonBuilder.create(
                    Ingredient.ofItems(template),
                    Ingredient.ofItems(base),
                    Ingredient.ofItems(addition),
                    RecipeCategory.MISC,
                    result
            ).criterion(
                    "has_base", conditionsFromItem(base)
            ).offerTo(
                    recipeExporter,
                    Identifier.of(ElementalMod.MOD_ID,
                            "smithing/" + getItemPath(base) + "_to_" + getItemPath(result))
            );

        }
    }
}
