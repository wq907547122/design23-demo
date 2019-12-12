package com.wu.qiang.command;

/**
 * 具体命令：馄饨
 * @auth wq on 2019/12/10 17:16
 **/
public class HunTun implements Breakfast {

    public HunTunChef receiver;
    public HunTun() {
        this.receiver = new HunTunChef();
    }

    @Override
    public void cooking() {
        this.receiver.cooking();
    }
}
