package com.wu.qiang.strategy;

/**
 * //环境类：厨房
 * @auth wq on 2019/12/10 15:25
 **/
public class Kitchen {
    // 抽象策略
    private CrabCooking strategy;

    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }

    public CrabCooking getStrategy() {
        return strategy;
    }

    public void cookingMethod() {
        this.strategy.cookingMethod();
    }
}
