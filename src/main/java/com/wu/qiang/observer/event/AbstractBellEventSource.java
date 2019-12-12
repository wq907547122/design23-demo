package com.wu.qiang.observer.event;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标类：事件源，铃(抽象类)
 * @auth wq on 2019/12/11 14:39
 **/
public abstract class AbstractBellEventSource {
    protected List<BellEventListener> listeners; //监听器容器
    public AbstractBellEventSource()
    {
        listeners=new ArrayList<>();
    }
    public void add(BellEventListener listener) {
        listeners.add(listener);
    }
    public void remove(BellEventListener listener) {
        listeners.remove(listener);
    }

    public abstract void ring(boolean sound);
}
