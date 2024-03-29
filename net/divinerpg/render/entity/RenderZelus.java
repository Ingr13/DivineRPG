package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.EntityZelus;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderZelus extends RenderBipedCreature
{
    public RenderZelus(ModelBiped model, float shadowSize, ResourceLocation textureLoc)
    {
        super(model, shadowSize, textureLoc);
    }

    public void renderZelus(EntityZelus par1EntityZelus, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityZelus, par2, par4, par6, par8, par9);
    }

    @Override
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderZelus((EntityZelus)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    @Override
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderZelus((EntityZelus)par1Entity, par2, par4, par6, par8, par9);
    }
}
