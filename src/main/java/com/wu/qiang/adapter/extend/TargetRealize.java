package com.wu.qiang.adapter.extend;

/**
 * @auth wq on 2019/12/9 11:31
 **/
public class TargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
