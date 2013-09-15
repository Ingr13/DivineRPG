package net.divinerpg.render.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderLivingCreature extends RenderLiving {

    ResourceLocation texture;
    public RenderLivingCreature(ModelBase par1ModelBase, float shadowSize, ResourceLocation resourceLoc) {
        super(par1ModelBase, shadowSize);
        texture = resourceLoc;
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return texture;
	}

}
