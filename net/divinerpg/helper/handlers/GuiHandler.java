package net.divinerpg.helper.handlers;

import net.divinerpg.block.container.ContainerCoalStoneFurnace;
import net.divinerpg.block.container.ContainerDreamLamp;
import net.divinerpg.block.container.ContainerExtractinator;
import net.divinerpg.block.container.ContainerInfusionTable;
import net.divinerpg.block.container.ContainerWhitefireFurnace;
import net.divinerpg.overworld.block.tileentity.TileEntityCoalStoneFurnace;
import net.divinerpg.overworld.block.tileentity.TileEntityDreamLamp;
import net.divinerpg.overworld.block.tileentity.TileEntityExtractor;
import net.divinerpg.overworld.block.tileentity.TileEntityInfusionTable;
import net.divinerpg.overworld.block.tileentity.TileEntityWhitefireFurnace;
import net.divinerpg.render.gui.GuiDreamLamp;
import net.divinerpg.render.gui.GuiExtractinator;
import net.divinerpg.render.gui.GuiInfusionTable;
import net.divinerpg.render.gui.GuiStoneFurnace;
import net.divinerpg.render.gui.GuiWhitefireFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {


    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        TileEntity entity = world.getBlockTileEntity(x, y, z);

        if(entity instanceof TileEntityInfusionTable)
            return new ContainerInfusionTable(player.inventory, (TileEntityInfusionTable) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityCoalStoneFurnace)
            return new ContainerCoalStoneFurnace(player.inventory, (TileEntityCoalStoneFurnace) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityExtractor)
            return new ContainerExtractinator(player.inventory, (TileEntityExtractor) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityWhitefireFurnace)
            return new ContainerWhitefireFurnace(player.inventory, (TileEntityWhitefireFurnace) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityDreamLamp)
            return new ContainerDreamLamp(player.inventory, (TileEntityDreamLamp) world.getBlockTileEntity(x, y, z));

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        TileEntity entity = world.getBlockTileEntity(x, y, z);

        if(entity instanceof TileEntityInfusionTable)
            return new GuiInfusionTable(player.inventory, (TileEntityInfusionTable) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityCoalStoneFurnace)
            return new GuiStoneFurnace(player.inventory, (TileEntityCoalStoneFurnace) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityExtractor)
            return new GuiExtractinator(player.inventory, (TileEntityExtractor) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityWhitefireFurnace)
            return new GuiWhitefireFurnace(player.inventory, (TileEntityWhitefireFurnace) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityDreamLamp)
            return new GuiDreamLamp(player.inventory, (TileEntityDreamLamp) world.getBlockTileEntity(x, y, z));

        return null;
    }

}