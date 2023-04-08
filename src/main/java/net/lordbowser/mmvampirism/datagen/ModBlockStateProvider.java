package net.lordbowser.mmvampirism.datagen;

import net.lordbowser.mmvampirism.ModularMagicsVampirism;
import net.lordbowser.mmvampirism.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModularMagicsVampirism.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.VAMPIRE_CASTLE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_VAMPIRE_CASTLE_BRICKS);
        blockWithItem(ModBlocks.MOSSY_VAMPIRE_CASTLE_BRICKS);
        blockWithItem(ModBlocks.BLOODY_VAMPIRE_CASTLE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_VAMPIRE_CASTLE_BRICKS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
