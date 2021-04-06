package com.masterquentus.objects.items;

import com.masterquentus.mythiccraft.MythicCraft;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class ModArmor extends ArmorItem {

    public ModArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    }
}
