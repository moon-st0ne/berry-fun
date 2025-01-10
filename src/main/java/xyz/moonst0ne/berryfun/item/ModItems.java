package xyz.moonst0ne.berryfun.item;

import xyz.moonst0ne.berryfun.BerryFun;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems 
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BerryFun.MODID);

    public static final DeferredItem<Item> PLAIN_ICECREAM = ITEMS.register("plain_ice_cream", 
        () -> new Item(new Item.Properties().food(ModFoodProperties.PLAIN_ICECREAM)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}