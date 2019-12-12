package com.wu.qiang.builder;

/**
 * 具体建造者：具体装修工人1
 * @auth wq on 2019/12/6 17:41
 **/
public class ConcreteDecorator1 extends Decorator {
    @Override
    public void buildWall() {
        parlour.setWall("w1");
    }

    @Override
    public void buildTv() {
        parlour.setTv("TV1");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sf1");
    }
}
