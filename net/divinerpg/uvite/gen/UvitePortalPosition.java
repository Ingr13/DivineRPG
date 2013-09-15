package net.divinerpg.uvite.gen;

import net.minecraft.util.ChunkCoordinates;

public class UvitePortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterUvite field_85088_e;

    public UvitePortalPosition(TeleporterUvite tutorialTeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = tutorialTeleporter;
        this.field_85087_d = par5;
    }
}