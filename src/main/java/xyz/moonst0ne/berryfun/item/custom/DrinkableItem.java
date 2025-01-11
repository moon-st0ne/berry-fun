package xyz.moonst0ne.berryfun.item.custom;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class DrinkableItem extends Item
{
    public DrinkableItem(Properties properties, FoodProperties foodProperties)
    {
        super(properties.food(foodProperties));
    }

    @SuppressWarnings("null") // why is this relevant here anyway
    @Override
    public UseAnim getUseAnimation(ItemStack stack)
    {
        return UseAnim.DRINK;
    }
}