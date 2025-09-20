package net.gremi.elementalmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gremi.elementalmod.ElementalMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ElementalModBlocks {
    public static final Block PURE_AMETHYST_BLOCK = registerBlock("pure_amethyst_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block PURE_EMERALD_BLOCK = registerBlock("pure_emerald_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block PURE_OPAL_BLOCK = registerBlock("pure_opal_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block PURE_RUBY_BLOCK = registerBlock("pure_ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block PURE_SAPPHIRE_BLOCK = registerBlock("pure_sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block PURE_AMETHYST_ORE = registerBlock("pure_amethyst_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PURE_EMERALD_ORE = registerBlock("pure_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PURE_OPAL_ORE = registerBlock("pure_opal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PURE_RUBY_ORE = registerBlock("pure_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PURE_SAPPHIRE_ORE = registerBlock("pure_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK, Identifier.of(ElementalMod.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ElementalMod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ElementalMod.LOGGER.info("Registering Mod Blocks for " + ElementalMod.MOD_ID);
    }
}
