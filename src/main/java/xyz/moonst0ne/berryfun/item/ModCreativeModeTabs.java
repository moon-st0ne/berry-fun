package xyz.moonst0ne.berryfun.item;

import xyz.moonst0ne.berryfun.BerryFun;

import java.util.function.Supplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs 
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BerryFun.MODID);

    public static final Supplier<CreativeModeTab> BERRY_FUN_TAB = 
        CREATIVE_MODE_TAB.register("berryfun_items_tab", 
            () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.PLAIN_ICECREAM.get()))
                .title(Component.translatable("creativetab.berryfun.berryfun_items"))
                
                // this is where we add the item to the creative tab
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.PLAIN_ICECREAM);
                    output.accept(ModItems.ORAN_JUICE);
                }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
