package net.divinerpg.item;

import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityAyeracoBlue;
import net.divinerpg.mob.entity.EntityAyeracoGreen;
import net.divinerpg.mob.entity.EntityAyeracoPurple;
import net.divinerpg.mob.entity.EntityAyeracoRed;
import net.divinerpg.mob.entity.EntityAyeracoYellow;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class ItemHordeHorn extends ItemsBase
{
    private World worldObj;
    private int spawnTick;

    public ItemHordeHorn(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.spawnTick = 600;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.bow;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    @Override
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (!var3.isRemote)
        {
            int var11 = var3.getBlockId(var4, var5, var6);
            var4 += Facing.offsetsXForSide[var7];
            var5 += Facing.offsetsYForSide[var7];
            var6 += Facing.offsetsZForSide[var7];
            double var12 = 0.0D;

            if (var7 == 1 && var11 == Block.fence.blockID || var11 == Block.netherFence.blockID)
            {
                var12 = 0.5D;
            }

            if (var3.provider.dimensionId == 1)
            {
                if (this.spawnTick == 600)
                {
                    var3.playSoundAtEntity(var2, Sound.AyeracoSpawn, 20.0F, 1.0F);
                    var2.addChatMessage("The Green Ayeraco has been called upon!");
                }
                else if (this.spawnTick == 430)
                {
                    var2.addChatMessage("The Blue Ayeraco has been called upon!");
                }
                else if (this.spawnTick == 280)
                {
                    var2.addChatMessage("The Red Ayeraco has been called upon!");
                }
                else if (this.spawnTick == 210)
                {
                    var2.addChatMessage("The Yellow Ayeraco has been called upon!");
                }
                else if (this.spawnTick == 145)
                {
                    var2.addChatMessage("The Purple Ayeraco has been called upon!");
                }
                else if (this.spawnTick == 0)
                {
                    int var13 = 0;
                    if (!var3.isRemote)
                    {
                        while (var13 < 1)//1 gets the amount of mobs to spawn at once
                        {
                            EntityAyeracoBlue var14 = new EntityAyeracoBlue(var3);
                            EntityAyeracoGreen var15 = new EntityAyeracoGreen(var3);
                            EntityAyeracoRed var16 = new EntityAyeracoRed(var3);
                            EntityAyeracoYellow var17 = new EntityAyeracoYellow(var3);
                            EntityAyeracoPurple var18 = new EntityAyeracoPurple(var3);
                            var14.setPosition(var4, var5+2, var6);
                            var15.setPosition(var4, var5+2, var6);
                            var16.setPosition(var4, var5+2, var6);
                            var17.setPosition(var4, var5+2, var6);
                            var18.setPosition(var4, var5+2, var6);
                            var3.spawnEntityInWorld(var14);
                            var3.spawnEntityInWorld(var15);
                            var3.spawnEntityInWorld(var16);
                            var3.spawnEntityInWorld(var17);
                            var3.spawnEntityInWorld(var18);
                            ++var13;
                        }

                    }
                    var2.addChatMessage("The Ayeraco Horde has arrived!");
                    var2.inventory.consumeInventoryItem(this.itemID);
                    return true;
                }
                this.spawnTick -= 5;
            }
            else
            {
                var2.addChatMessage("The Ayeraco Horde can only be spawned in the End");
            }

            return false;
        }
        return true;
    }
}