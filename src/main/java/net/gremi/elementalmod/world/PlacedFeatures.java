package net.gremi.elementalmod.world;

import net.gremi.elementalmod.ElementalMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class PlacedFeatures {
    public static final RegistryKey<PlacedFeature> PURE_AMETHYST_ORE_PLACED_KEY = registerKey("pure_amethyst_ore_placed");
    public static final RegistryKey<PlacedFeature> PURE_EMERALD_ORE_PLACED_KEY = registerKey("pure_emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> PURE_OPAL_ORE_PLACED_KEY = registerKey("pure_opal_ore_placed");
    public static final RegistryKey<PlacedFeature> PURE_RUBY_ORE_PLACED_KEY = registerKey("pure_ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> PURE_SAPPHIRE_ORE_PLACED_KEY = registerKey("pure_sapphire_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PURE_AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.PURE_AMETHYST_ORE_KEY),
                OrePlacement.modifiersWithCount(1000,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(-40))));
        register(context, PURE_EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.PURE_EMERALD_ORE_KEY),
                OrePlacement.modifiersWithCount(1000,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(-40))));
        register(context, PURE_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.PURE_OPAL_ORE_KEY),
                OrePlacement.modifiersWithCount(1000,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(-40))));
        register(context, PURE_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.PURE_RUBY_ORE_KEY),
                OrePlacement.modifiersWithCount(1000,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(-40))));
        register(context, PURE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.PURE_SAPPHIRE_ORE_KEY),
                OrePlacement.modifiersWithCount(1000,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(-40))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ElementalMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier...modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
