package net.lordbowser.mmvampirism;

import com.mojang.logging.LogUtils;
import net.lordbowser.mmvampirism.item.ModCreativeModeTabs;
import net.lordbowser.mmvampirism.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModularMagicsVampirism.MOD_ID)
public class ModularMagicsVampirism
{
    public static final String MOD_ID = "mmvampirism";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ModularMagicsVampirism() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.VAMPIRISM_TAB) {
            event.accept(ModItems.CRUCIFIX);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.BLOOD_BOTTLE);
            event.accept(ModItems.VAMPIRE_FANGS);
            event.accept(ModItems.GARLIC);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
