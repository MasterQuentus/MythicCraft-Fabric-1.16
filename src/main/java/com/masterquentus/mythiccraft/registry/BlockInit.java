package com.masterquentus.mythiccraft.registry;

import com.masterquentus.mythiccraft.MythicCraft;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {

    //Ores/Blocks

    public static final Block VAMPIRIC_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block VAMPIRIC_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block VAMPIRIC_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block VAMPIRIC_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block SILVER_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block SILVER_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block SILVER_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MYTHICDIAMOND_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.MAGENTA)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block MYTHICDIAMOND_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(5.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MYTHICDIAMOND_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(5.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MYTHICDIAMOND_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(5.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block BLOODSTONE_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block BLOODSTONE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block BLOODSTONE_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block BLOODSTONE_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.BLUE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block SAPPHIRE_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block SAPPHIRE_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block RUBY_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block RUBY_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block RUBY_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block AMETHYST_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.MAGENTA)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block AMETHYST_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block AMETHYST_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block AMETHYST_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MAGICAL_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MAGICAL_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MAGICAL_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block ROSEQUARTZ_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.WHITE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block ROSEQUARTZ_CHISELED = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.WHITE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block ROSEQUARTZ_PILLAR = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.WHITE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block ROSEQUARTZ_SMOOTH = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.WHITE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block ROSEQUARTZ_BRICKS = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.WHITE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));


    public static final Block ROSEQUARTZ_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block ROSEQUARTZ_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block ROSEQUARTZ_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MOONSTONE_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL, MaterialColor.LIGHT_BLUE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0F, 30.0F)
            .sounds(BlockSoundGroup.METAL));

    public static final Block MOONSTONE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.GRAY)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MOONSTONE_ENDORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.YELLOW)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    public static final Block MOONSTONE_NETHERORE = new Block(FabricBlockSettings
            .of(Material.STONE, MaterialColor.RED)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0F, 15.0F)
            .sounds(BlockSoundGroup.STONE));

    //Planks

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "vampric_block"), VAMPIRIC_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "vampric_ore"), VAMPIRIC_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "vampric_endore"), VAMPIRIC_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "vampric_netherore"), VAMPIRIC_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "silver_endore"), SILVER_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "silver_netherore"), SILVER_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_block"), MYTHICDIAMOND_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_ore"), MYTHICDIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_endore"), MYTHICDIAMOND_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "mythicdiamond_netherore"), MYTHICDIAMOND_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "bloodstone_block"), BLOODSTONE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "bloodstone_ore"), BLOODSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "bloodstone_endore"), BLOODSTONE_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "bloodstone_netherore"), BLOODSTONE_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "sapphire_endore"), SAPPHIRE_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "sapphire_netherore"), SAPPHIRE_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "ruby_endore"), RUBY_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "ruby_netherore"), RUBY_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "amethyst_block"), AMETHYST_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "amethyst_ore"), AMETHYST_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "amethyst_endore"), AMETHYST_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "amethyst_netherore"), AMETHYST_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "magical_ore"), MAGICAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "magical_endore"), MAGICAL_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "magical_netherore"), MAGICAL_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_block"), ROSEQUARTZ_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_chiseled"), ROSEQUARTZ_CHISELED);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_pillar"), ROSEQUARTZ_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_smooth"), ROSEQUARTZ_SMOOTH);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_bricks"), ROSEQUARTZ_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_ore"), ROSEQUARTZ_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_endore"), ROSEQUARTZ_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "rosequartz_netherore"), ROSEQUARTZ_NETHERORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "moonstone_block"), MOONSTONE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "moonstone_ore"), MOONSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "moonstone_endore"), MOONSTONE_ENDORE);
        Registry.register(Registry.BLOCK, new Identifier(MythicCraft.MOD_ID, "moonstone_netherore"), MOONSTONE_NETHERORE);

    }
}
