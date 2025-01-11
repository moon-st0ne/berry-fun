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
        entity.setTicksFrozen(20); // TODO: if i make this get the value first, it doesn't go away when the effect expires

        return super.applyEffectTick(entity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier)
    {
        return true;
    }
}
