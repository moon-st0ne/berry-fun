package xyz.moonst0ne.berryfun.effect;

import xyz.moonst0ne.berryfun.BerryFun;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects 
{
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, BerryFun.MODID);

    public static final Holder<MobEffect> BRAIN_FREEZE_EFFECT = MOB_EFFECTS.register("brainfreeze", 
        () -> new BrainfreezeEffect(MobEffectCategory.HARMFUL, 0x6CFCFC) // a nice icy blue
        .withSoundOnAdded(SoundEvents.PLAYER_HURT_FREEZE)
        // TODO: consider coming back and doing .isInstantaneous() if i don't like the freeze over time
    );

    public static void register(IEventBus eventBus)
    {
        MOB_EFFECTS.register(eventBus);
    }
}
