package net.divinerpg.block;

import net.minecraft.block.material.Material;

public class ModLog extends BlockBase{

    public ModLog(int blockID, String par2) {
        super(blockID, Material.wood);
        this.registerTexture(par2 + "Log_Side", par2 + "Log_Top", par2 + "Log_Top");
    }

}
