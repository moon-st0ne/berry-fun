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

    // tea (and other beverages) can be drunk at any time
    public static final FoodProperties DRINK = new FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(1.0f)
        .alwaysEdible()
        .usingConvertsTo(Items.GLASS_BOTTLE)
    .build();

    // ice cream should give a frostbite effect with a 25% chance
    // neoforge discord said to use a custom effect that applies the vanilla frostbite effect
    public static final FoodProperties ICE_CREAM = new FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(0.5f)
        .usingConvertsTo(Items.BOWL)
        .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 0.25f)
    .build();

    public static final FoodProperties BREAD = new FoodProperties.Builder()
        .nutrition(5)
        .saturationModifier(0.25f)
    .build();

    public static final FoodProperties PASTRY = new FoodProperties.Builder()
        .nutrition(7)
        .saturationModifier(0.35f)
    .build();
}
