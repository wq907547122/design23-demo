package com.wu.qiang.builder;

/**
 * 具体建造者：具体装修工人2
 * @auth wq on 2019/12/6 17:42
 **/
public class ConcreteDecorator2 extends Decorator{
    @Override
    public void buildWall() {
        parlour.setWall("w2");
    }

    @Override
    public void buildTv() {
        parlour.setWall("TV2");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sf2");
    }
}
