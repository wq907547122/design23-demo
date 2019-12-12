package com.wu.qiang.interpreterPattern;

/**
 * 环境类:使用这些语法的环境，就是乘坐韶关的公交车的刷卡程序
 * @auth wq on 2019/12/12 14:28
 **/
public class Context {
    private String citys[] = {"韶关", "广州"};
    private String persions[] = {"老人", "妇女", "儿童"};

    private Expression cityPerson;

    public Context() {
        cityPerson = new AndExpression(new TerminalExpression(citys), new TerminalExpression(persions));
    }

    /**
     * 判断是否免费
     * @param info xx城市的xx人
     * @return
     */
    public boolean freeRade(String info) {
        // 如果是
        boolean flag = cityPerson.interpret(info);
        if(flag) {
            System.out.println("您是" + info + ",您本次乘车免费");
        } else {
            System.out.println(info+"，您不是免费人员，本次乘车扣费2元！");
        }
        return false;
    }
}
