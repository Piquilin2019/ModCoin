package com.example;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = CoinAndy.MODID, name = CoinAndy.NAME, version = CoinAndy.VERSION)

public class CoinAndy {
	public static final String MODID = "coin";
	public static final String NAME = "Coin Andy";
	public static final String VERSION = "1.0";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@Mod.Instance
	public static CoinAndy instance;

	public static final CreativeTabs CREATIVE_TAB = new ModTab(MODID);

	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		MinecraftForge.EVENT_BUS.register(this);
		


	}
}
