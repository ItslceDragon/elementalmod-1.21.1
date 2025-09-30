package net.gremi.elementalmod.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ShieldItem.class)
public abstract class ShieldItemRepairMixin extends Item {
    public ShieldItemRepairMixin(Settings settings) {
        super(settings);
    }

    /**
     * 
     * @author Gremi
     * @reason Change shield repair material to iron ingot to match modded shield repairing
     */

    @Overwrite
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isOf(Items.IRON_INGOT);
    }
}
