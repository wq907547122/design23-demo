package com.wu.qiang.memento;

/**
 * 备忘录：美女
 * 需要保存的实体对象
 * @auth wq on 2019/12/12 11:09
 **/
public class Girl {
    // 名称
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
