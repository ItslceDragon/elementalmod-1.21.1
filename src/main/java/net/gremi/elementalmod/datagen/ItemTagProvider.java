package net.gremi.elementalmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ElementalModItems.PURE_AMETHYST)
                .add(ElementalModItems.PURE_EMERALD)
                .add(ElementalModItems.PURE_OPAL)
                .add(ElementalModItems.PURE_RUBY)
                .add(ElementalModItems.PURE_SAPPHIRE);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ElementalModItems.ENDERITE_INGOT);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ElementalModItems.RUBY_TEMPLATE)
                .add(ElementalModItems.SAPPHIRE_TEMPLATE)
                .add(ElementalModItems.EMERALD_TEMPLATE)
                .add(ElementalModItems.AMETHYST_TEMPLATE)
                .add(ElementalModItems.OPAL_TEMPLATE)
                .add(ElementalModItems.TRIM_6_TEMPLATE)
                .add(ElementalModItems.TRIM_7_TEMPLATE)
                .add(ElementalModItems.TRIM_8_TEMPLATE)
                .add(ElementalModItems.TRIM_9_TEMPLATE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ElementalModItems.PURE_RUBY_SWORD)
                .add(ElementalModItems.PURE_SAPPHIRE_SWORD)
                .add(ElementalModItems.PURE_EMERALD_SWORD)
                .add(ElementalModItems.PURE_AMETHYST_SWORD)
                .add(ElementalModItems.PURE_OPAL_SWORD);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ElementalModItems.PURE_RUBY_HELMET)
                .add(ElementalModItems.PURE_RUBY_CHESTPLATE)
                .add(ElementalModItems.PURE_RUBY_LEGGINGS)
                .add(ElementalModItems.PURE_RUBY_BOOTS)
                .add(ElementalModItems.PURE_SAPPHIRE_HELMET)
                .add(ElementalModItems.PURE_SAPPHIRE_CHESTPLATE)
                .add(ElementalModItems.PURE_SAPPHIRE_LEGGINGS)
                .add(ElementalModItems.PURE_SAPPHIRE_BOOTS)
                .add(ElementalModItems.PURE_EMERALD_HELMET)
                .add(ElementalModItems.PURE_EMERALD_CHESTPLATE)
                .add(ElementalModItems.PURE_EMERALD_LEGGINGS)
                .add(ElementalModItems.PURE_EMERALD_BOOTS)
                .add(ElementalModItems.PURE_AMETHYST_HELMET)
                .add(ElementalModItems.PURE_AMETHYST_CHESTPLATE)
                .add(ElementalModItems.PURE_AMETHYST_LEGGINGS)
                .add(ElementalModItems.PURE_AMETHYST_BOOTS)
                .add(ElementalModItems.PURE_OPAL_HELMET)
                .add(ElementalModItems.PURE_OPAL_CHESTPLATE)
                .add(ElementalModItems.PURE_OPAL_LEGGINGS)
                .add(ElementalModItems.PURE_OPAL_BOOTS)
                .add(ElementalModItems.NETH_RUBY_HELMET)
                .add(ElementalModItems.NETH_RUBY_CHESTPLATE)
                .add(ElementalModItems.NETH_RUBY_LEGGINGS)
                .add(ElementalModItems.NETH_RUBY_BOOTS)
                .add(ElementalModItems.NETH_SAPPHIRE_HELMET)
                .add(ElementalModItems.NETH_SAPPHIRE_CHESTPLATE)
                .add(ElementalModItems.NETH_SAPPHIRE_LEGGINGS)
                .add(ElementalModItems.NETH_SAPPHIRE_BOOTS)
                .add(ElementalModItems.NETH_EMERALD_HELMET)
                .add(ElementalModItems.NETH_EMERALD_CHESTPLATE)
                .add(ElementalModItems.NETH_EMERALD_LEGGINGS)
                .add(ElementalModItems.NETH_EMERALD_BOOTS)
                .add(ElementalModItems.NETH_AMETHYST_HELMET)
                .add(ElementalModItems.NETH_AMETHYST_CHESTPLATE)
                .add(ElementalModItems.NETH_AMETHYST_LEGGINGS)
                .add(ElementalModItems.NETH_AMETHYST_BOOTS)
                .add(ElementalModItems.NETH_OPAL_HELMET)
                .add(ElementalModItems.NETH_OPAL_CHESTPLATE)
                .add(ElementalModItems.NETH_OPAL_LEGGINGS)
                .add(ElementalModItems.NETH_OPAL_BOOTS)
                .add(ElementalModItems.END_RUBY_HELMET)
                .add(ElementalModItems.END_RUBY_CHESTPLATE)
                .add(ElementalModItems.END_RUBY_LEGGINGS)
                .add(ElementalModItems.END_RUBY_BOOTS)
                .add(ElementalModItems.END_SAPPHIRE_HELMET)
                .add(ElementalModItems.END_SAPPHIRE_CHESTPLATE)
                .add(ElementalModItems.END_SAPPHIRE_LEGGINGS)
                .add(ElementalModItems.END_SAPPHIRE_BOOTS)
                .add(ElementalModItems.END_EMERALD_HELMET)
                .add(ElementalModItems.END_EMERALD_CHESTPLATE)
                .add(ElementalModItems.END_EMERALD_LEGGINGS)
                .add(ElementalModItems.END_EMERALD_BOOTS)
                .add(ElementalModItems.END_AMETHYST_HELMET)
                .add(ElementalModItems.END_AMETHYST_CHESTPLATE)
                .add(ElementalModItems.END_AMETHYST_LEGGINGS)
                .add(ElementalModItems.END_AMETHYST_BOOTS)
                .add(ElementalModItems.END_OPAL_HELMET)
                .add(ElementalModItems.END_OPAL_CHESTPLATE)
                .add(ElementalModItems.END_OPAL_LEGGINGS)
                .add(ElementalModItems.END_OPAL_BOOTS)
                .add(ElementalModItems.ENDERITE_HELMET)
                .add(ElementalModItems.ENDERITE_CHESTPLATE)
                .add(ElementalModItems.ENDERITE_LEGGINGS)
                .add(ElementalModItems.ENDERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ElementalModItems.ENDERITE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ElementalModItems.ENDERITE_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ElementalModItems.ENDERITE_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ElementalModItems.ENDERITE_HOE);
    }
}
