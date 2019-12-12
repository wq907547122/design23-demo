package com.wu.qiang.proxy.dyna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auth wq on 2019/12/9 10:17
 **/
public class DynamicProxy implements InvocationHandler {
    // 代理的对象
    private Object obj;
    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(obj, args);
        return null;
    }
}
