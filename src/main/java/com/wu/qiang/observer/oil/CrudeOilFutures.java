package com.wu.qiang.observer.oil;

/**
 * 测试油价改变对应的测试
 * @auth wq on 2019/12/11 15:32
 **/
public class CrudeOilFutures {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        oil.addObserver(new Bull());
        oil.addObserver(new Bear());

        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
