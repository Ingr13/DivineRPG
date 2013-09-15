package net.divinerpg.render.entity;

import net.divinerpg.lib.ResourceLocs;
import net.divinerpg.overworld.block.tileentity.TileEntityParasectaAltar;
import net.divinerpg.render.entity.model.ModelPhoenixAltar;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderPheonixAltar extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelPhoenixAltar modelAltar;
    public ResourceLocation texture = ResourceLocs.BLOCK_PARASECTA_ALTAR;
    public RenderPheonixAltar()
    {
        modelAltar = new ModelPhoenixAltar(scale);
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityParasectaAltar)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityParasectaAltar tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
        this.bindTexture(texture);
        GL11.glPushMatrix();
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
