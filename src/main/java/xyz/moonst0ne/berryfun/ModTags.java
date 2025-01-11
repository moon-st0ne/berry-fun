package xyz.moonst0ne.berryfun;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags 
{
    public static class Items
    {
        public static final TagKey<Item> ICE_CREAMS = createTag("ice_creams");
        public static final TagKey<Item> YOGURTS = createTag("yogurts");
        public static final TagKey<Item> JUICES = createTag("juices");
        public static final TagKey<Item> PRESERVES = createTag("preserves");
        public static final TagKey<Item> PASTRIES = createTag("pastries");
        public static final TagKey<Item> PIES = createTag("pies");
        public static final TagKey<Item> CAKES = createTag("cakes");
        public static final TagKey<Item> CANDIES = createTag("candies");
        public static final TagKey<Item> BAKED_GOODS = createTag("baked_goods");
        public static final TagKey<Item> DRINKS = createTag("drinks");

        private static TagKey<Item> createTag(String name)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(BerryFun.MODID, name));
        }
    }
}
