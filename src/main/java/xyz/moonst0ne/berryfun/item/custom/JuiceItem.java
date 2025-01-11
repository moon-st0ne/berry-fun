package xyz.moonst0ne.berryfun.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;

public class JuiceItem extends DrinkableItem
{
    public JuiceItem(Properties properties, FoodProperties foodProperties)
    {
        super(properties, foodProperties);
    }

    @Override
    public SoundEvent getDrinkingSound()
    {
        return SoundEvents.HONEY_DRINK;
    }

    @Override
    public SoundEvent getEatingSound()
    {
        return SoundEvents.HONEY_DRINK;
    }
}