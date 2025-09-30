package net.gremi.elementalmod.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ElementalModToolMaterials implements ToolMaterial {
    PURE_RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_RUBY)),
    PURE_SAPPHIRE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_SAPPHIRE)),
    PURE_EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_EMERALD)),
    PURE_AMETHYST(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_AMETHYST)),
    PURE_OPAL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_OPAL, Items.NETHERITE_INGOT)),
    NETH_RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2031, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_RUBY, Items.NETHERITE_INGOT)),
    NETH_SAPPHIRE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2031, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_SAPPHIRE, Items.NETHERITE_INGOT)),
    NETH_EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2031, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_EMERALD, Items.NETHERITE_INGOT)),
    NETH_AMETHYST(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2031, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_AMETHYST, Items.NETHERITE_INGOT)),
    NETH_OPAL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2031, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(ElementalModItems.PURE_OPAL, Items.NETHERITE_INGOT)),
    END_RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2501, 10.0F, 5.0F, 20, () -> Ingredient.ofItems(ElementalModItems.PURE_RUBY, ElementalModItems.ENDERITE_INGOT)),
    END_SAPPHIRE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2501, 10.0F, 5.0F, 20, () -> Ingredient.ofItems(ElementalModItems.PURE_SAPPHIRE, ElementalModItems.ENDERITE_INGOT)),
    END_EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2501, 10.0F, 5.0F, 20, () -> Ingredient.ofItems(ElementalModItems.PURE_EMERALD, ElementalModItems.ENDERITE_INGOT)),
    END_AMETHYST(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2501, 10.0F, 5.0F, 20, () -> Ingredient.ofItems(ElementalModItems.PURE_AMETHYST, ElementalModItems.ENDERITE_INGOT)),
    END_OPAL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2501, 10.0F, 5.0F, 20, () -> Ingredient.ofItems(ElementalModItems.PURE_OPAL, ElementalModItems.ENDERITE_INGOT)),
    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2501, 10.0F, 5.0F, 20, () -> Ingredient.ofItems(ElementalModItems.ENDERITE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ElementalModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,
            final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
