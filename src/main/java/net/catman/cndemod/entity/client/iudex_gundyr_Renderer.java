package net.catman.cndemod.entity.client;

import net.catman.cndemod.MCCourseMod;
import net.catman.cndemod.entity.custom.iudex_gundyr_Entity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class iudex_gundyr_Renderer extends GeoEntityRenderer<iudex_gundyr_Entity> {
    public iudex_gundyr_Renderer(EntityRendererFactory.Context ctx) {
        super(ctx, new iudex_gundyr_Model());
    }

    @Override
    public Identifier getTextureLocation(iudex_gundyr_Entity entity) {
        return new Identifier(MCCourseMod.MOD_ID, "textures/entity/iudex_gundyr/iudex_gundyr.png");
    }
}

