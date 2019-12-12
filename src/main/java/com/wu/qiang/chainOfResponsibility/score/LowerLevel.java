package com.wu.qiang.chainOfResponsibility.score;

/**
 * 不及格
 * @auth wq on 2019/12/11 11:02
 **/
public class LowerLevel extends ScoreLevel {
    @Override
    public void handlerScore(int score) {
        myHandler(score, 60, "不及格");
    }
}
