package com.wu.qiang.chainOfResponsibility;

/**
 * 具体处理者1：班主任类
 * @auth wq on 2019/12/11 9:49
 **/
public class ClassAdviser extends Leader {

    @Override
    public void handlerRequest(int leaveDays) {
        myhandler(leaveDays, 2, "班主任");
    }
}
