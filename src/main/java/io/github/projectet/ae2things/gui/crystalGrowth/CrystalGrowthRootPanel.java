package io.github.projectet.ae2things.gui.crystalGrowth;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

import appeng.client.gui.implementations.UpgradeableScreen;
import appeng.client.gui.style.ScreenStyle;

public class CrystalGrowthRootPanel extends UpgradeableScreen<CrystalGrowthMenu> {

    public CrystalGrowthRootPanel(CrystalGrowthMenu menu, Inventory playerInventory, Component title,
            ScreenStyle style) {
        super(menu, playerInventory, title, style);
    }
}
