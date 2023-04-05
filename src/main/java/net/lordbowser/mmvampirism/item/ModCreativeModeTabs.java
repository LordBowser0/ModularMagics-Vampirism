package net.lordbowser.mmvampirism.item;

import net.lordbowser.mmvampirism.ModularMagicsVampirism;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModularMagicsVampirism.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab VAMPIRISM_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        VAMPIRISM_TAB = event.registerCreativeModeTab(new ResourceLocation(ModularMagicsVampirism.MOD_ID, "vampirism_tab"),
        builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                .title(Component.translatable("creativemodetab.vampirism_tab")));
    }
}
