package com.masterquentus.objects.items;

import com.masterquentus.mythiccraft.MythicCraft;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class ModHoe extends HoeItem {
    public ModHoe(ToolMaterial material) {
        super(material, 1, 1.1F, new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    }
}
