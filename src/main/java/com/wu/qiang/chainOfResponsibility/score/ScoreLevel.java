package com.wu.qiang.chainOfResponsibility.score;

/**
 * 抽象处理
 * @auth wq on 2019/12/11 11:00
 **/
public abstract class ScoreLevel {
    private ScoreLevel next;

    public ScoreLevel getNext() {
        return next;
    }

    public void setNext(ScoreLevel next) {
        this.next = next;
    }

    /**
     * 处理分数
     * @param score
     */
    public abstract void handlerScore(int score);

    protected void myHandler(int score, int levelScore, String msg) {
        if (score >= levelScore){
            if (this.getNext() != null) {
                this.getNext().handlerScore(score);
            } else {
                System.out.println("你的分数范围异常，不能评等级");
            }
        } else {
            System.out.println("当前得分:"+ score+"分，\t当前状态："+ msg);
        }
    }
}
