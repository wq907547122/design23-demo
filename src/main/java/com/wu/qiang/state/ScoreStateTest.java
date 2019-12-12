package com.wu.qiang.state;

/**
 * @auth wq on 2019/12/11 10:54
 **/
public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext scoreContext = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        scoreContext.add(30);
        scoreContext.add(40);
        scoreContext.add(25);
        scoreContext.add(-15);
        scoreContext.add(-25);
    }
}
