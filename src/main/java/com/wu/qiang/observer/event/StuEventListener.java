package com.wu.qiang.observer.event;

/**
 * 具体观察者类：学生事件监听器
 * @auth wq on 2019/12/11 14:48
 **/
public class StuEventListener implements BellEventListener {

    @Override
    public void heardBell(RingEvent e) {
        // 上课
        if (e.isSound()) {
            System.out.println("学生上课了...");
        }
        // 下课
        else {
            System.out.println("学生下课了");
        }
    }
}
