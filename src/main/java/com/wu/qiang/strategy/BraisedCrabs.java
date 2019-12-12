package com.wu.qiang.strategy;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * //具体策略类：红烧大闸蟹
 * @auth wq on 2019/12/10 15:20
 **/
public class BraisedCrabs extends JLabel implements CrabCooking{
    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/main/resources/strategy/BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
