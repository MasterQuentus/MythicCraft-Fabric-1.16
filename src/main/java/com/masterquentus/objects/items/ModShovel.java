package com.masterquentus.objects.items;

import com.masterquentus.mythiccraft.MythicCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ModShovel extends ShovelItem {
    public ModShovel(ToolMaterial material) {
        super(material, 1.1F, 1.1F, new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    }
}
