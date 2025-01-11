package xyz.moonst0ne.berryfun.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BrainfreezeEffect extends MobEffect 
{
    public BrainfreezeEffect(MobEffectCategory category, int color)
    {
        super(category, color);
    }

    @SuppressWarnings("null")
    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier)
    {
        entity.setIsInPowderSnow(true);

        return super.applyEffectTick(entity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier)
    {
        return true;
    }
}
