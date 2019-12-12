package com.wu.qiang.command;

/**
 * 具体命令：河粉
 * @auth wq on 2019/12/10 17:21
 **/
public class HeFen implements Breakfast{
    private HeFenChef receiver;
    public HeFen() {
        this.receiver = new HeFenChef();
    }
    @Override
    public void cooking() {
        this.receiver.cooking();
    }
}
