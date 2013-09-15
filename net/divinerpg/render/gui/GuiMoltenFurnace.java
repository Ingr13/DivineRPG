package net.divinerpg.render.gui;

import net.divinerpg.block.container.ContainerMoltenFurnace;
import net.divinerpg.lib.ResourceGuiLoc;
import net.divinerpg.overworld.block.tileentity.TileEntityMoltenFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiMoltenFurnace extends GuiContainer
{
    private TileEntityMoltenFurnace furnaceInventory;

    public GuiMoltenFurnace(InventoryPlayer var1, TileEntityMoltenFurnace var2)
    {
        super(new ContainerMoltenFurnace(var1, var2));
        this.furnaceInventory = var2;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString("Molten Furnace", 50, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        //this.mc.renderEngine.bindTexture("mods/DivineRPG/textures/gui/NoFuel.png");
        mc.getTextureManager().bindTexture(ResourceGuiLoc.GUI_MOLTENFURNACE);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
        int var7;

        if (this.furnaceInventory.isBurning())
        {
            var7 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
        }

        var7 = this.furnaceInventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
    }
}
