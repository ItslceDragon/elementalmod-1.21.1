package net.gremi.elementalmod.trim;

import net.gremi.elementalmod.ElementalMod;
import net.gremi.elementalmod.item.ElementalModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ElementalModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> ENDERITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(ElementalMod.MOD_ID, "enderite"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, ENDERITE, Registries.ITEM.getEntry(ElementalModItems.ENDERITE_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#008080").getOrThrow()), 0.3f);
    }


    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
