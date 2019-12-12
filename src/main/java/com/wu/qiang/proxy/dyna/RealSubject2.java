package com.wu.qiang.proxy.dyna;

/**
 * @auth wq on 2019/12/9 10:13
 **/
public class RealSubject2 implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题02，我的类型=RealSubject2,不一样的风格呵呵");
    }
}
