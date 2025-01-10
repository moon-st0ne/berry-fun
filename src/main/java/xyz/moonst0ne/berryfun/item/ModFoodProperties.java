package xyz.moonst0ne.berryfun.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties PLAIN_ICECREAM = new FoodProperties.Builder()
        .nutrition(4)
        .saturationModifier(0.5f)
        .usingConvertsTo(Items.BOWL)
        .build();

}
