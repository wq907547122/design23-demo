package com.wu.qiang.chainOfResponsibility;

/**
 * 具体处理者2：系主任类
 * @auth wq on 2019/12/11 9:54
 **/
public class DepartmentHead extends Leader {
    @Override
    public void handlerRequest(int leaveDays) {
        myhandler(leaveDays, 7, "系主任");
    }
}
