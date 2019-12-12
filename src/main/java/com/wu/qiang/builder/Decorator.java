package com.wu.qiang.builder;

/**
 * 抽象建造者：装修工人
 * @auth wq on 2019/12/6 17:36
 **/
public abstract class Decorator {
    //创建产品对象
    protected Parlour parlour = new Parlour();
    public abstract void buildWall();
    public abstract void buildTv();
    public abstract void buildSofa();
    //返回产品对象
    public Parlour getResult() {
        return parlour;
    }
}

