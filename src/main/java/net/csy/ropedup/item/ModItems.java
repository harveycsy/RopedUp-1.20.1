package net.csy.ropedup.item;

import net.csy.ropedup.RopedUp;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // adding new items
    public static final Item TWINE = registerItem("twine", new Item(new FabricItemSettings()));
    public static final Item WEAKCARABINER = registerItem("weakcarabiner", new Item(new FabricItemSettings()));
    public static final Item STRONGCARABINER = registerItem("strongcarabiner", new Item(new FabricItemSettings()));
    public static final Item DECORROPE = registerItem("decorrope", new Item(new FabricItemSettings()));
    public static final Item BARINGROPE = registerItem("baringrope", new Item(new FabricItemSettings()));
    public static final Item ROPEEXTENSION = registerItem("ropeextension", new Item(new FabricItemSettings()));

    // add items to existing item groups
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TWINE);
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(WEAKCARABINER);
        entries.add(STRONGCARABINER);
        entries.add(DECORROPE);
        entries.add(BARINGROPE);
        entries.add(ROPEEXTENSION);
    }


    // register item function
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RopedUp.MOD_ID, name), item);
    }

    // logger feedback + running itemgroup function
    public static void registerModItems() {
        RopedUp.LOGGER.info("Registering Added Items for " + RopedUp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }

}
