package com.wu.qiang.observer.event;

/**
 * 具体观察者类：老师事件监听器
 * @auth wq on 2019/12/11 14:47
 **/
public class TeachEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        // 上课
        if (e.isSound()) {
            System.out.println("老师上课了...");
        }
        // 下课
        else
        {
            System.out.println("老师下课了...");
        }
    }
}
