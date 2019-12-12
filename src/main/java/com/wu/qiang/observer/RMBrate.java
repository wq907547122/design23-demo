package com.wu.qiang.observer;

/**
 * 具体目标：人民币汇率
 * @auth wq on 2019/12/11 14:18
 **/
public class RMBrate extends Rate {

    // 具体的目标改变，通知观察者做改变
    @Override
    public void change(int number) {
        for (Company company : companies) {
            company.response(number);
        }
    }
}
