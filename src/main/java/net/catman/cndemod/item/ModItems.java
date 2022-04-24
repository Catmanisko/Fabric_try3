package net.catman.cndemod.item;

import net.catman.cndemod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.catman.cndemod.MCCourseMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item kszyniolium_ingot = registerItem("kszyniolium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.CnDe)));

    public static final Item kszyniolium_nugget = registerItem("kszyniolium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.CnDe)));

    public static final Item kszyniolium_RAW = registerItem("kszyniolium_raw",
            new Item(new FabricItemSettings().group(ModItemGroups.CnDe)));

public static final Item IUDEX_GUNDYR_SPAWN_EGG = registerItem("iudex_gundyr_spawn_egg",
    new SpawnEggItem(ModEntities.IUDEX_GUNDYR,0x948e8d, 0x3b3635, new FabricItemSettings().group(ModItemGroups.CnDe)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }
}
