package net.gremi.elementalmod.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record DecayEnchantmentEffect() implements EnchantmentEntityEffect {
    private static final DecayEnchantmentEffect INSTANCE = new DecayEnchantmentEffect();
    public static final MapCodec<DecayEnchantmentEffect> CODEC = MapCodec.unit(INSTANCE);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {

    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
