package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.VetheaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityMysteriousManLayer2 extends EntityGive
{

    public EntityMysteriousManLayer2(World par1) 
    {
        super(par1, VetheaItemHelper.darvenLump, 6);
    }
    public int spawnLayer = 2;
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * this.spawnLayer  && this.posY > 64.0D * (this.spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);

                switch (this.rand.nextInt(4))
                {
                    case 0:
                        var1.addChatMessage("Mysterious Man: You're progressing, good good.");
                        break;
                    case 1:
                        var1.addChatMessage("Mysterious Man: Can you hear the screams and roars from above?");
                        break;
                    case 2:
                        var1.addChatMessage("Mysterious Man: Everytime you infuse something, the gods become stronger.");
                        break;
                    case 3:
                        var1.addChatMessage("Mysterious Man: The gods are using your dreams as a battlefield.");
                }

            }

            return true;
        } else
            return super.interact(var1);
    }
}