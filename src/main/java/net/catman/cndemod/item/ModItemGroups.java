package net.catman.cndemod.item;


import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.catman.cndemod.MCCourseMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CnDe = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID, "cndes"),
            () -> new ItemStack(ModItems.kszyniolium_ingot));
}
