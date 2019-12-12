package com.wu.qiang.builder;

/**
 * 指挥者：项目经理
 * @auth wq on 2019/12/6 17:44
 **/
public class ProjectManager {

    private Decorator builder;
    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Parlour decorator() {
        builder.buildWall();
        builder.buildTv();
        builder.buildSofa();
        return builder.getResult();
    }
}
