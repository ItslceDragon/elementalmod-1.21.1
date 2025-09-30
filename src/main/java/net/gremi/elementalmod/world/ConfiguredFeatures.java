package net.gremi.elementalmod.world;

import net.gremi.elementalmod.ElementalMod;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURE_AMETHYST_ORE_KEY = registerKey("pure_amethyst_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURE_EMERALD_ORE_KEY = registerKey("pure_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURE_OPAL_ORE_KEY = registerKey("pure_opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURE_RUBY_ORE_KEY = registerKey("pure_ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURE_SAPPHIRE_ORE_KEY = registerKey("pure_sapphire_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldPureOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ElementalModBlocks.PURE_AMETHYST_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ElementalModBlocks.PURE_EMERALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ElementalModBlocks.PURE_OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ElementalModBlocks.PURE_RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ElementalModBlocks.PURE_SAPPHIRE_ORE.getDefaultState()));

        register(context, PURE_AMETHYST_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPureOres, 1));
        register(context, PURE_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPureOres, 1));
        register(context, PURE_OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPureOres, 1));
        register(context, PURE_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPureOres, 1));
        register(context, PURE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPureOres, 1));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ElementalMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}