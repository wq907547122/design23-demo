package com.wu.qiang.adapter;

/**
 * 电能适配器
 * @auth wq on 2019/12/9 11:10
 **/
public class ElectricAdapter implements Motor {
    private ElectricMotor emotor;
    public ElectricAdapter() {
        this.emotor = new ElectricMotor();
    }
    @Override
    public void driver() {
        emotor.electricDriver();
    }
}
