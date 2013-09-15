
package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.EntityCyclops;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderCyclops extends RenderLivingCreature
{
    private float scale;

    public RenderCyclops(ModelBase var1, float var2, float scale, ResourceLocation texutreLoc)
    {
        super(var1, var2 * scale, texutreLoc);
        this.scale = scale;
    }

    protected void preRenderScale(EntityCyclops var1, float var2)
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
        this.preRenderScale((EntityCyclops)var1, var2);
    }
}
