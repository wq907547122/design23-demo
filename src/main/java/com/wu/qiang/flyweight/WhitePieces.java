package com.wu.qiang.flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * 具体享元角色：白子
 * @auth wq on 2019/12/10 9:56
 **/
public class WhitePieces implements ChessPieces {
    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
