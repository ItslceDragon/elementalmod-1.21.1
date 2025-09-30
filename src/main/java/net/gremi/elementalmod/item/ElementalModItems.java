package net.gremi.elementalmod.item;

import net.gremi.elementalmod.ElementalMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class ElementalModItems {
    public static final Item PURE_AMETHYST = registerItem("pure_amethyst", new Item(new Item.Settings()));
    public static final Item PURE_EMERALD = registerItem("pure_emerald", new Item(new Item.Settings()));
    public static final Item PURE_OPAL = registerItem("pure_opal", new Item(new Item.Settings()));
    public static final Item PURE_RUBY = registerItem("pure_ruby", new Item(new Item.Settings()));
    public static final Item PURE_SAPPHIRE = registerItem("pure_sapphire", new Item(new Item.Settings()));

    public static final Item FIRE_ORB = registerItem("fire_orb", new Item(new Item.Settings()));
    public static final Item WATER_ORB = registerItem("water_orb", new Item(new Item.Settings()));
    public static final Item EARTH_ORB = registerItem("earth_orb", new Item(new Item.Settings()));
    public static final Item AIR_ORB = registerItem("air_orb", new Item(new Item.Settings()));
    public static final Item LIGHTNING_ORB = registerItem("lightning_orb", new Item(new Item.Settings()));

    public static final Item RUBY_SMITHING_TEMPLATE = registerItem("ruby_smithing_template", new Item(new Item.Settings()));
    public static final Item SAPPHIRE_SMITHING_TEMPLATE = registerItem("sapphire_smithing_template", new Item(new Item.Settings()));
    public static final Item EMERALD_SMITHING_TEMPLATE = registerItem("emerald_smithing_template", new Item(new Item.Settings()));
    public static final Item AMETHYST_SMITHING_TEMPLATE = registerItem("amethyst_smithing_template", new Item(new Item.Settings()));
    public static final Item OPAL_SMITHING_TEMPLATE = registerItem("opal_smithing_template", new Item(new Item.Settings()));
    public static final Item ENDERITE_SMITHING_TEMPLATE = registerItem("enderite_smithing_template", new Item(new Item.Settings()));

    public static final Item REINFORCED_RUBY = registerItem("reinforced_ruby", new Item(new Item.Settings()));
    public static final Item REINFORCED_SAPPHIRE = registerItem("reinforced_sapphire", new Item(new Item.Settings()));
    public static final Item REINFORCED_EMERALD = registerItem("reinforced_emerald", new Item(new Item.Settings()));
    public static final Item REINFORCED_AMETHYST = registerItem("reinforced_amethyst", new Item(new Item.Settings()));
    public static final Item REINFORCED_OPAL = registerItem("reinforced_opal", new Item(new Item.Settings()));

    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));
    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap", new Item(new Item.Settings()));

    public static final Item PURE_RUBY_HELMET = registerItem("pure_ruby_helmet", new ArmorItem(ElementalModArmorMaterials.PURE_RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item PURE_RUBY_CHESTPLATE = registerItem("pure_ruby_chestplate", new ArmorItem(ElementalModArmorMaterials.PURE_RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item PURE_RUBY_LEGGINGS = registerItem("pure_ruby_leggings", new ArmorItem(ElementalModArmorMaterials.PURE_RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item PURE_RUBY_BOOTS = registerItem("pure_ruby_boots", new ArmorItem(ElementalModArmorMaterials.PURE_RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));
    public static final Item PURE_RUBY_SWORD = registerItem("pure_ruby_sword", new SwordItem(ElementalModToolMaterials.PURE_RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_RUBY, 3, -2.4f))));
    public static final Item PURE_SAPPHIRE_HELMET = registerItem("pure_sapphire_helmet", new ArmorItem(ElementalModArmorMaterials.PURE_SAPPHIRE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item PURE_SAPPHIRE_CHESTPLATE = registerItem("pure_sapphire_chestplate", new ArmorItem(ElementalModArmorMaterials.PURE_SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item PURE_SAPPHIRE_LEGGINGS = registerItem("pure_sapphire_leggings", new ArmorItem(ElementalModArmorMaterials.PURE_SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item PURE_SAPPHIRE_BOOTS = registerItem("pure_sapphire_boots", new ArmorItem(ElementalModArmorMaterials.PURE_SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));
    public static final Item PURE_SAPPHIRE_SWORD = registerItem("pure_sapphire_sword", new SwordItem(ElementalModToolMaterials.PURE_SAPPHIRE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_SAPPHIRE, 3, -2.4f))));
    public static final Item PURE_EMERALD_HELMET = registerItem("pure_emerald_helmet", new ArmorItem(ElementalModArmorMaterials.PURE_EMERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item PURE_EMERALD_CHESTPLATE = registerItem("pure_emerald_chestplate", new ArmorItem(ElementalModArmorMaterials.PURE_EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item PURE_EMERALD_LEGGINGS = registerItem("pure_emerald_leggings", new ArmorItem(ElementalModArmorMaterials.PURE_EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item PURE_EMERALD_BOOTS = registerItem("pure_emerald_boots", new ArmorItem(ElementalModArmorMaterials.PURE_EMERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));
    public static final Item PURE_EMERALD_SWORD = registerItem("pure_emerald_sword", new SwordItem(ElementalModToolMaterials.PURE_EMERALD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_EMERALD, 3, -2.4f))));
    public static final Item PURE_AMETHYST_HELMET = registerItem("pure_amethyst_helmet", new ArmorItem(ElementalModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item PURE_AMETHYST_CHESTPLATE = registerItem("pure_amethyst_chestplate", new ArmorItem(ElementalModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item PURE_AMETHYST_LEGGINGS = registerItem("pure_amethyst_leggings", new ArmorItem(ElementalModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item PURE_AMETHYST_BOOTS = registerItem("pure_amethyst_boots", new ArmorItem(ElementalModArmorMaterials.PURE_AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));
    public static final Item PURE_AMETHYST_SWORD = registerItem("pure_amethyst_sword", new SwordItem(ElementalModToolMaterials.PURE_AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_AMETHYST, 3, -2.4f))));
    public static final Item PURE_OPAL_HELMET = registerItem("pure_opal_helmet", new ArmorItem(ElementalModArmorMaterials.PURE_OPAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item PURE_OPAL_CHESTPLATE = registerItem("pure_opal_chestplate", new ArmorItem(ElementalModArmorMaterials.PURE_OPAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item PURE_OPAL_LEGGINGS = registerItem("pure_opal_leggings", new ArmorItem(ElementalModArmorMaterials.PURE_OPAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item PURE_OPAL_BOOTS = registerItem("pure_opal_boots", new ArmorItem(ElementalModArmorMaterials.PURE_OPAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));
    public static final Item PURE_OPAL_SWORD = registerItem("pure_opal_sword", new SwordItem(ElementalModToolMaterials.PURE_OPAL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_OPAL, 3, -2.4f))));

    public static final Item NETH_RUBY_HELMET = registerItem("neth_ruby_helmet", new ArmorItem(ElementalModArmorMaterials.NETH_RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item NETH_RUBY_CHESTPLATE = registerItem("neth_ruby_chestplate", new ArmorItem(ElementalModArmorMaterials.NETH_RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item NETH_RUBY_LEGGINGS = registerItem("neth_ruby_leggings", new ArmorItem(ElementalModArmorMaterials.NETH_RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item NETH_RUBY_BOOTS = registerItem("neth_ruby_boots", new ArmorItem(ElementalModArmorMaterials.NETH_RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item NETH_RUBY_SWORD = registerItem("neth_ruby_sword", new SwordItem(ElementalModToolMaterials.NETH_RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_RUBY, 4, -2.4f))));
    public static final Item NETH_SAPPHIRE_HELMET = registerItem("neth_sapphire_helmet", new ArmorItem(ElementalModArmorMaterials.NETH_SAPPHIRE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item NETH_SAPPHIRE_CHESTPLATE = registerItem("neth_sapphire_chestplate", new ArmorItem(ElementalModArmorMaterials.NETH_SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item NETH_SAPPHIRE_LEGGINGS = registerItem("neth_sapphire_leggings", new ArmorItem(ElementalModArmorMaterials.NETH_SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item NETH_SAPPHIRE_BOOTS = registerItem("neth_sapphire_boots", new ArmorItem(ElementalModArmorMaterials.NETH_SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item NETH_SAPPHIRE_SWORD = registerItem("neth_sapphire_sword", new SwordItem(ElementalModToolMaterials.NETH_SAPPHIRE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_SAPPHIRE, 4, -2.4f))));
    public static final Item NETH_EMERALD_HELMET = registerItem("neth_emerald_helmet", new ArmorItem(ElementalModArmorMaterials.NETH_EMERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item NETH_EMERALD_CHESTPLATE = registerItem("neth_emerald_chestplate", new ArmorItem(ElementalModArmorMaterials.NETH_EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item NETH_EMERALD_LEGGINGS = registerItem("neth_emerald_leggings", new ArmorItem(ElementalModArmorMaterials.NETH_EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item NETH_EMERALD_BOOTS = registerItem("neth_emerald_boots", new ArmorItem(ElementalModArmorMaterials.NETH_EMERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item NETH_EMERALD_SWORD = registerItem("neth_emerald_sword", new SwordItem(ElementalModToolMaterials.NETH_EMERALD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_EMERALD, 4, -2.4f))));
    public static final Item NETH_AMETHYST_HELMET = registerItem("neth_amethyst_helmet", new ArmorItem(ElementalModArmorMaterials.NETH_AMETHYST, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item NETH_AMETHYST_CHESTPLATE = registerItem("neth_amethyst_chestplate", new ArmorItem(ElementalModArmorMaterials.NETH_AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item NETH_AMETHYST_LEGGINGS = registerItem("neth_amethyst_leggings", new ArmorItem(ElementalModArmorMaterials.NETH_AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item NETH_AMETHYST_BOOTS = registerItem("neth_amethyst_boots", new ArmorItem(ElementalModArmorMaterials.NETH_AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item NETH_AMETHYST_SWORD = registerItem("neth_amethyst_sword", new SwordItem(ElementalModToolMaterials.NETH_AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_AMETHYST, 4, -2.4f))));
    public static final Item NETH_OPAL_HELMET = registerItem("neth_opal_helmet", new ArmorItem(ElementalModArmorMaterials.NETH_OPAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item NETH_OPAL_CHESTPLATE = registerItem("neth_opal_chestplate", new ArmorItem(ElementalModArmorMaterials.NETH_OPAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item NETH_OPAL_LEGGINGS = registerItem("neth_opal_leggings", new ArmorItem(ElementalModArmorMaterials.NETH_OPAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item NETH_OPAL_BOOTS = registerItem("neth_opal_boots", new ArmorItem(ElementalModArmorMaterials.NETH_OPAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));
    public static final Item NETH_OPAL_SWORD = registerItem("neth_opal_sword", new SwordItem(ElementalModToolMaterials.NETH_OPAL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_OPAL, 4, -2.4f))));

    public static final Item END_RUBY_HELMET = registerItem("end_ruby_helmet", new ArmorItem(ElementalModArmorMaterials.END_RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(41))));
    public static final Item END_RUBY_CHESTPLATE = registerItem("end_ruby_chestplate", new ArmorItem(ElementalModArmorMaterials.END_RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(41))));
    public static final Item END_RUBY_LEGGINGS = registerItem("end_ruby_leggings", new ArmorItem(ElementalModArmorMaterials.END_RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(41))));
    public static final Item END_RUBY_BOOTS = registerItem("end_ruby_boots", new ArmorItem(ElementalModArmorMaterials.END_RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(41))));
    public static final Item END_RUBY_SWORD = registerItem("end_ruby_sword", new SwordItem(ElementalModToolMaterials.END_RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_RUBY, 5, -2.4f))));
    public static final Item END_SAPPHIRE_HELMET = registerItem("end_sapphire_helmet", new ArmorItem(ElementalModArmorMaterials.END_SAPPHIRE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(41))));
    public static final Item END_SAPPHIRE_CHESTPLATE = registerItem("end_sapphire_chestplate", new ArmorItem(ElementalModArmorMaterials.END_SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(41))));
    public static final Item END_SAPPHIRE_LEGGINGS = registerItem("end_sapphire_leggings", new ArmorItem(ElementalModArmorMaterials.END_SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(41))));
    public static final Item END_SAPPHIRE_BOOTS = registerItem("end_sapphire_boots", new ArmorItem(ElementalModArmorMaterials.END_SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(41))));
    public static final Item END_SAPPHIRE_SWORD = registerItem("end_sapphire_sword", new SwordItem(ElementalModToolMaterials.END_SAPPHIRE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_SAPPHIRE, 5, -2.4f))));
    public static final Item END_EMERALD_HELMET = registerItem("end_emerald_helmet", new ArmorItem(ElementalModArmorMaterials.END_EMERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(41))));
    public static final Item END_EMERALD_CHESTPLATE = registerItem("end_emerald_chestplate", new ArmorItem(ElementalModArmorMaterials.END_EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(41))));
    public static final Item END_EMERALD_LEGGINGS = registerItem("end_emerald_leggings", new ArmorItem(ElementalModArmorMaterials.END_EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(41))));
    public static final Item END_EMERALD_BOOTS = registerItem("end_emerald_boots", new ArmorItem(ElementalModArmorMaterials.END_EMERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(41))));
    public static final Item END_EMERALD_SWORD = registerItem("end_emerald_sword", new SwordItem(ElementalModToolMaterials.END_EMERALD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_EMERALD, 5, -2.4f))));
    public static final Item END_AMETHYST_HELMET = registerItem("end_amethyst_helmet", new ArmorItem(ElementalModArmorMaterials.END_AMETHYST, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(41))));
    public static final Item END_AMETHYST_CHESTPLATE = registerItem("end_amethyst_chestplate", new ArmorItem(ElementalModArmorMaterials.END_AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(41))));
    public static final Item END_AMETHYST_LEGGINGS = registerItem("end_amethyst_leggings", new ArmorItem(ElementalModArmorMaterials.END_AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(41))));
    public static final Item END_AMETHYST_BOOTS = registerItem("end_amethyst_boots", new ArmorItem(ElementalModArmorMaterials.END_AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(41))));
    public static final Item END_AMETHYST_SWORD = registerItem("end_amethyst_sword", new SwordItem(ElementalModToolMaterials.END_AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_AMETHYST, 5, -2.4f))));
    public static final Item END_OPAL_HELMET = registerItem("end_opal_helmet", new ArmorItem(ElementalModArmorMaterials.END_OPAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(41))));
    public static final Item END_OPAL_CHESTPLATE = registerItem("end_opal_chestplate", new ArmorItem(ElementalModArmorMaterials.END_OPAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(41))));
    public static final Item END_OPAL_LEGGINGS = registerItem("end_opal_leggings", new ArmorItem(ElementalModArmorMaterials.END_OPAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(41))));
    public static final Item END_OPAL_BOOTS = registerItem("end_opal_boots", new ArmorItem(ElementalModArmorMaterials.END_OPAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(41))));
    public static final Item END_OPAL_SWORD = registerItem("end_opal_sword", new SwordItem(ElementalModToolMaterials.END_OPAL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.PURE_OPAL, 5, -2.4f))));

    public static final Item ENDERITE_SWORD = registerItem("enderite_sword", new SwordItem(ElementalModToolMaterials.ENDERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.ENDERITE, 3, -2.4f))));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe", new PickaxeItem(ElementalModToolMaterials.ENDERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.ENDERITE, 1, -2.8f))));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe", new AxeItem(ElementalModToolMaterials.ENDERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.ENDERITE, 5, -3f))));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel", new ShovelItem(ElementalModToolMaterials.ENDERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.ENDERITE, 2, -3f))));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe", new HoeItem(ElementalModToolMaterials.ENDERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ElementalModToolMaterials.ENDERITE, -5, 0))));
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet", new ArmorItem(ElementalModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(41))));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate", new ArmorItem(ElementalModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(41))));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings", new ArmorItem(ElementalModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(41))));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots", new ArmorItem(ElementalModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(41))));

    public static final Item RUBY_TEMPLATE = registerItem("ruby_armor_trim",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "ruby_armor_trim"), FeatureFlags.VANILLA));
    public static final Item SAPPHIRE_TEMPLATE = registerItem("sapphire_armor_trim",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "sapphire_armor_trim"), FeatureFlags.VANILLA));
    public static final Item EMERALD_TEMPLATE = registerItem("emerald_armor_trim",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "emerald_armor_trim"), FeatureFlags.VANILLA));
    public static final Item AMETHYST_TEMPLATE = registerItem("amethyst_armor_trim",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "amethyst_armor_trim"), FeatureFlags.VANILLA));
    public static final Item OPAL_TEMPLATE = registerItem("opal_armor_trim",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "opal_armor_trim"), FeatureFlags.VANILLA));
    public static final Item TRIM_6_TEMPLATE = registerItem("trim_6_template",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "trim"), FeatureFlags.VANILLA));
    public static final Item TRIM_7_TEMPLATE = registerItem("trim_7_template",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "trim"), FeatureFlags.VANILLA));
    public static final Item TRIM_8_TEMPLATE = registerItem("trim_8_template",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "trim"), FeatureFlags.VANILLA));
    public static final Item TRIM_9_TEMPLATE = registerItem("trim_9_template",
            SmithingTemplateItem.of(Identifier.of(ElementalMod.MOD_ID, "trim"), FeatureFlags.VANILLA));

    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            new AnimalArmorItem(ElementalModArmorMaterials.NETHERITE, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item ENDERITE_HORSE_ARMOR = registerItem("enderite_horse_armor",
            new AnimalArmorItem(ElementalModArmorMaterials.ENDERITE, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    public static final Item GOLD_SHIELD = registerItem("gold_shield",
            new ShieldItem(new Item.Settings().maxDamage(610)){
                @Override
                public boolean canRepair(ItemStack stack, ItemStack ingredient) {
                    return ingredient.isOf(Items.GOLD_INGOT);
                }
            });

    public static final Item DIAMOND_SHIELD = registerItem("diamond_shield",
            new ShieldItem(new Item.Settings().maxDamage(610)){
                @Override
                public boolean canRepair(ItemStack stack, ItemStack ingredient) {
                    return ingredient.isOf(Items.DIAMOND);
                }
            });

    public static final Item NETHERITE_SHIELD = registerItem("netherite_shield",
            new ShieldItem(new Item.Settings().maxDamage(610)){
                @Override
                public boolean canRepair(ItemStack stack, ItemStack ingredient) {
                    return ingredient.isOf(Items.NETHERITE_INGOT);
                }
            });

    public static final Item ENDERITE_SHIELD = registerItem("enderite_shield",
            new ShieldItem(new Item.Settings().maxDamage(610)){
                @Override
                public boolean canRepair(ItemStack stack, ItemStack ingredient) {
                    return ingredient.isOf(ElementalModItems.ENDERITE_INGOT);
                }
            });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ElementalMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ElementalMod.LOGGER.info("Registering Mod Items for " + ElementalMod.MOD_ID);
    }
}
