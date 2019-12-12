package com.wu.qiang.observer.oil;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者类：多方
 * @auth wq on 2019/12/11 15:24
 **/
public class Bull implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg == null || !(arg instanceof Double)) {
            return;
        }
        double price = (double)arg;
        // 油价上涨
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了");
        }
        // 油价下跌
        else if (price < 0) {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了");
        }
    }
}
