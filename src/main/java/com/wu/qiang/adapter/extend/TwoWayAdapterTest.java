package com.wu.qiang.adapter.extend;

/**
 * 客户端代码
 * @auth wq on 2019/12/9 11:35
 **/
public class TwoWayAdapterTest {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee twoWayAdaptee = new AdapteeRealize();
        TwoWayTarget target = new TwoWayAdapter(twoWayAdaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target = new TargetRealize();
        twoWayAdaptee = new TwoWayAdapter(target);
        twoWayAdaptee.specificRequest();
    }
}
