package net.gremi.elementalmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gremi.elementalmod.ElementalMod;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
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
    }
}
