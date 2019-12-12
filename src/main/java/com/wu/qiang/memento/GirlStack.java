package com.wu.qiang.memento;

/**
 * 管理者：美女栈
 * @auth wq on 2019/12/12 11:15
 **/
public class GirlStack {
    private Girl girl[];
    private int top;
    public GirlStack() {
        girl = new Girl[5];
        top = -1;
    }
    // 添加备忘录信息
    public boolean push(Girl p) {
        if (top >= 4) {
            System.out.println("你太花心了，变来变去的！");
            return false;
        }
        girl[++top] = p;
        return true;
    }
    // 相当于返回
    public Girl pop(){
        if (top <= 0) {
            System.out.println("美女栈空了");
            return girl[0];
        }
        else {
            return girl[top--];
        }
    }
}
