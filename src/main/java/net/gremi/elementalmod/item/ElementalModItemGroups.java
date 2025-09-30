package net.gremi.elementalmod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gremi.elementalmod.ElementalMod;
import net.gremi.elementalmod.block.ElementalModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ElementalModItemGroups {

    public static final ItemGroup ELEMENTAL_MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ElementalMod.MOD_ID, "elementalmod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ElementalModItems.PURE_EMERALD)).displayName(Text.translatable("itemgroup.elementalmod_items")).entries((displayContext, entries) -> {
                entries.add(ElementalModItems.PURE_AMETHYST);
                entries.add(ElementalModItems.PURE_EMERALD);
                entries.add(ElementalModItems.PURE_OPAL);
                entries.add(ElementalModItems.PURE_RUBY);
                entries.add(ElementalModItems.PURE_SAPPHIRE);

                entries.add(ElementalModItems.FIRE_ORB);
                entries.add(ElementalModItems.WATER_ORB);
                entries.add(ElementalModItems.EARTH_ORB);
                entries.add(ElementalModItems.AIR_ORB);
                entries.add(ElementalModItems.LIGHTNING_ORB);

                entries.add(ElementalModItems.RUBY_SMITHING_TEMPLATE);
                entries.add(ElementalModItems.SAPPHIRE_SMITHING_TEMPLATE);
                entries.add(ElementalModItems.EMERALD_SMITHING_TEMPLATE);
                entries.add(ElementalModItems.AMETHYST_SMITHING_TEMPLATE);
                entries.add(ElementalModItems.OPAL_SMITHING_TEMPLATE);
                entries.add(ElementalModItems.ENDERITE_SMITHING_TEMPLATE);

                entries.add(ElementalModItems.REINFORCED_RUBY);
                entries.add(ElementalModItems.REINFORCED_SAPPHIRE);
                entries.add(ElementalModItems.REINFORCED_EMERALD);
                entries.add(ElementalModItems.REINFORCED_AMETHYST);
                entries.add(ElementalModItems.REINFORCED_OPAL);

                entries.add(ElementalModBlocks.PURE_AMETHYST_BLOCK);
                entries.add(ElementalModBlocks.PURE_EMERALD_BLOCK);
                entries.add(ElementalModBlocks.PURE_OPAL_BLOCK);
                entries.add(ElementalModBlocks.PURE_RUBY_BLOCK);
                entries.add(ElementalModBlocks.PURE_SAPPHIRE_BLOCK);

                entries.add(ElementalModBlocks.PURE_AMETHYST_ORE);
                entries.add(ElementalModBlocks.PURE_EMERALD_ORE);
                entries.add(ElementalModBlocks.PURE_OPAL_ORE);
                entries.add(ElementalModBlocks.PURE_RUBY_ORE);
                entries.add(ElementalModBlocks.PURE_SAPPHIRE_ORE);

                entries.add(ElementalModItems.ENDERITE_INGOT);
                entries.add(ElementalModItems.ENDERITE_SCRAP);
                entries.add(ElementalModBlocks.ENDERITE_BLOCK);
                entries.add(ElementalModBlocks.VOID_DEBRIS);

                entries.add(ElementalModItems.RUBY_TEMPLATE);
                entries.add(ElementalModItems.SAPPHIRE_TEMPLATE);
                entries.add(ElementalModItems.EMERALD_TEMPLATE);
                entries.add(ElementalModItems.AMETHYST_TEMPLATE);
                entries.add(ElementalModItems.OPAL_TEMPLATE);
                entries.add(ElementalModItems.TRIM_6_TEMPLATE);
                entries.add(ElementalModItems.TRIM_7_TEMPLATE);
                entries.add(ElementalModItems.TRIM_8_TEMPLATE);
                entries.add(ElementalModItems.TRIM_9_TEMPLATE);

                entries.add(ElementalModItems.NETHERITE_HORSE_ARMOR);
                entries.add(ElementalModItems.ENDERITE_HORSE_ARMOR);

                entries.add(ElementalModItems.PURE_RUBY_SWORD);
                entries.add(ElementalModItems.PURE_RUBY_HELMET);
                entries.add(ElementalModItems.PURE_RUBY_CHESTPLATE);
                entries.add(ElementalModItems.PURE_RUBY_LEGGINGS);
                entries.add(ElementalModItems.PURE_RUBY_BOOTS);

                entries.add(ElementalModItems.PURE_SAPPHIRE_SWORD);
                entries.add(ElementalModItems.PURE_SAPPHIRE_HELMET);
                entries.add(ElementalModItems.PURE_SAPPHIRE_CHESTPLATE);
                entries.add(ElementalModItems.PURE_SAPPHIRE_LEGGINGS);
                entries.add(ElementalModItems.PURE_SAPPHIRE_BOOTS);

                entries.add(ElementalModItems.PURE_EMERALD_SWORD);
                entries.add(ElementalModItems.PURE_EMERALD_HELMET);
                entries.add(ElementalModItems.PURE_EMERALD_CHESTPLATE);
                entries.add(ElementalModItems.PURE_EMERALD_LEGGINGS);
                entries.add(ElementalModItems.PURE_EMERALD_BOOTS);

                entries.add(ElementalModItems.PURE_AMETHYST_SWORD);
                entries.add(ElementalModItems.PURE_AMETHYST_HELMET);
                entries.add(ElementalModItems.PURE_AMETHYST_CHESTPLATE);
                entries.add(ElementalModItems.PURE_AMETHYST_LEGGINGS);
                entries.add(ElementalModItems.PURE_AMETHYST_BOOTS);

                entries.add(ElementalModItems.PURE_OPAL_SWORD);
                entries.add(ElementalModItems.PURE_OPAL_HELMET);
                entries.add(ElementalModItems.PURE_OPAL_CHESTPLATE);
                entries.add(ElementalModItems.PURE_OPAL_LEGGINGS);
                entries.add(ElementalModItems.PURE_OPAL_BOOTS);

                entries.add(ElementalModItems.NETH_RUBY_SWORD);
                entries.add(ElementalModItems.NETH_RUBY_HELMET);
                entries.add(ElementalModItems.NETH_RUBY_CHESTPLATE);
                entries.add(ElementalModItems.NETH_RUBY_LEGGINGS);
                entries.add(ElementalModItems.NETH_RUBY_BOOTS);

                entries.add(ElementalModItems.NETH_SAPPHIRE_SWORD);
                entries.add(ElementalModItems.NETH_SAPPHIRE_HELMET);
                entries.add(ElementalModItems.NETH_SAPPHIRE_CHESTPLATE);
                entries.add(ElementalModItems.NETH_SAPPHIRE_LEGGINGS);
                entries.add(ElementalModItems.NETH_SAPPHIRE_BOOTS);

                entries.add(ElementalModItems.NETH_EMERALD_SWORD);
                entries.add(ElementalModItems.NETH_EMERALD_HELMET);
                entries.add(ElementalModItems.NETH_EMERALD_CHESTPLATE);
                entries.add(ElementalModItems.NETH_EMERALD_LEGGINGS);
                entries.add(ElementalModItems.NETH_EMERALD_BOOTS);

                entries.add(ElementalModItems.NETH_AMETHYST_SWORD);
                entries.add(ElementalModItems.NETH_AMETHYST_HELMET);
                entries.add(ElementalModItems.NETH_AMETHYST_CHESTPLATE);
                entries.add(ElementalModItems.NETH_AMETHYST_LEGGINGS);
                entries.add(ElementalModItems.NETH_AMETHYST_BOOTS);

                entries.add(ElementalModItems.NETH_OPAL_SWORD);
                entries.add(ElementalModItems.NETH_OPAL_HELMET);
                entries.add(ElementalModItems.NETH_OPAL_CHESTPLATE);
                entries.add(ElementalModItems.NETH_OPAL_LEGGINGS);
                entries.add(ElementalModItems.NETH_OPAL_BOOTS);

                entries.add(ElementalModItems.END_RUBY_SWORD);
                entries.add(ElementalModItems.END_RUBY_HELMET);
                entries.add(ElementalModItems.END_RUBY_CHESTPLATE);
                entries.add(ElementalModItems.END_RUBY_LEGGINGS);
                entries.add(ElementalModItems.END_RUBY_BOOTS);

                entries.add(ElementalModItems.END_SAPPHIRE_SWORD);
                entries.add(ElementalModItems.END_SAPPHIRE_HELMET);
                entries.add(ElementalModItems.END_SAPPHIRE_CHESTPLATE);
                entries.add(ElementalModItems.END_SAPPHIRE_LEGGINGS);
                entries.add(ElementalModItems.END_SAPPHIRE_BOOTS);

                entries.add(ElementalModItems.END_EMERALD_SWORD);
                entries.add(ElementalModItems.END_EMERALD_HELMET);
                entries.add(ElementalModItems.END_EMERALD_CHESTPLATE);
                entries.add(ElementalModItems.END_EMERALD_LEGGINGS);
                entries.add(ElementalModItems.END_EMERALD_BOOTS);

                entries.add(ElementalModItems.END_AMETHYST_SWORD);
                entries.add(ElementalModItems.END_AMETHYST_HELMET);
                entries.add(ElementalModItems.END_AMETHYST_CHESTPLATE);
                entries.add(ElementalModItems.END_AMETHYST_LEGGINGS);
                entries.add(ElementalModItems.END_AMETHYST_BOOTS);

                entries.add(ElementalModItems.END_OPAL_SWORD);
                entries.add(ElementalModItems.END_OPAL_HELMET);
                entries.add(ElementalModItems.END_OPAL_CHESTPLATE);
                entries.add(ElementalModItems.END_OPAL_LEGGINGS);
                entries.add(ElementalModItems.END_OPAL_BOOTS);

                entries.add(ElementalModItems.ENDERITE_SWORD);
                entries.add(ElementalModItems.ENDERITE_PICKAXE);
                entries.add(ElementalModItems.ENDERITE_AXE);
                entries.add(ElementalModItems.ENDERITE_SHOVEL);
                entries.add(ElementalModItems.ENDERITE_HOE);
                entries.add(ElementalModItems.ENDERITE_HELMET);
                entries.add(ElementalModItems.ENDERITE_CHESTPLATE);
                entries.add(ElementalModItems.ENDERITE_LEGGINGS);
                entries.add(ElementalModItems.ENDERITE_BOOTS);
            }).build());

    public static void registerItemGroups() {
        ElementalMod.LOGGER.info("Registering Item Groups for " + ElementalMod.MOD_ID);
    }
}
