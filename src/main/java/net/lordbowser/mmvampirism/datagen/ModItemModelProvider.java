package net.lordbowser.mmvampirism.datagen;

import net.lordbowser.mmvampirism.ModularMagicsVampirism;
import net.lordbowser.mmvampirism.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ModularMagicsVampirism.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.VAMPIRE_FANGS);
        simpleItem(ModItems.CLEAN_VAMPIRE_FANGS);
        simpleItem(ModItems.BLOOD_BOTTLE);
        simpleItem(ModItems.VAMPIRIC_BLOOD_BOTTLE);
        simpleItem(ModItems.HOLY_WATER);
        simpleItem(ModItems.GARLIC);
        simpleItem(ModItems.CLOTH);
        simpleItem(ModItems.CHALICE);

        simpleItem(ModItems.CRUCIFIX);
        simpleItem(ModItems.HAND_MIRROR);
        simpleItem(ModItems.ROSEMARY);
        simpleItem(ModItems.SYRINGE);
        simpleItem(ModItems.CROSSBOW);
        simpleItem(ModItems.CROSSBOW_BOLT);
        simpleItem(ModItems.TOP_HAT);
        simpleItem(ModItems.SILVER_HELMET);
        simpleItem(ModItems.SILVER_CHESTPLATE);
        simpleItem(ModItems.SILVER_LEGGINGS);
        simpleItem(ModItems.SILVER_BOOTS);

        handheldItem(ModItems.WOODEN_STAKE);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_SWORD);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_HOE);
        handheldItem(ModItems.SILVER_SHOVEL);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ModularMagicsVampirism.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ModularMagicsVampirism.MOD_ID, "item/" + item.getId().getPath()));
    }
}
