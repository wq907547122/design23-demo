package com.wu.qiang.bridge.adapter;

/**
 * 颜色适配器
 * @auth wq on 2019/12/9 15:31
 **/
public class ColorAdapter implements Color{
    private Color color;
    public ColorAdapter(Color color){
        this.color = color;
    }
    @Override
    public String getColor() {
        return color.getColor();
    }
}
