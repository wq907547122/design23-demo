package com.wu.qiang.observer.oil;

import java.util.Observable;

/**
 * 具体目标类：原油期货
 * @auth wq on 2019/12/11 15:19
 **/
public class OilFutures extends Observable {
    private double price;

    public double getPrice() {
        return price;
    }
    // 改变会触发对应的观察事件
    public void setPrice(double price) {
        super.setChanged(); //设置内部标志位，注明数据发生变化
        notifyObservers(price); // 通知观察者价格改变了
        this.price = price;
    }


}
