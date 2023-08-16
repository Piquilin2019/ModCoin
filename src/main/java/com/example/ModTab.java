package com.example;

import com.example.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs {
    public ModTab(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.COIN); // Cambia esto por el ícono que deseas para tu pestaña
    }
}
