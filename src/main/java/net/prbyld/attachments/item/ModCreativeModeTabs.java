package net.prbyld.attachments.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.prbyld.attachments.attachments;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, attachments.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ATTACHMENTS_TAB = CREATIVE_MODE_TABS.register("attachments_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STRAYS_CLOTH.get()))
                    .title(Component.translatable("creative.attachments.attachments_items"))
                    .displayItems((itemDisplayParameters. output) -> {
                        output.accept(ModItems.STRAYS_CLOTH.get());
                        output.accept(ModItems.COMPACT_FURNACE.get());
                        output.accept(ModItems.SNORKEL.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
