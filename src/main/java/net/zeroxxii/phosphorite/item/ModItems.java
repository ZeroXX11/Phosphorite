package net.zeroxxii.phosphorite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zeroxxii.phosphorite.Phosphorite;

public class ModItems {
    public static final Item RAW_PHOSPHORITE = registerItem("raw_phosphorite", new Item(new FabricItemSettings()));
    public static final Item PHOSPHORITE = registerItem("phosphorite", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_PHOSPHORITE);
        entries.add(PHOSPHORITE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Phosphorite.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Phosphorite.LOGGER.info("Registering Mod Items for " + Phosphorite.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}