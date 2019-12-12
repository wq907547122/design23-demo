package com.wu.qiang.bridge;

/**
 * 抽象化角色：包
 * @auth wq on 2019/12/9 14:17
 **/
public abstract class Bag {
    protected Color color;
    public void setColor(Color color)
    {
        this.color=color;
    }
    public abstract String getName();
}
