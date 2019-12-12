package com.wu.qiang.state.testThread;

/**
 * @auth wq on 2019/12/11 13:38
 **/
public class ThreadStateTest {
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
