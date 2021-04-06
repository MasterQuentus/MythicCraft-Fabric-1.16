package com.masterquentus.objects.items;

import com.masterquentus.mythiccraft.MythicCraft;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class ModAxe extends AxeItem {
    public ModAxe(ToolMaterial material) {
        super(material, -1, 2, new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    }
}
