package com.wu.qiang.decorator;

/**
 * 具体装饰角色：女妖
 * @auth wq on 2019/12/9 16:38
 **/
public class Succubus extends Changer {
    public Succubus(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((Original)super.m).setImage("Morrigan1.jpg");
    }
}
