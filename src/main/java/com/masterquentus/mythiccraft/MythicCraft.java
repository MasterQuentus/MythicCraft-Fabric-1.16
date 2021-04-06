package com.masterquentus.mythiccraft;

import com.masterquentus.mythiccraft.registry.BlockInit;
import com.masterquentus.mythiccraft.registry.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MythicCraft implements ModInitializer {

    public static final String MOD_ID = "mythic";

    public static final ItemGroup MYTHICCRAFT_ITEMS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "mythiccraftitems")).icon(() -> new ItemStack(ItemInit.MYTHIC_DIAMOND)).build();

    public static final ItemGroup MYTHICCRAFT_BLOCKS = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "mythiccraftblocks")).icon(() -> new ItemStack(ItemInit.MYTHICDIAMOND_BLOCK)).build();

    @Override
    public void onInitialize() {
        ItemInit.registerItems();
        BlockInit.registerBlocks();

    }
}
