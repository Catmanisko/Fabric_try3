package net.catman.cndemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.catman.cndemod.MCCourseMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item kszyniolium_INGOT = registerItem("kszyniolium_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item kszyniolium_NUGGET = registerItem("kszyniolium_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }
}
