package com.wu.qiang.observer.event;

/**
 * @auth wq on 2019/12/11 14:50
 **/
public class BellEventTest {
    public static void main(String[] args) {
        BellEventSource source = new BellEventSource();
        source.add(new TeachEventListener());
        source.add(new StuEventListener());

        source.ring(true); // 上课
        System.out.println("------------");
        System.out.println("------------");
        source.ring(false); // 下课
    }
}
