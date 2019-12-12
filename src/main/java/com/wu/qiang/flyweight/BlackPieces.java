package com.wu.qiang.flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * 具体享元角色：黑子
 * @auth wq on 2019/12/10 9:58
 **/
public class BlackPieces implements ChessPieces{
    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
