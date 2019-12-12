package com.wu.qiang.composite;

/**
 * 抽象构件：物品
 * @auth wq on 2019/12/10 11:25
 **/
public interface Articles {
    float calculation(); //计算
    void show(); // 打印显示对应的商品，数量、单价等信息
}
