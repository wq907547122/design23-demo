package com.wu.qiang.decorator;

/**
 * 具体装饰角色：少女
 * @auth wq on 2019/12/9 16:40
 **/
public class Girl extends Changer {
    public Girl(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }
    public void setChanger()
    {
        ((Original) super.m).setImage("Morrigan2.jpg");
    }
}
