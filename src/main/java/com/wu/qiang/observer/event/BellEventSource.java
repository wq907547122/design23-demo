package com.wu.qiang.observer.event;

/**
 * 目标类：事件源，铃(事件的具体处理)
 * @auth wq on 2019/12/11 14:44
 **/
public class BellEventSource extends AbstractBellEventSource {

    /**
     * 通知处理事件
     * @param sound
     */
    @Override
    public void ring(boolean sound) {
        // 转换为事件类型
        RingEvent event = new RingEvent(this, sound);
        for(BellEventListener l : listeners) {
            l.heardBell(event);
        }
    }
}
