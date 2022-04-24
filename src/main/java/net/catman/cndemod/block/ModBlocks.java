package net.catman.cndemod.block;

import net.catman.cndemod.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.catman.cndemod.MCCourseMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block kszyniolium_BLOCK = registerBlock("kszyniolium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.CnDe);

    public static final Block kszyniolium_ORE = registerBlock("kszyniolium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.CnDe);

    public static final Block kszyniolium_BRICK = registerBlock("kszyniolium_brick",
            new Block(FabricBlockSettings.of(Material.METAL).hardness(3f).resistance(14f).requiresTool()), ModItemGroups.CnDe);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + MCCourseMod.MOD_ID);
    }
}
