package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.EntityFractite;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFractite extends RenderLivingCreature
{
    private float scale;

    public RenderFractite(ModelBase var1, float var2, float var3, ResourceLocation textureLoc)
    {
        super(var1, var2 * var3, textureLoc);
        this.scale = var3;
    }

    protected void preRenderScale(EntityFractite var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityFractite)var1, var2);
    }
}
