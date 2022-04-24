package net.catman.cndemod.util;

import net.catman.cndemod.entity.ModEntities;
import net.catman.cndemod.entity.custom.iudex_gundyr_Entity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.IUDEX_GUNDYR, iudex_gundyr_Entity.setAttributes());
    }

    public static void registerModStuffs() {
        registerAttributes();
    }
}
