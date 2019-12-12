package com.wu.qiang.state;

/**
 * 抽象状态类
 * @auth wq on 2019/12/11 10:30
 **/
public abstract class AbstractState {

    protected ScoreContext context; // 上下文
    protected String stateName; // 状态名称
    protected int score; // 分数

    public void addScore(int score) {
        this.score += score;
        System.out.print("加上："+ score +"分，\t当前分数："+ this.score );
        checkState(); // 检查状态
        System.out.println("分，\t当前状态："+ context.getState().stateName);
    }

    public abstract void checkState(); //检查当前状态
}
