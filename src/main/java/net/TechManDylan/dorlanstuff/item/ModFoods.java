package net.TechManDylan.dorlanstuff.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ROCK_CANDY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION,600, 1), 0.05f)
            .alwaysEat()
            .build();
}