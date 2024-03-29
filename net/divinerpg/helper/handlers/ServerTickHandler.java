package net.divinerpg.helper.handlers;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

import net.divinerpg.arcana.ArcanaHelper;
import net.divinerpg.helper.DimensionRegistry;
import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler
{
	private static final int var6 = 0;
	private int healTimer;

	public void tickStart(EnumSet var1, Object ... var2) {}

	public void tickEnd(EnumSet var1, Object ... var2)
	{
		onTickInGame();
		arcanaRegen();
	}

	public EnumSet ticks()
	{
		return EnumSet.of(TickType.SERVER);
	}

	public String getLabel()
	{
		return "DivineRPG Server Ticks";
	}

	public void onRenderTick() {}

	public void onTickInGUI(GuiScreen var1) {}

	public static void arcanaRegen()
	{
		ArcanaHelper.updateAllBars(MinecraftServer.getServer().getConfigurationManager().playerEntityList);
	}

	public void onTickInGame()
	{
		ArrayList var3 = (ArrayList)MinecraftServer.getServer().getConfigurationManager().playerEntityList;
		Iterator var4 = var3.iterator();

		while (var4.hasNext())
		{
			EntityPlayerMP var5 = (EntityPlayerMP)var4.next();
			ItemStack boots = var5.inventory.armorInventory[0];
			ItemStack legs = var5.inventory.armorInventory[1];
			ItemStack chest = var5.inventory.armorInventory[2];
			ItemStack helm = var5.inventory.armorInventory[3];

			int bootID = 0;
			int chestID = 0;
			int legID = 0;
			int helmID = 0;
			if (boots != null)
			{
				bootID = boots.itemID;
			}
			if (chest != null)
			{
				chestID = chest.itemID;
			}
			if (legs != null)
			{
				legID = legs.itemID;
			}
			if (helm != null)
			{
				helmID = helm.itemID;
			}
			if (var5.capabilities.isCreativeMode)
			{
				var5.capabilities.allowFlying = true;
			}
			else
			{
				var5.capabilities.allowFlying = false;
			}

			if (bootID == OverworldItemHelper.krakenBoots.itemID
					&& legID == OverworldItemHelper.krakenLegs.itemID
					&& chestID == OverworldItemHelper.krakenBody.itemID
					&& helmID == OverworldItemHelper.krakenHelmet.itemID)
			{
				var5.setAir(300);
			}
			else if (bootID == OverworldItemHelper.aquaticBoots.itemID
					&& legID == OverworldItemHelper.aquaticLegs.itemID
					&& chestID == OverworldItemHelper.aquaticBody.itemID
					&& helmID == OverworldItemHelper.aquaticHelmet.itemID)
			{
				var5.setAir(300);
			}
			else if (bootID == OverworldItemHelper.shadowBoots.itemID
					&& legID == OverworldItemHelper.shadowLegs.itemID
					&& chestID == OverworldItemHelper.shadowBody.itemID
					&& helmID == OverworldItemHelper.shadowHelmet.itemID)
			{

			}

			/*else if (bootID == DivineRPG.kormaBoots.itemID
					&& legID == DivineRPG.kormaLegs.itemID
					&& chestID == DivineRPG.kormaBody.itemID
					&& helmID == DivineRPG.kormaHead.itemID)
			{
				if(ArcanaList.get(var5.username).getBarValue() < 200)
				{
					ArcanaList.get(var5.username).arcanaAdd(1);
				}
			}*/
			/*else if (bootID == DivineRPG.vemosBoots.itemID
					&& legID == DivineRPG.vemosLegs.itemID
					&& chestID == DivineRPG.vemosBody.itemID
					&& helmID == DivineRPG.vemosHead.itemID)
			{
				if (this.healTimer == 4)
				{
					var5.heal(1);
					this.healTimer = 0;
				}
				else
				{
					this.healTimer++;
				}
			}*/
			else if (bootID == OverworldItemHelper.angelicBoots.itemID
					&& legID == OverworldItemHelper.angelicLegs.itemID
					&& chestID == OverworldItemHelper.angelicBody.itemID
					&& helmID == OverworldItemHelper.angelicHelmet.itemID)
			{
				var5.fallDistance = 0.0F;
			}
			/*else if (bootID == DivineRPG.bedrockBoots.itemID
					&& legID == DivineRPG.bedrockLegs.itemID
					&& chestID == DivineRPG.bedrockBody.itemID
					&& helmID == DivineRPG.bedrockHead.itemID)
			{
				var5.fallDistance = 0.0F;
			}*/
			else if (bootID == OverworldItemHelper.grimReaperBoots.itemID
					&& legID == OverworldItemHelper.grimReaperLegs.itemID
					&& chestID == OverworldItemHelper.grimReaperBody.itemID
					&& helmID == OverworldItemHelper.grimReaperHead.itemID
					&& var5.getFoodStats().getFoodLevel() < 20)
			{
				var5.getFoodStats().addStats(1, 0);
			}
			if (bootID == IceikaItemHelper.santaHead.itemID
					&& legID == IceikaItemHelper.santaLegs.itemID
					&& chestID == IceikaItemHelper.santaBody.itemID
					&& helmID == IceikaItemHelper.santaHead.itemID
					&& var5.worldObj.provider.dimensionId == DimensionRegistry.IceikaID)
			{
				var5.fallDistance = 0.0F;
				if (var5.getFoodStats().getFoodLevel() < 20)
				{
					var5.getFoodStats().addStats(1, 0);
				}
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
			}
			/*else if (bootID == DivineRPG.denseBoots.itemID
					&& legID == DivineRPG.denseLegs.itemID
					&& chestID == DivineRPG.denseBody.itemID
					&& helmID == DivineRPG.denseHead.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1, 1));
			}*/
			else if (bootID == TwilightItemHelper.divineBoots.itemID
					&& legID == TwilightItemHelper.divineLegs.itemID
					&& chestID == TwilightItemHelper.divineBody.itemID
					&& helmID == TwilightItemHelper.divineHelmet.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
			}
			/*else if (bootID == DivineRPG.ultimaBoots.itemID
					&& legID == DivineRPG.ultimaLegs.itemID
					&& chestID == DivineRPG.ultimaBody.itemID
					&& helmID == DivineRPG.ultimaHead.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 3));
			}*/
			else if (bootID == TwilightItemHelper.AzuriteBoots.itemID
					&& legID == TwilightItemHelper.Azuritelegs.itemID
					&& chestID == TwilightItemHelper.AzuriteChest.itemID
					&& helmID == TwilightItemHelper.AzuriteHelmet.itemID
					&& var5.getAir() < 300
					&& var5.getHealth() < 20)
			{
				var5.heal(1);
			}
			/*else if (bootID == DivineRPG.glisteningBoots.itemID
					&& legID == DivineRPG.glisteningLegs.itemID
					&& chestID == DivineRPG.glisteningChest.itemID
					&& helmID == DivineRPG.glisteningHelmetMelee.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 0));
			}*/
			/*else if (bootID == DivineRPG.demonizedBoots.itemID
					&& legID == DivineRPG.demonizedLegs.itemID
					&& chestID == DivineRPG.demonizedChest.itemID
					&& helmID == DivineRPG.demonizedHelmetMelee.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 1));
			}*/
			/*else if (bootID == DivineRPG.tormentedBoots.itemID
					&& legID == DivineRPG.tormentedLegs.itemID
					&& chestID == DivineRPG.tormentedChest.itemID
					&& helmID == DivineRPG.tormentedHelmetMelee.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
			}*/
			/*else if (bootID == DivineRPG.glisteningBoots.itemID
					&& legID == DivineRPG.glisteningLegs.itemID
					&& chestID == DivineRPG.glisteningChest.itemID
					&& helmID == DivineRPG.glisteningHelmetArcana.itemID)
			{
				var5.fallDistance = 0;
			}*/
			/*else if (bootID == DivineRPG.demonizedBoots.itemID
					&& legID == DivineRPG.demonizedLegs.itemID
					&& chestID == DivineRPG.demonizedChest.itemID
					&& helmID == DivineRPG.demonizedHelmetArcana.itemID)
			{
				var5.fallDistance = 0;
			}*/
			/*else if (bootID == DivineRPG.tormentedBoots.itemID
					&& legID == DivineRPG.tormentedLegs.itemID
					&& chestID == DivineRPG.tormentedChest.itemID
					&& helmID == DivineRPG.tormentedHelmetArcana.itemID)
			{
				var5.fallDistance = 0;
			}
		}*/
		}
	}
}
