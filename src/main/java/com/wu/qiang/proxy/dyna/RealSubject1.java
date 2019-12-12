package com.wu.qiang.proxy.dyna;

/**
 * 真实主题1
 * @auth wq on 2019/12/9 10:12
 **/
public class RealSubject1 implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题01，我的类型=RealSubject1");
    }
}
