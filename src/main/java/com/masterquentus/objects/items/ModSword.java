package com.masterquentus.objects.items;

import com.masterquentus.mythiccraft.MythicCraft;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModSword extends SwordItem {
    public ModSword(ToolMaterial toolMaterial) {
        super(toolMaterial, -1, 2.2F, new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    }
}
