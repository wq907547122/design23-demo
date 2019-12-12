package com.wu.qiang.adapter;

/**
 * 客户端代码:测试适配器的驱动
 * @auth wq on 2019/12/9 11:15
 **/
public class MotorAdapterTest {
    public static void main(String[] args) {
        System.out.println("适配器模式测试");
        Motor motor = (Motor) ReadAdapterXML.getObject();
        motor.driver();
    }
}
