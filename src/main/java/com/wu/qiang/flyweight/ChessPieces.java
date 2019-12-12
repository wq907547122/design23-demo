package com.wu.qiang.flyweight;

import java.awt.Graphics;
import java.awt.Point;

/**
 * 抽象享元角色：棋子
 * @auth wq on 2019/12/10 9:55
 **/
public interface ChessPieces {
    void DownPieces(Graphics g, Point pt);    //下子
}
