package com.wu.qiang.bridge;

/**
 * 扩展抽象化角色：钱包
 * @auth wq on 2019/12/9 14:20
 **/
public class Wallet extends Bag {
    @Override
    public String getName() {
        return color.getColor()+"Wallet";
    }
}
