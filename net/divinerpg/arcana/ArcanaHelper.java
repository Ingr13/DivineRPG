package net.divinerpg.arcana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.divinerpg.lib.RefDebug;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class ArcanaHelper implements IPlayerTracker {

    public static HashMap<String, Integer> bars = new HashMap<String, Integer>();
    public static HashMap<String, Integer> delays = new HashMap<String, Integer>();
    private static ArrayList arcanaList = new ArrayList(0);
    public static String playerID;
    private int arcana = 0;



    public static void add(String username)
    {	
        playerID = username;
        arcanaList.ensureCapacity(arcanaList.size() + 1);
        bars.put(username, 200);
        delays.put(username, 0);
    }

    public static void remove(String par1)
    {
        bars.remove(par1);
        delays.remove(par1);
    }

    public static void updateAllBars(List<EntityPlayer> players)
    {
        for (int l = 0; l < players.size(); l++)
        {
            String user = players.get(l).username;
            if(user == null) {
                continue;
            }

            if (delays.get(user) == 0)
            {
                bars.put(user, bars.get(user) + 1);
            }
            else if (delays.containsKey(user)) {
                delays.put(user, delays.get(user) - 1);
            } else {
                add(user);
            }

        }
    }

    public static ArcanaHelper get(String par1)
    {
        for (int i = 0; i < arcanaList.size(); i++)
        {
            arcanaList.get(i); if (ArcanaHelper.playerID == par1)
                return (ArcanaHelper)arcanaList.get(i);
        }
        int i = 0;
        return (ArcanaHelper)arcanaList.get(i);
    }

    public float getBarValue()
    {
        return this.arcana;
    }

    public static boolean useBar(EntityPlayer user, int amount)
    {
        if (RefDebug.INFINITE_MANA)
            return true;

        String name = user.username;
        if (!bars.containsKey(name))
        {
            add(name);
            return false;
        }

        if (bars.get(name) > amount)
        {
            bars.put(name, bars.get(name) - amount);
            delays.put(name, 30);
            return true;
        }
        else
            return false;
    }

    public static void regen(String par1, int par2)
    {
        if (bars.containsKey(par1))
        {
            int var1 = bars.get(par1) + par2;
            if (var1 > 200)
            {
                var1 = 200;
            }
            bars.put(par1, var1);
        }
        else
        {
            add(par1);
        }
    }

    @Override
    public void onPlayerLogin(EntityPlayer player) {
        add(player.username);
    }

    @Override
    public void onPlayerLogout(EntityPlayer player) {
        remove(player.username);
    }

    @Override
    public void onPlayerChangedDimension(EntityPlayer player) { 
        add(player.username);
    }

    @Override
    public void onPlayerRespawn(EntityPlayer player) {
        add(player.username);
    }
}
