package com.wu.qiang.bridge.adapter;

/**
 * 黄色
 * 桥接：扩展实现化
 * 适配：适配者
 * @auth wq on 2019/12/9 14:57
 **/
public class Yellow implements Color {
    @Override
    public String getColor() {
        return "yellow";
    }
}
