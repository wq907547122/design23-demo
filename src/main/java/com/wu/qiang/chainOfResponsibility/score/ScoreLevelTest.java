package com.wu.qiang.chainOfResponsibility.score;

import java.util.Arrays;
import java.util.List;

/**
 * 测试分数的等级
 * @auth wq on 2019/12/11 11:14
 **/
public class ScoreLevelTest {
    public static void main(String[] args) {
        ScoreLevel level1 = new LowerLevel();
        ScoreLevel level2 = new MiddleLevel();
        ScoreLevel level3 = new HighLevel();
        List<ScoreLevel> list = Arrays.asList(level1, level2, level3);
        for(int i = 0; i < list.size() - 1; i++) {
            list.get(i).setNext(list.get(i + 1));
        }
        list.get(0).handlerScore(101);
    }
}
