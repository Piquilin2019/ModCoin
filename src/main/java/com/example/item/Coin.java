package com.example.item;

import com.example.CoinAndy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class Coin extends Item {

    public Coin() {

        setRegistryName(CoinAndy.MODID, "coin");
        setTranslationKey(CoinAndy.MODID  + ".coin");
        setCreativeTab(CreativeTabs.MISC);
    }

}