package com.wu.qiang.adapter.extend;

/**
 * 双向适配器
 * @auth wq on 2019/12/9 11:33
 **/
public class TwoWayAdapter implements TwoWayAdaptee, TwoWayTarget {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;
    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }
    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
