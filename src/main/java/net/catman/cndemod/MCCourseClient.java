package net.catman.cndemod;

import net.catman.cndemod.entity.ModEntities;
import net.catman.cndemod.entity.client.iudex_gundyr_Renderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;


public class MCCourseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.IUDEX_GUNDYR, iudex_gundyr_Renderer::new);

    }
}
