package xyz.moonst0ne.berryfun.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties 
{
    // juices can be quickly drank
    public static final FoodProperties JUICE = new FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(1.0f)
        .fast()
        .usingConvertsTo(Items.GLASS_BOTTLE)
    .build();

    // tea can be drunk at any time (give special effect? reset insomnia?)
    public static final FoodProperties TEA = new FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(1.0f)
        .alwaysEdible()
        .usingConvertsTo(Items.GLASS_BOTTLE)
    .build();

    // alcohol can be drunk at any time (and gives nausea)
    public static final FoodProperties ALCOHOL = new FoodProperties.Builder()
        .nutrition(5)
        .saturationModifier(1.0f)
        .alwaysEdible()
        .usingConvertsTo(Items.GLASS_BOTTLE)
        .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300), 0.2f)
        .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600), 1.0f)
    .build();

    // ice cream should give a frostbite effect with a 25% chance
    // neoforge discord said to use a custom effect that applies the vanilla frostbite effect
    public static final FoodProperties ICE_CREAM = new FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(0.5f)
        .usingConvertsTo(Items.BOWL)
        .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 0.25f)
    .build();

    public static final FoodProperties BAKED_GOOD = new FoodProperties.Builder()
        .nutrition(5)
        .saturationModifier(0.25f)
    .build();

    public static final FoodProperties CANDY = new FoodProperties.Builder()
        .nutrition(3)
        .fast()
        .saturationModifier(0.15f)
    .build();

    public static final FoodProperties PASTRY_TART = new FoodProperties.Builder()
        .nutrition(7)
        .saturationModifier(0.35f)
    .build();

    public static final FoodProperties PIE_CAKE = new FoodProperties.Builder()
        .nutrition(9)
        .saturationModifier(0.3f)
    .build();

    public static final FoodProperties JELLY_JAM = new FoodProperties.Builder()
        .nutrition(6)
        .saturationModifier(0.5f)
        .usingConvertsTo(Items.GLASS_BOTTLE)
    .build();

    public static final FoodProperties YOGURT = new FoodProperties.Builder()
        .nutrition(7)
        .saturationModifier(0.3f)
        .usingConvertsTo(Items.PAPER)
    .build();
}
