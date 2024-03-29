package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.EntityJungleBat;
import net.divinerpg.render.entity.model.ModelJungleBat;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderJungleBat extends RenderLivingCreature
{
    /**
     * not actually sure this is size, is not used as of now, but the model would be recreated if the value changed and
     * it seems a good match for a bats size
     */
    private int renderedBatSize;

    public RenderJungleBat(ModelJungleBat modelJungleBat, float f, ResourceLocation textureLoc)
    {
        super(new ModelJungleBat(), 0.5F, textureLoc);
        this.renderedBatSize = ((ModelJungleBat)this.mainModel).getBatSize();
    }

    public void func_82443_a(EntityJungleBat par1EntityBat, double par2, double par4, double par6, float par8, float par9)
    {
        int var10 = ((ModelJungleBat)this.mainModel).getBatSize();

        if (var10 != this.renderedBatSize)
        {
            this.renderedBatSize = var10;
            this.mainModel = new ModelJungleBat();
        }

        super.doRenderLiving(par1EntityBat, par2, par4, par6, par8, par9);
    }

    protected void func_82442_a(EntityJungleBat par1EntityBat, float par2)
    {
        GL11.glScalef(0.7F, 0.7F, 0.7F);
    }

    protected void func_82445_a(EntityJungleBat par1EntityBat, double par2, double par4, double par6)
    {
        super.renderLivingAt(par1EntityBat, par2, par4, par6);
    }

    protected void func_82444_a(EntityJungleBat par1EntityBat, float par2, float par3, float par4)
    {
        if (!par1EntityBat.getIsBatHanging())
        {
            GL11.glTranslatef(0.0F, MathHelper.cos(par2 * 0.3F) * 0.1F, 0.0F);
        }
        else
        {
            GL11.glTranslatef(0.0F, -0.1F, 0.0F);
        }

        super.rotateCorpse(par1EntityBat, par2, par3, par4);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2)
    {
        this.func_82442_a((EntityJungleBat)par1EntityLiving, par2);
    }

    protected void rotateCorpse(EntityLivingBase par1EntityLiving, float par2, float par3, float par4)
    {
        this.func_82444_a((EntityJungleBat)par1EntityLiving, par2, par3, par4);
    }

    /**
     * Sets a simple glTranslate on a LivingEntity.
     */
    protected void renderLivingAt(EntityLiving par1EntityLiving, double par2, double par4, double par6)
    {
        this.func_82445_a((EntityJungleBat)par1EntityLiving, par2, par4, par6);
    }

    @Override
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.func_82443_a((EntityJungleBat)par1EntityLiving, par2, par4, par6, par8, par9);
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
        this.func_82443_a((EntityJungleBat)par1Entity, par2, par4, par6, par8, par9);
    }
}
