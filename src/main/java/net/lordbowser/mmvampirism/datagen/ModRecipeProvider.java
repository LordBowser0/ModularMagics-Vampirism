package net.lordbowser.mmvampirism.datagen;

import net.lordbowser.mmvampirism.ModularMagicsVampirism;
import net.lordbowser.mmvampirism.block.ModBlocks;
import net.lordbowser.mmvampirism.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        //Silver
        oreBlasting(consumer, List.of(ModItems.RAW_SILVER.get()), RecipeCategory.MISC,
                ModItems.SILVER_INGOT.get(), 0.9f, 100, "silver_ingot");
        oreSmelting(consumer, List.of(ModItems.RAW_SILVER.get()), RecipeCategory.MISC,
                ModItems.SILVER_INGOT.get(), 0.9f, 200, "silver_ingot");
        oreBlasting(consumer, List.of(ModBlocks.SILVER_ORE.get()), RecipeCategory.MISC,
                ModItems.SILVER_INGOT.get(), 0.9f, 100, "silver_ingot");
        oreSmelting(consumer, List.of(ModBlocks.SILVER_ORE.get()), RecipeCategory.MISC,
                ModItems.SILVER_INGOT.get(), 0.9f, 200, "silver_ingot");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC,
                ModItems.SILVER_INGOT.get(), 0.9f, 100, "silver_ingot");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC,
                ModItems.SILVER_INGOT.get(), 0.9f, 200, "silver_ingot");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(),
                RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_NUGGET.get(), 9)
                .requires(ModItems.SILVER_INGOT.get()).group("silver_nugget")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_nugget"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_INGOT.get())
                .define('X', ModItems.SILVER_NUGGET.get()).group("silver_ingot")
                .pattern("XXX").pattern("XXX").pattern("XXX")
                .unlockedBy(getHasName(ModItems.SILVER_NUGGET.get()), has(ModItems.SILVER_NUGGET.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_ingot_from_nuggets"));
        List nuggetList = List.of(ModItems.SILVER_BOOTS.get(), ModItems.SILVER_LEGGINGS.get(),
                ModItems.SILVER_CHESTPLATE.get(), ModItems.SILVER_HELMET.get(), ModItems.SILVER_AXE.get(),
                ModItems.SILVER_HOE.get(), ModItems.SILVER_SHOVEL.get(), ModItems.SILVER_PICKAXE.get(),
                ModItems.SILVER_SWORD.get());
        oreBlasting(consumer, nuggetList, RecipeCategory.MISC,
                ModItems.SILVER_NUGGET.get(), 0.1f, 100, "silver_nugget");
        oreSmelting(consumer, nuggetList, RecipeCategory.MISC,
                ModItems.SILVER_NUGGET.get(), 0.1f, 200, "silver_nugget");
        //Silver Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SILVER_AXE.get())
                .define('I', ModItems.SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("II").pattern("IS").pattern(" S")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_axe"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SILVER_PICKAXE.get())
                .define('I', ModItems.SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("III").pattern(" S ").pattern(" S ")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_pickaxe"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SILVER_SWORD.get())
                .define('I', ModItems.SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("I").pattern("I").pattern("S")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_sword"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SILVER_HOE.get())
                .define('I', ModItems.SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("III").pattern(" S ").pattern(" S ")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_hoe"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SILVER_SHOVEL.get())
                .define('I', ModItems.SILVER_INGOT.get()).define('S', Items.STICK)
                .pattern("III").pattern(" S ").pattern(" S ")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_shovel"));
        //Silver Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_HELMET.get())
                .define('#', ModItems.SILVER_INGOT.get())
                .pattern("###").pattern("# #")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_helmet"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_CHESTPLATE.get())
                .define('#', ModItems.SILVER_INGOT.get())
                .pattern("# #").pattern("###").pattern("###")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_chestplate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_LEGGINGS.get())
                .define('#', ModItems.SILVER_INGOT.get())
                .pattern("###").pattern("# #").pattern("# #")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_leggings"));
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SILVER_BOOTS.get())
                .define('#', ModItems.SILVER_INGOT.get())
                .pattern("# #").pattern("# #")
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(consumer, new ResourceLocation(ModularMagicsVampirism.MOD_ID, "silver_boots"));
    }

    //Copies from RecipeProvider to generate data in generated/mmvampirism not minecraft folder
    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_,
                                                  ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_),
                (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_,
                                                  ItemLike p_250042_, RecipeCategory p_248977_, ItemLike p_251911_,
                                                  String p_250475_, @Nullable String p_248641_, String p_252237_,
                                                  @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_)
                        .unlockedBy(getHasName(p_251911_), has(p_251911_)).save(p_250423_,
                        new ResourceLocation(ModularMagicsVampirism.MOD_ID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_)
                .pattern("###").pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(p_250042_), has(p_250042_)).
                save(p_250423_, new ResourceLocation(ModularMagicsVampirism.MOD_ID, p_250475_));
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_,
                                      RecipeCategory p_250588_, ItemLike p_251868_,
                                      float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_,
                p_251687_, "_from_smelting");
    }


    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_,
                                      RecipeCategory p_248846_, ItemLike p_249735_,
                                      float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_,
                p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_,
                                     RecipeSerializer<? extends AbstractCookingRecipe> p_251817_,
                                     List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_,
                                     float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_,
                    p_251316_, p_251817_).group(p_251450_)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(p_250791_, new ResourceLocation(ModularMagicsVampirism.MOD_ID, getItemName(p_250066_))
                            + p_249236_ + "_" + getItemName(itemlike));
        }

    }
}
