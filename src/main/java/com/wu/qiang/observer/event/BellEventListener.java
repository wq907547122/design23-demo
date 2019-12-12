package com.wu.qiang.observer.event;

import java.util.EventListener;

/**
 * 抽象观察者类：铃声事件监听器
 * @auth wq on 2019/12/11 14:37
 **/
public interface BellEventListener extends EventListener {
    // 事件处理方法，听到铃声
    void heardBell(RingEvent e);
}
