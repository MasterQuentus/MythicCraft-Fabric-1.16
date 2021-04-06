package com.masterquentus.mythiccraft.items.tools;

import com.masterquentus.mythiccraft.registry.ItemInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MythicDiamondToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 2561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0F;
    }

    @Override
    public float getAttackDamage() {
        return 8F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemInit.MYTHIC_DIAMOND);
    }
}
