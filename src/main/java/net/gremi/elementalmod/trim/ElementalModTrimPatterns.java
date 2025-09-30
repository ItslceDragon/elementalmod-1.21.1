package net.gremi.elementalmod.trim;

import net.gremi.elementalmod.ElementalMod;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ElementalModTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> RUBY_TRIM = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
        Identifier.of(ElementalMod.MOD_ID, "ruby_trim"));
    public static final RegistryKey<ArmorTrimPattern> SAPPHIRE_TRIM = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "sapphire_trim"));
    public static final RegistryKey<ArmorTrimPattern> EMERALD_TRIM = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "emerald_trim"));
    public static final RegistryKey<ArmorTrimPattern> AMETHYST_TRIM = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "amethyst_trim"));
    public static final RegistryKey<ArmorTrimPattern> OPAL_TRIM = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "opal_trim"));
    public static final RegistryKey<ArmorTrimPattern> TRIM_6 = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "trim_6"));
    public static final RegistryKey<ArmorTrimPattern> TRIM_7 = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "trim_7"));
    public static final RegistryKey<ArmorTrimPattern> TRIM_8 = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "trim_8"));
    public static final RegistryKey<ArmorTrimPattern> TRIM_9 = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(ElementalMod.MOD_ID, "trim_9"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, ElementalModItems.RUBY_TEMPLATE, RUBY_TRIM);
        register(context, ElementalModItems.SAPPHIRE_TEMPLATE, SAPPHIRE_TRIM);
        register(context, ElementalModItems.EMERALD_TEMPLATE, EMERALD_TRIM);
        register(context, ElementalModItems.AMETHYST_TEMPLATE, AMETHYST_TRIM);
        register(context, ElementalModItems.OPAL_TEMPLATE, OPAL_TRIM);
    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item, RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(), Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);
        context.register(key, trimPattern);
    }
}
