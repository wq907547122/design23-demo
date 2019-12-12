package com.wu.qiang.mediator;

/**
 * @auth wq on 2019/12/11 16:18
 **/
public class DatingPlatform {
    public static void main(String[] args) {
        Medium medium = new EstateMedium(); // 房屋中介
        medium.register(new Seller("张三(卖方)"));
        medium.register(new Buyer("李四(买方)"));
    }
}
