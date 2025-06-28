package net.prbyld.attachments.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prbyld.attachments.attachments;
import net.prbyld.attachments.item.custom.Attachment;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, attachments.MOD_ID);

    public static final RegistryObject<Item> STRAYS_CLOTH = ITEMS.register("strays_cloth",
            () -> new Attachment(new Item.Properties()));

    public static final RegistryObject<Item> COMPACT_FURNACE = ITEMS.register("compact_furnace",
            () -> new Attachment(new Item.Properties(), 2));

    public static final RegistryObject<Item> COMPACTER_FURNACE = ITEMS.register("compacter_furnace",
            () -> new Attachment(new Item.Properties(), 2));

    public static final RegistryObject<Item> SNORKEL = ITEMS.register("snorkel",
            () -> new Attachment(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
