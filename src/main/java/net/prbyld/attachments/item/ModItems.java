package net.prbyld.attachments.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prbyld.attachments.attachments;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, attachments.MOD_ID);

    public static final RegistryObject<Item> STRAYS_CLOTH = ITEMS.register("strays_cloth",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COMPACT_FURNACE = ITEMS.register("compact_furnace",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SNORKEL = ITEMS.register("snorkel",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
