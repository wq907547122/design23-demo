package com.wu.qiang.chainOfResponsibility;

/**
 * 具体处理者4：教务处长类
 * @auth wq on 2019/12/11 9:56
 **/
public class DeanOfStudies extends Leader{
    @Override
    public void handlerRequest(int leaveDays) {
        myhandler(leaveDays, 20, "教务处长");
    }
}
