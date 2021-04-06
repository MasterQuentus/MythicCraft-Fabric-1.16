package com.masterquentus.objects.items;

import com.masterquentus.mythiccraft.MythicCraft;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxe extends PickaxeItem {
    public ModPickaxe(ToolMaterial material) {
        super(material, -1, -2.2F, new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    }
}
