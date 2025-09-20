package net.gremi.elementalmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gremi.elementalmod.ElementalMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ElementalModItems {
    public static final Item PURE_AMETHYST = registerItem("pure_amethyst", new Item(new Item.Settings()));
    public static final Item PURE_EMERALD = registerItem("pure_emerald", new Item(new Item.Settings()));
    public static final Item PURE_OPAL = registerItem("pure_opal", new Item(new Item.Settings()));
    public static final Item PURE_RUBY = registerItem("pure_ruby", new Item(new Item.Settings()));
    public static final Item PURE_SAPPHIRE = registerItem("pure_sapphire", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ElementalMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ElementalMod.LOGGER.info("Registering Mod Items for " + ElementalMod.MOD_ID);
    }
}
