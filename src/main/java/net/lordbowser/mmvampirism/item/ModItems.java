package net.lordbowser.mmvampirism.item;

import net.lordbowser.mmvampirism.ModularMagicsVampirism;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModularMagicsVampirism.MOD_ID);

    //Basic ingredients
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VAMPIRE_FANGS = ITEMS.register("vampire_fangs",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_VAMPIRE_FANGS = ITEMS.register("clean_vampire_fangs",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_BOTTLE = ITEMS.register("blood_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VAMPIRIC_BLOOD_BOTTLE = ITEMS.register("vampiric_blood_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOLY_WATER = ITEMS.register("holy_water",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHALICE = ITEMS.register("chalice",
            () -> new Item(new Item.Properties()));


    //Tools and weapons
    public static final RegistryObject<Item> WOODEN_STAKE = ITEMS.register("wooden_stake",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUCIFIX = ITEMS.register("crucifix",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAND_MIRROR = ITEMS.register("hand_mirror",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSEMARY = ITEMS.register("rosemary",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CROSSBOW = ITEMS.register("crossbow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CROSSBOW_BOLT = ITEMS.register("crossbow_bolt",
            () -> new Item(new Item.Properties()));

    //Armor
    public static final RegistryObject<Item> TOP_HAT = ITEMS.register("top_hat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
