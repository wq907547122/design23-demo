package com.wu.qiang.adapter.extend;

/**
 * 适配者实现
 * @auth wq on 2019/12/9 11:32
 **/
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
