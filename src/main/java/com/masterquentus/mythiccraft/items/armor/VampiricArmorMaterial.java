package com.masterquentus.mythiccraft.items.armor;

import com.masterquentus.mythiccraft.registry.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class VampiricArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {165, 240, 225, 195};
    private static final int[] PROTECTION_AMOUNTS = new int[] {4, 75, 714, 5};

    @Override
    public int getDurability(EquipmentSlot arg0) {
        return BASE_DURABILITY[arg0.getEntitySlotId()]*25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return PROTECTION_AMOUNTS[arg0.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemInit.VAMPIRIC_GEM);
    }

    @Override
    public String getName() {
        return "vampiric";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 1;
    }
}
