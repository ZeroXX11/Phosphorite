package net.zeroxxii.phosphorite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zeroxxii.phosphorite.Phosphorite;
import net.zeroxxii.phosphorite.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PHOSPHORITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Phosphorite.MOD_ID, "phosphorite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.phosphorite"))
                    .icon(() -> new ItemStack(ModItems.PHOSPHORITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PHOSPHORITE);
                        entries.add(ModItems.PHOSPHORITE);
                        entries.add(ModBlocks.PHOSPHORITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PHOSPHORITE_ORE);

                    }).build());

    public static void registerItemGroups() {
        Phosphorite.LOGGER.info("Registering Item Groups for " +Phosphorite.MOD_ID);
    }
}