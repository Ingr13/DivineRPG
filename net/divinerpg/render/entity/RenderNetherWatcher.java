package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.EntityNetherWatcher;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderNetherWatcher extends RenderLivingCreature
{
    private float scale;

    public RenderNetherWatcher(ModelBase var1, float var2, float var3, ResourceLocation textureLoc )
    {
        super(var1, var2 * var3, textureLoc);
        this.scale = var3;
    }

    @Override
    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderWatcher((EntityNetherWatcher)var1, var2, var4, var6, var8, var9);
    }

    public void renderWatcher(EntityNetherWatcher var1, double var2, double var4, double var6, float var8, float var9)
    {
        BossStatus.setBossStatus(var1, true);
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityNetherWatcher var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityNetherWatcher)var1, var2);
    }
}
