package net.gremi.elementalmod.item;

import net.gremi.elementalmod.ElementalMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;


public class ElementalModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> PURE_RUBY = registerArmorMaterial("pure_ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ElementalModItems.PURE_RUBY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "pure_ruby"))), 2,0));

    public static final RegistryEntry<ArmorMaterial> PURE_SAPPHIRE = registerArmorMaterial("pure_sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ElementalModItems.PURE_SAPPHIRE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "pure_sapphire"))), 2,0));

    public static final RegistryEntry<ArmorMaterial> PURE_EMERALD = registerArmorMaterial("pure_emerald",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ElementalModItems.PURE_EMERALD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "pure_emerald"))), 2,0));

    public static final RegistryEntry<ArmorMaterial> PURE_AMETHYST = registerArmorMaterial("pure_amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ElementalModItems.PURE_AMETHYST),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "pure_amethyst"))), 2,0));

    public static final RegistryEntry<ArmorMaterial> PURE_OPAL = registerArmorMaterial("pure_opal",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ElementalModItems.PURE_OPAL),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "pure_opal"))), 2,0));

    public static final RegistryEntry<ArmorMaterial> NETH_RUBY = registerArmorMaterial("neth_ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_RUBY, Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "neth_ruby"))), 3,0.1f));

    public static final RegistryEntry<ArmorMaterial> NETH_SAPPHIRE = registerArmorMaterial("neth_sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_SAPPHIRE, Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "neth_sapphire"))), 3,0.1f));

    public static final RegistryEntry<ArmorMaterial> NETH_EMERALD = registerArmorMaterial("neth_emerald",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_EMERALD, Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "neth_emerald"))), 3,0.1f));

    public static final RegistryEntry<ArmorMaterial> NETH_AMETHYST = registerArmorMaterial("neth_amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_AMETHYST, Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "neth_amethyst"))), 3,0.1f));

    public static final RegistryEntry<ArmorMaterial> NETH_OPAL = registerArmorMaterial("neth_opal",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_OPAL, Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "neth_opal"))), 3,0.1f));

    public static final RegistryEntry<ArmorMaterial> END_RUBY = registerArmorMaterial("end_ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_RUBY, ElementalModItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "end_ruby"))), 4,2));

    public static final RegistryEntry<ArmorMaterial> END_SAPPHIRE = registerArmorMaterial("end_sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_SAPPHIRE, ElementalModItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "end_sapphire"))), 4,0.2f));

    public static final RegistryEntry<ArmorMaterial> END_EMERALD = registerArmorMaterial("end_emerald",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_EMERALD, ElementalModItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "end_emerald"))), 4,0.2f));

    public static final RegistryEntry<ArmorMaterial> END_AMETHYST = registerArmorMaterial("end_amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_AMETHYST, ElementalModItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "end_amethyst"))), 4,0.2f));

    public static final RegistryEntry<ArmorMaterial> END_OPAL = registerArmorMaterial("end_opal",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 2);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.PURE_OPAL, ElementalModItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "end_opal"))), 4,0.2f));

    public static final RegistryEntry<ArmorMaterial> NETHERITE = registerArmorMaterial("netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 13);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(Items.NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "enderite"))), 3,0.1f));

    public static final RegistryEntry<ArmorMaterial> ENDERITE = registerArmorMaterial("enderite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 17);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ElementalModItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalMod.MOD_ID, "enderite"))), 4,0.2f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ElementalMod.MOD_ID, name), material.get());
    }
}