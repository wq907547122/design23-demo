package com.wu.qiang.decorator;

/**
 * 抽象装饰角色：变形
 * @auth wq on 2019/12/9 16:37
 **/
public class Changer implements Morrigan {
    Morrigan m;
    public Changer(Morrigan m) {
        this.m = m;
    }
    @Override
    public void display() {
        m.display();
    }
}
