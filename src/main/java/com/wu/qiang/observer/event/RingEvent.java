package com.wu.qiang.observer.event;

import java.util.EventObject;

/**
 * 铃声事件类：用于封装事件源及一些与事件相关的参数
 * @auth wq on 2019/12/11 14:34
 **/
public class RingEvent extends EventObject{

    private boolean sound; // true表示上课铃声,false表示下课铃声

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
