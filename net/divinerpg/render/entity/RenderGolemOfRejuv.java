package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.EntityGolemOfRejuv;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderGolemOfRejuv extends RenderLivingCreature
{
    private float scale;
    public RenderGolemOfRejuv(ModelBase model, float shadowSize, ResourceLocation textureLoc)
    {
        super(model, shadowSize, textureLoc);
        this.scale = 0.5F;
    }

    public void renderCow(EntityGolemOfRejuv var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
        this.scale = 0.5F;
    }

    @Override
    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityGolemOfRejuv)var1, var2, var4, var6, var8, var9);
        this.scale = 0.5F;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    @Override
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityGolemOfRejuv)var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityGolemOfRejuv var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityGolemOfRejuv)var1, var2);
    }
}
