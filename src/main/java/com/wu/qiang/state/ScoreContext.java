package com.wu.qiang.state;

/**
 * 环境类
 * @auth wq on 2019/12/11 10:31
 **/
public class ScoreContext {
    private AbstractState state;
    public ScoreContext() {
        this.state = new LowState(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void add(int score){
        this.state.addScore(score);
    }
}
