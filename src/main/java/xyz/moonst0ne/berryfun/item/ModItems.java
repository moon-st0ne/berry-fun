package xyz.moonst0ne.berryfun.item;

import xyz.moonst0ne.berryfun.BerryFun;
import xyz.moonst0ne.berryfun.item.custom.DrinkableItem;
import xyz.moonst0ne.berryfun.item.custom.JuiceItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems 
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BerryFun.MODID);

    public static final DeferredItem<Item> PLAIN_ICECREAM = ITEMS.register("plain_ice_cream", 
        () -> new Item(new Item.Properties().food(ModFoodProperties.ICE_CREAM)));

    public static final DeferredItem<Item> ORAN_JUICE = ITEMS.register("oran_juice",
        () -> new JuiceItem(new Item.Properties(), ModFoodProperties.JUICE));

    public static final DeferredItem<Item> ROSELI_TEA = ITEMS.register("roseli_tea",
        () -> new DrinkableItem(new Item.Properties(), ModFoodProperties.TEA));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}