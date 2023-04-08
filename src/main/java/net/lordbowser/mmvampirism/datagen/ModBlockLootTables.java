package net.lordbowser.mmvampirism.datagen;

import net.lordbowser.mmvampirism.block.ModBlocks;
import net.lordbowser.mmvampirism.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.VAMPIRE_CASTLE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_VAMPIRE_CASTLE_BRICKS.get());
        dropSelf(ModBlocks.MOSSY_VAMPIRE_CASTLE_BRICKS.get());
        dropSelf(ModBlocks.BLOODY_VAMPIRE_CASTLE_BRICKS.get());
        dropSelf(ModBlocks.CHISELED_VAMPIRE_CASTLE_BRICKS.get());


        add(ModBlocks.SILVER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
