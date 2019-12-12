package com.wu.qiang.state.testThread;

/**
 * @auth wq on 2019/12/11 11:39
 **/
public class Dead extends ThreadState {
    public Dead()
    {
        stateName="死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
