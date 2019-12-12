package com.wu.qiang.chainOfResponsibility.score;

/**
 * @auth wq on 2019/12/11 11:08
 **/
public class MiddleLevel extends ScoreLevel {
    @Override
    public void handlerScore(int score) {
        myHandler(score, 90, "中等");
    }
}
