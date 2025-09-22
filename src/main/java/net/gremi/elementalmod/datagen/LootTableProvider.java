package net.gremi.elementalmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ElementalModBlocks.PURE_AMETHYST_BLOCK);
        addDrop(ElementalModBlocks.PURE_EMERALD_BLOCK);
        addDrop(ElementalModBlocks.PURE_OPAL_BLOCK);
        addDrop(ElementalModBlocks.PURE_RUBY_BLOCK);
        addDrop(ElementalModBlocks.PURE_SAPPHIRE_BLOCK);
        addDrop(ElementalModBlocks.ENDERITE_BLOCK);

        addDrop(ElementalModBlocks.PURE_AMETHYST_ORE, oreDrops(ElementalModBlocks.PURE_AMETHYST_ORE, ElementalModItems.PURE_AMETHYST));
        addDrop(ElementalModBlocks.PURE_EMERALD_ORE, oreDrops(ElementalModBlocks.PURE_EMERALD_ORE, ElementalModItems.PURE_EMERALD));
        addDrop(ElementalModBlocks.PURE_OPAL_ORE, oreDrops(ElementalModBlocks.PURE_OPAL_ORE, ElementalModItems.PURE_OPAL));
        addDrop(ElementalModBlocks.PURE_RUBY_ORE, oreDrops(ElementalModBlocks.PURE_RUBY_ORE, ElementalModItems.PURE_RUBY));
        addDrop(ElementalModBlocks.PURE_SAPPHIRE_ORE, oreDrops(ElementalModBlocks.PURE_SAPPHIRE_ORE, ElementalModItems.PURE_SAPPHIRE));
    }
}
