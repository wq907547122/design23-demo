package com.wu.qiang.bridge.adapter;

/**
 * 红色
 * 桥接：扩展实现化
 * 适配：适配者
 * @auth wq on 2019/12/9 14:55
 **/
public class Red implements Color {
    @Override
    public String getColor() {
        return "red";
    }
}

