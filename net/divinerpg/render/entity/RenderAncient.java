package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.EntityAncient;
import net.divinerpg.render.entity.model.ModelAncientEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderAncient extends RenderLivingCreature
{
    private float scale;

    public RenderAncient(ModelAncientEntity var1, float var2, float var3, ResourceLocation textureLoc)
    {
        super(var1, var2 * var3, textureLoc);
        this.scale = var3;
    }

    protected void preRenderScale(EntityAncient var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    @Override
    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityAncient)var1, var2);
    }

    public void func_48421_a(EntityAncient var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    @Override
    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a((EntityAncient)var1, var2, var4, var6, var8, var9);
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
        this.func_48421_a((EntityAncient)var1, var2, var4, var6, var8, var9);
    }
}
