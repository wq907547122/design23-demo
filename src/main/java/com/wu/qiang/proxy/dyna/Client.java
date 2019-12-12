package com.wu.qiang.proxy.dyna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @auth wq on 2019/12/9 10:19
 **/
public class Client {
    public static void main(String[] args) {
        // 代理的主题
        AbstractSubject subject = null;
        InvocationHandler handler = null;
        handler = new DynamicProxy(new RealSubject2());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, handler);
        subject.request();
    }
}
