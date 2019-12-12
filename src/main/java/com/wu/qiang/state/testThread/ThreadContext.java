package com.wu.qiang.state.testThread;

/**
 * 环境类
 * @auth wq on 2019/12/11 11:23
 **/
public class ThreadContext {
    private ThreadState state;
    public ThreadContext() {
        this.state = new New();
    }

    public ThreadState getState() {
        return state;
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public void start() {
        if (state instanceof New) {
            ((New)state).start(this);
        }
    }

    public void getCPU() {
        if (state instanceof Runnable) {
            ((Runnable)state).getCPU(this);
        }
    }

    public void suspend() {
        if (state instanceof Running) {
            ((Running)state).suspend(this);
        }
    }

    public void stop() {
        if (state instanceof Running) {
            ((Running)state).stop(this);
        }
    }

    public void resume() {
        if (state instanceof Blocked) {
            ((Blocked)state).resume(this);
        }
    }

}
