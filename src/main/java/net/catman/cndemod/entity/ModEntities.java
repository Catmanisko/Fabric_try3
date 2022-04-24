package net.catman.cndemod.entity;
import net.catman.cndemod.MCCourseMod;
import net.catman.cndemod.entity.custom.iudex_gundyr_Entity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModEntities {
    public static final EntityType<iudex_gundyr_Entity> IUDEX_GUNDYR = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(MCCourseMod.MOD_ID, "iudex_gundyr"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, iudex_gundyr_Entity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());
}
