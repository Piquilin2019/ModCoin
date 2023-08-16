package com.example;

import com.example.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CoinAndy.MODID)
public class RegistrationHandler {
    @SubscribeEvent
    public  static  void registerItem(Register<Item> event){
        final Item[] items = {
                new Item().setRegistryName(CoinAndy.MODID, "coin").setTranslationKey(CoinAndy.MODID + "." + "coin").setCreativeTab(CreativeTabs.MISC)
        };
        event.getRegistry().registerAll(items);
    }
    public static void initModels() {
        ModelLoader.setCustomModelResourceLocation(ModItems.COIN, 0, new ModelResourceLocation(CoinAndy.MODID + ":coin", "inventory"));
    }
}