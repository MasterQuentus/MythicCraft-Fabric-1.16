package com.masterquentus.mythiccraft.items.tools;

import com.masterquentus.mythiccraft.registry.ItemInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class VampiricToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.1F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemInit.VAMPIRIC_GEM);
    }
}
