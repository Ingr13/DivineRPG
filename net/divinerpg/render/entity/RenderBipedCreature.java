package net.divinerpg.render.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBipedCreature extends RenderBiped {
	
    ResourceLocation texture;
    public RenderBipedCreature(ModelBiped model, float shadowSize, ResourceLocation textureLoc) {
        super(model, shadowSize);
        texture = textureLoc;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return texture;
    }

}
