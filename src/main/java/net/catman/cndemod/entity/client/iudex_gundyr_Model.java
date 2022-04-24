package net.catman.cndemod.entity.client;

import net.catman.cndemod.MCCourseMod;
import net.catman.cndemod.entity.custom.iudex_gundyr_Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class iudex_gundyr_Model extends AnimatedGeoModel<iudex_gundyr_Entity> {
    @Override
    public Identifier getModelLocation(iudex_gundyr_Entity entity) {
        return new Identifier(MCCourseMod.MOD_ID, "geo/iudex_gundyr.geo.json");
    }

    @Override
    public Identifier getTextureLocation(iudex_gundyr_Entity entity) {
        return new Identifier(MCCourseMod.MOD_ID, "textures/entity/iudex_gundyr/iudex_gundyr.png");
    }

    @Override
    public Identifier getAnimationFileLocation(iudex_gundyr_Entity entity) {
        return new Identifier(MCCourseMod.MOD_ID, "animations/iudex_gundyr.animation.json");
    }
}
