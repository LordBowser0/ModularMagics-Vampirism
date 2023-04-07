package net.lordbowser.mmvampirism;

import com.mojang.logging.LogUtils;
import net.lordbowser.mmvampirism.block.ModBlocks;
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
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.VAMPIRISM_TAB) {
            //Items
            //Ingredients & Resources
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.SILVER_NUGGET);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.VAMPIRE_FANGS);
            event.accept(ModItems.CLEAN_VAMPIRE_FANGS);
            event.accept(ModItems.CLOTH);
            event.accept(ModItems.BLOOD_BOTTLE);
            event.accept(ModItems.VAMPIRIC_BLOOD_BOTTLE);
            event.accept(ModItems.HOLY_WATER);
            event.accept(ModItems.CHALICE);
            event.accept(ModItems.GARLIC);
            //Tools & Weapons
            event.accept(ModItems.CRUCIFIX);
            event.accept(ModItems.WOODEN_STAKE);
            event.accept(ModItems.HAND_MIRROR);
            event.accept(ModItems.SYRINGE);
            event.accept(ModItems.CROSSBOW);
            event.accept(ModItems.CROSSBOW_BOLT);
            event.accept(ModItems.SILVER_AXE);
            event.accept(ModItems.SILVER_SWORD);
            event.accept(ModItems.SILVER_SHOVEL);
            event.accept(ModItems.SILVER_PICKAXE);
            event.accept(ModItems.SILVER_HOE);
            //Armor & Equipment
            event.accept(ModItems.TOP_HAT);
            event.accept(ModItems.ROSEMARY);
            event.accept(ModItems.SILVER_HELMET);
            event.accept(ModItems.SILVER_CHESTPLATE);
            event.accept(ModItems.SILVER_LEGGINGS);
            event.accept(ModItems.SILVER_BOOTS);

            //Blocks
            //Natural Blocks
            event.accept(ModBlocks.SILVER_ORE);
            event.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
            //Building Blocks
            event.accept(ModBlocks.SILVER_BLOCK);
            event.accept(ModBlocks.RAW_SILVER_BLOCK);
            event.accept(ModBlocks.VAMPIRE_CASTLE_BRICKS);
            event.accept(ModBlocks.BLOODY_VAMPIRE_CASTLE_BRICKS);
            event.accept(ModBlocks.CRACKED_VAMPIRE_CASTLE_BRICKS);
            event.accept(ModBlocks.MOSSY_VAMPIRE_CASTLE_BRICKS);
            event.accept(ModBlocks.CHISELED_VAMPIRE_CASTLE_BRICKS);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
