package com.wu.qiang.chainOfResponsibility.score;

/**
 * 高等,最后一个处理的，不用指定下一个，如何还需要添加下一个
 * @auth wq on 2019/12/11 11:10
 **/
public class HighLevel extends ScoreLevel {
    @Override
    public void handlerScore(int score) {
        myHandler(score, 101, "高等");
    }
}
