package com.wu.qiang.bridge.adapter;

/**
 * @auth wq on 2019/12/9 15:11
 **/
public abstract class Bag {
    protected Color color;
    protected Bag(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
