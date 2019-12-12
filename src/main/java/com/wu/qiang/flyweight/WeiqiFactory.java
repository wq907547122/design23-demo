package com.wu.qiang.flyweight;

import java.util.ArrayList;

/**
 * 享元工厂角色: 创建黑子和白子的工厂
 * @auth wq on 2019/12/10 10:00
 **/
public class WeiqiFactory {
    // 存放棋子的列表
    private ArrayList<ChessPieces> qz;
    public WeiqiFactory() {
        qz = new ArrayList<>();
        qz.add(new WhitePieces());
        qz.add(new BlackPieces());
    }
    // 获取享元
    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return qz.get(0);
        } else if(type.equalsIgnoreCase("b")) {
            return qz.get(1);
        } else {
            return null;
        }
    }
}
