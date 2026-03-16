package net.csy.ropedup.item;

import net.csy.ropedup.RopedUp;
import net.csy.ropedup.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ROPED_UP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RopedUp.MOD_ID, "ropedup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ropedup"))
                    .icon(() -> new ItemStack(ModItems.CARABINER)).entries((displayContext, entries) -> {
                        // non-placeable items
                        entries.add(ModItems.TWINE);
                        entries.add(ModItems.ROPESEGMENT);
                        entries.add(ModItems.CARABINER);
                        entries.add(ModItems.DECORROPE);
                        entries.add(ModItems.ROPEEXTENSION);
                        entries.add(ModItems.DECOREXTENDROPE);
                        // placeable items
                        entries.add(ModBlocks.ROPECLIP);
                        entries.add(ModBlocks.BARINGROPE);
                        entries.add(ModBlocks.TWINEBALE);

                    }).build());

    public static void registerItemGroups() {
        RopedUp.LOGGER.info("Registering Added ItemGroups for " + RopedUp.MOD_ID);
    }
}
