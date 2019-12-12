package com.wu.qiang.iterator;

/**
 * 婺源景点类
 * @auth wq on 2019/12/11 16:53
 **/
public class WyViewSpot {
    // 景点名称
    private String name;
    // 景点介绍
    private String introduce;
    public WyViewSpot(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
