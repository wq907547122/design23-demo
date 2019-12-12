package com.wu.qiang.strategy;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * //具体策略类：清蒸大闸蟹
 * @auth wq on 2019/12/10 15:15
 **/
public class SteamedCrabs extends JLabel implements CrabCooking {
    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/main/resources/strategy/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
