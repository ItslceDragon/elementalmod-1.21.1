package net.gremi.elementalmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ElementalModBlocks.PURE_AMETHYST_BLOCK)
                .add(ElementalModBlocks.PURE_EMERALD_BLOCK)
                .add(ElementalModBlocks.PURE_OPAL_BLOCK)
                .add(ElementalModBlocks.PURE_RUBY_BLOCK)
                .add(ElementalModBlocks.PURE_SAPPHIRE_BLOCK)

                .add(ElementalModBlocks.PURE_AMETHYST_ORE)
                .add(ElementalModBlocks.PURE_EMERALD_ORE)
                .add(ElementalModBlocks.PURE_OPAL_ORE)
                .add(ElementalModBlocks.PURE_RUBY_ORE)
                .add(ElementalModBlocks.PURE_SAPPHIRE_ORE)

                .add(ElementalModBlocks.ENDERITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ElementalModBlocks.PURE_AMETHYST_BLOCK)
                .add(ElementalModBlocks.PURE_EMERALD_BLOCK)
                .add(ElementalModBlocks.PURE_OPAL_BLOCK)
                .add(ElementalModBlocks.PURE_RUBY_BLOCK)
                .add(ElementalModBlocks.PURE_SAPPHIRE_BLOCK)

                .add(ElementalModBlocks.PURE_AMETHYST_ORE)
                .add(ElementalModBlocks.PURE_EMERALD_ORE)
                .add(ElementalModBlocks.PURE_OPAL_ORE)
                .add(ElementalModBlocks.PURE_RUBY_ORE)
                .add(ElementalModBlocks.PURE_SAPPHIRE_ORE)

                .add(ElementalModBlocks.ENDERITE_BLOCK);




        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ElementalModBlocks.PURE_AMETHYST_BLOCK)
                .add(ElementalModBlocks.PURE_EMERALD_BLOCK)
                .add(ElementalModBlocks.PURE_OPAL_BLOCK)
                .add(ElementalModBlocks.PURE_RUBY_BLOCK)
                .add(ElementalModBlocks.PURE_SAPPHIRE_BLOCK)

                .add(ElementalModBlocks.ENDERITE_BLOCK);

    }
}
