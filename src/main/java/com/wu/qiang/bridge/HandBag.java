package com.wu.qiang.bridge;

/**
 * 扩展抽象化角色：挎包
 * @auth wq on 2019/12/9 14:19
 **/
public class HandBag extends Bag {
    @Override
    public String getName() {
        return color.getColor()+"HandBag";
    }
}
