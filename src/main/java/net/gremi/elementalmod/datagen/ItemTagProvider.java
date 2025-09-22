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
    }
}
