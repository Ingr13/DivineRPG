package net.divinerpg.render.gui;

import java.awt.Color;

import net.divinerpg.block.container.ContainerInfusionTable;
import net.divinerpg.lib.ResourceGuiLoc;
import net.divinerpg.overworld.block.tileentity.TileEntityInfusionTable;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;


public class GuiInfusionTable extends GuiContainer
{
    private TileEntityInfusionTable TeInfusionTable;

    public GuiInfusionTable(InventoryPlayer inventory, TileEntityInfusionTable var7) 
    {
        super(new ContainerInfusionTable(inventory, var7));
        this.TeInfusionTable = var7;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        //this.mc.renderEngine.bindTexture("/mods/DivineRPG/textures/gui/InfusionTable.png");
        mc.getTextureManager().bindTexture(ResourceGuiLoc.GUI_INFUSIONTABLE);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3)
    {
        super.drawScreen(par1, par2, par3);
        ItemStack item = null;
        String s = null;
        item = TeInfusionTable.getStackInSlot(2);
        if(item != null)
        {
            s = item.getDisplayName();
            this.drawString(fontRenderer, s, width / 2 - 20, 62, Color.blue.getRGB());
        }		
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    protected void keyTyped(char par1, int par2)
    {
        if (par2 == 1 || par2 == mc.gameSettings.keyBindInventory.keyCode)
        {
            mc.thePlayer.closeScreen();
        }
    }
}
