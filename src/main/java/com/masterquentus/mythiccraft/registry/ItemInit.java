package com.masterquentus.mythiccraft.registry;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.items.armor.VampiricArmorMaterial;
import com.masterquentus.mythiccraft.items.tools.MythicDiamondToolMaterial;
import com.masterquentus.mythiccraft.items.tools.VampiricToolMaterial;
import com.masterquentus.objects.items.*;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemInit {


    //Items
    public static final Item VAMPIRIC_GEM = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item MYTHIC_DIAMOND = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item BLOODSTONE_INGOT = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONHEART_INGOT = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item RUBY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item AMETHYST = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item MAGIC_CRYSTAL = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item ROSE_QUARTZ = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item MOONSTONE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item PUREGLOWSTONE_DUST = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DARKGLOWSTONE_DUST = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item PIXIE_DUST = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item FAIRY_DUST = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item MERMAID_SCALE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item BASILISK_SCALE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item SIREN_SCALE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item KRAKEN_SCALE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item KRAKEN_TOOTH = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_RED = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_AMETHYST = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_BLACK = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_GREEN = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_GRAY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_WHITE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_SAPPHIRE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_SILVER = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGONSCALE_BLUE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DRAGON_BONE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item VAMPIRIC_RING = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DAYLIGHT_RING = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item WOLFSBANE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item VERVAIN = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item BELLADONNA = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item MANDRAKE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item FOXGLOVES = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item WORMWOOD = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item NIGHTSHADE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item ACONITUM = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item HELLEBORE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item WHITE_SAGE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item WATER_ARTICHOKE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item ICY_NEEDLE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item ASH = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item WITCHES_HAND = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item INFESTED_GOO = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item INFESTED_SLIMEBALL = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item CHARRED_SLIMEBALL = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item CONTRACT_LILITH = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item CONTRACT_DEATH = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item CONTRACT_PANDORA = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item SOUL_BOTTLE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item MAGICAL_GEAR = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item SALT = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item MAGICAL_DUST = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item LILITH_BLOODBOTTLE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item DEATH_BLOODBOTTLE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));
    public static final Item PANDORA_BLOODBOTTLE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));

    //Fuel
    public static final Item WOOD_ASH = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS));

    //Armor
    public static final ArmorMaterial VAMPIRIC_ARMOR = new VampiricArmorMaterial();

    //Food
    public static final Item RAW_KRAKEN = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.8F).meat().build()));
    public static final Item COOKED_KRAKEN = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(8).saturationModifier(12.8F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*9), 1F).build()));
    public static final Item BLOOD_BERRY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build()));
    public static final Item SILVER_BERRY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build()));
    public static final Item CHARRED_BERRY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build()));
    public static final Item SOUL_BERRY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build()));
    public static final Item ICY_BERRY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build()));
    public static final Item INFESTED_BERRY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build()));
    public static final Item MYSTIC_BERRY = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build()));
    public static final Item BLOOD_APPLE = new Item(new Item.Settings().group(MythicCraft.MYTHICCRAFT_ITEMS).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4F).snack().build()));

    //Block Items
    public static final BlockItem VAMPIRIC_BLOCK = new BlockItem(BlockInit.VAMPIRIC_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem VAMPIRIC_ORE = new BlockItem(BlockInit.VAMPIRIC_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem VAMPIRIC_ENDORE = new BlockItem(BlockInit.VAMPIRIC_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem VAMPIRIC_NETHERORE = new BlockItem(BlockInit.VAMPIRIC_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SILVER_BLOCK = new BlockItem(BlockInit.SILVER_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SILVER_ORE = new BlockItem(BlockInit.SILVER_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SILVER_ENDORE = new BlockItem(BlockInit.SILVER_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SILVER_NETHERORE = new BlockItem(BlockInit.SILVER_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MYTHICDIAMOND_BLOCK = new BlockItem(BlockInit.MYTHICDIAMOND_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MYTHICDIAMOND_ORE = new BlockItem(BlockInit.MYTHICDIAMOND_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MYTHICDIAMOND_ENDORE = new BlockItem(BlockInit.MYTHICDIAMOND_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MYTHICDIAMOND_NETHERORE = new BlockItem(BlockInit.MYTHICDIAMOND_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem BLOODSTONE_BLOCK = new BlockItem(BlockInit.BLOODSTONE_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem BLOODSTONE_ORE = new BlockItem(BlockInit.BLOODSTONE_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem BLOODSTONE_ENDORE = new BlockItem(BlockInit.BLOODSTONE_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem BLOODSTONE_NETHERORE = new BlockItem(BlockInit.BLOODSTONE_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SAPPHIRE_BLOCK = new BlockItem(BlockInit.SAPPHIRE_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SAPPHIRE_ORE = new BlockItem(BlockInit.SAPPHIRE_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SAPPHIRE_ENDORE = new BlockItem(BlockInit.SAPPHIRE_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem SAPPHIRE_NETHERORE = new BlockItem(BlockInit.SAPPHIRE_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem RUBY_BLOCK = new BlockItem(BlockInit.RUBY_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem RUBY_ORE = new BlockItem(BlockInit.RUBY_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem RUBY_ENDORE = new BlockItem(BlockInit.RUBY_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem RUBY_NETHERORE = new BlockItem(BlockInit.RUBY_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem AMETHYST_BLOCK = new BlockItem(BlockInit.AMETHYST_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem AMETHYST_ORE = new BlockItem(BlockInit.AMETHYST_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem AMETHYST_ENDORE = new BlockItem(BlockInit.AMETHYST_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem AMETHYST_NETHERORE = new BlockItem(BlockInit.AMETHYST_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MAGICAL_ORE = new BlockItem(BlockInit.MAGICAL_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MAGICAL_ENDORE = new BlockItem(BlockInit.MAGICAL_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MAGICAL_NETHERORE = new BlockItem(BlockInit.MAGICAL_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_BLOCK = new BlockItem(BlockInit.ROSEQUARTZ_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_CHISELED = new BlockItem(BlockInit.ROSEQUARTZ_CHISELED, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_PILLAR = new BlockItem(BlockInit.ROSEQUARTZ_PILLAR, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_SMOOTH = new BlockItem(BlockInit.ROSEQUARTZ_SMOOTH, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_BRICKS = new BlockItem(BlockInit.ROSEQUARTZ_BRICKS, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_ORE = new BlockItem(BlockInit.ROSEQUARTZ_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_ENDORE = new BlockItem(BlockInit.ROSEQUARTZ_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem ROSEQUARTZ_NETHERORE = new BlockItem(BlockInit.ROSEQUARTZ_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MOONSTONE_BLOCK = new BlockItem(BlockInit.MOONSTONE_BLOCK, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MOONSTONE_ORE = new BlockItem(BlockInit.MOONSTONE_ORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MOONSTONE_ENDORE = new BlockItem(BlockInit.MOONSTONE_ENDORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));
    public static final BlockItem MOONSTONE_NETHERORE = new BlockItem(BlockInit.MOONSTONE_NETHERORE, new Item.Settings().group(MythicCraft.MYTHICCRAFT_BLOCKS));

    public static void registerItems() {

        //Items
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampric_gem"), VAMPIRIC_GEM);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythic_diamond"), MYTHIC_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "bloodstone_ingot"), BLOODSTONE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonheart_ingot"), DRAGONHEART_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "amethyst"), AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "magic_crystal"), MAGIC_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rose_quartz"), ROSE_QUARTZ);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "moonstone"), MOONSTONE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "pureglowstone_dust"), PUREGLOWSTONE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "darkglowstone_dust"), DARKGLOWSTONE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "pixie_dust"), PIXIE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "fairy_dust"), FAIRY_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mermaid_scale"), MERMAID_SCALE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "basilisk_scale"), BASILISK_SCALE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "siren_scale"), SIREN_SCALE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "kraken_scale"), KRAKEN_SCALE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "kraken_tooth"), KRAKEN_TOOTH);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_red"), DRAGONSCALE_RED);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_amethyst"), DRAGONSCALE_AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_black"), DRAGONSCALE_BLACK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_green"), DRAGONSCALE_GREEN);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_gray"), DRAGONSCALE_GRAY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_white"), DRAGONSCALE_WHITE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_sapphire"), DRAGONSCALE_SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_silver"), DRAGONSCALE_SILVER);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragonscale_blue"), DRAGONSCALE_BLUE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "dragon_bone"), DRAGON_BONE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_ring"), VAMPIRIC_RING);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "daylight_ring"), DAYLIGHT_RING);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "wolfsbane"), WOLFSBANE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vervain"), VERVAIN);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "belladonna"), BELLADONNA);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mandrake"), MANDRAKE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "foxgloves"), FOXGLOVES);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "wormwood"), WORMWOOD);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "nightshade"), NIGHTSHADE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "aconitum"), ACONITUM);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "hellebore"), HELLEBORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "white_sage"), WHITE_SAGE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "water_artichoke"), WATER_ARTICHOKE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "icy_needle"), ICY_NEEDLE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "ash"), ASH);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "witches_hand"), WITCHES_HAND);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "infested_goo"), INFESTED_GOO);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "infested_slimeball"), INFESTED_SLIMEBALL);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "charred_slimeball"), CHARRED_SLIMEBALL);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "contract_lilith"), CONTRACT_LILITH);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "contract_death"), CONTRACT_DEATH);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "contract_pandora"), CONTRACT_PANDORA);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "soul_bottle"), SOUL_BOTTLE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "magical_gear"), MAGICAL_GEAR);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "magical_dust"), MAGICAL_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "lilith_bloodbottle"), LILITH_BLOODBOTTLE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "death_bloodbottle"), DEATH_BLOODBOTTLE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "pandora_bloodbottle"), PANDORA_BLOODBOTTLE);

        //Armor
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_helmet"), new ModArmor(VAMPIRIC_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_chestplate"), new ModArmor(VAMPIRIC_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_leggings"), new ModArmor(VAMPIRIC_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_boots"), new ModArmor(VAMPIRIC_ARMOR, EquipmentSlot.FEET));

        //Food
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "raw_kraken"), RAW_KRAKEN);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "cooked_kraken"), COOKED_KRAKEN);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "blood_berry"), BLOOD_BERRY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "silver_berry"), SILVER_BERRY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "charred_berry"), CHARRED_BERRY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "soul_berry"), SOUL_BERRY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "icy_berry"), ICY_BERRY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "infested_berry"), INFESTED_BERRY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mystic_berry"), MYSTIC_BERRY);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "blood_apple"), BLOOD_APPLE);

        //Fuel
        FuelRegistry.INSTANCE.add(WOOD_ASH, 1200);

        //Tools
        //Vampiric
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_sword"), new ModSword(new VampiricToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_pickaxe"), new ModPickaxe(new VampiricToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_axe"), new ModAxe(new VampiricToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_shovel"), new ModShovel(new VampiricToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampiric_hoe"), new ModHoe(new VampiricToolMaterial()));
        //Mythic Diamond
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_sword"), new ModSword(new MythicDiamondToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_pickaxe"), new ModPickaxe(new MythicDiamondToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_shovel"), new ModAxe(new MythicDiamondToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_axe"), new ModShovel(new MythicDiamondToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_hoe"), new ModHoe(new MythicDiamondToolMaterial()));

        //Block Item
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampric_block"), VAMPIRIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampric_ore"), VAMPIRIC_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampric_endore"), VAMPIRIC_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "vampric_netherore"), VAMPIRIC_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "silver_endore"), SILVER_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "silver_netherore"), SILVER_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_block"), MYTHICDIAMOND_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_ore"), MYTHICDIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_endore"), MYTHICDIAMOND_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_netherore"), MYTHICDIAMOND_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "bloodstone_block"), BLOODSTONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "bloodstone_ore"), BLOODSTONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "bloodstone_endore"), BLOODSTONE_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "bloodstone_netherore"), BLOODSTONE_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "sapphire_endore"), SAPPHIRE_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "sapphire_netherore"), SAPPHIRE_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "ruby_endore"), RUBY_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "ruby_netherore"), RUBY_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "amethyst_block"), AMETHYST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "amethyst_ore"), AMETHYST_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "amethyst_endore"), AMETHYST_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "amethyst_netherore"), AMETHYST_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "magical_ore"), MAGICAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "magical_endore"), MAGICAL_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "magical_netherore"), MAGICAL_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_block"), ROSEQUARTZ_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_chiseled"), ROSEQUARTZ_CHISELED);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_pillar"), ROSEQUARTZ_PILLAR);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_smooth"), ROSEQUARTZ_SMOOTH);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_bricks"), ROSEQUARTZ_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_ore"), ROSEQUARTZ_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_endore"), ROSEQUARTZ_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "rosequartz_netherore"), ROSEQUARTZ_NETHERORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "moonstone_block"), MOONSTONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "moonstone_ore"), MOONSTONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "moonstone_endore"), MOONSTONE_ENDORE);
        Registry.register(Registry.ITEM, new Identifier(MythicCraft.MOD_ID, "moonstone_netherore"), MOONSTONE_NETHERORE);



    }
}
