package net.csy.ropedup.block;

import net.csy.ropedup.RopedUp;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // adding new blocks
    public static final Block ROPECLIP = registerBlock("ropeclip",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(BlockSoundGroup.METAL)));

    public static final Block TWINEBALE = registerBlock("twinebale",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).sounds(BlockSoundGroup.GRASS)));

    // add blocks to existing item groups
    private static void addItemsToFunctionItemGroup(FabricItemGroupEntries entries) {
        entries.add(ROPECLIP);
    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(TWINEBALE);
    }

    // register block function
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RopedUp.MOD_ID, name), block);
    }

    // register block item function
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RopedUp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    // logger feedback + running itemgroup function
    public static void registerModBlocks() {
        RopedUp.LOGGER.info("Registering Added Blocks for " + RopedUp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModBlocks::addItemsToFunctionItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemsToNaturalItemGroup);
    }
}
