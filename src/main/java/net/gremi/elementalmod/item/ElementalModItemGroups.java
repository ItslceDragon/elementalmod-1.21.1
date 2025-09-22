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
            }).build());

    public static void registerItemGroups() {
        ElementalMod.LOGGER.info("Registering Item Groups for " + ElementalMod.MOD_ID);
    }
}
