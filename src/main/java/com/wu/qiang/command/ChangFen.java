package com.wu.qiang.command;

/**
 * 具体命令：肠粉
 * @auth wq on 2019/12/10 17:09
 **/
public class ChangFen implements Breakfast{
    // 接收者
    private ChangFenChef recever;

    public ChangFen() {
        this.recever = new ChangFenChef();
    }

    @Override
    public void cooking() {
        recever.cooking();
    }
}
