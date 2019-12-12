package com.wu.qiang.memento;

/**
 * 发起人：您
 * @auth wq on 2019/12/12 11:10
 **/
public class You {
    private String wifeName; // 妻子

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }
    // 创建备忘录
    public Girl createMemento(){
        return new Girl(wifeName);
    }
    // 返回到某一个妻子的名称
    public void restoreMemento(Girl p) {
        setWifeName(p.getName());
    }
}
