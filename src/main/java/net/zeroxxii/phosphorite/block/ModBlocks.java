package net.zeroxxii.phosphorite.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zeroxxii.phosphorite.Phosphorite;

public class ModBlocks {
    public static final Block PHOSPHORITE_ORE = registerBlock("phosphorite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Phosphorite.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Phosphorite.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Phosphorite.LOGGER.info("Registering ModBlocks for " + Phosphorite.MOD_ID);
    }
}
