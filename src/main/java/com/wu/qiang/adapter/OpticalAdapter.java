package com.wu.qiang.adapter;

/**
 * 光能适配器
 * @auth wq on 2019/12/9 11:12
 **/
public class OpticalAdapter implements Motor {
    private OpticalMotor omotor;

    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }

    @Override
    public void driver() {
        omotor.opticalDrive();
    }
}
