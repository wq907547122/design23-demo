package com.wu.qiang.chainOfResponsibility;

/**
 * 具体处理者3：院长类
 * @auth wq on 2019/12/11 9:55
 **/
public class Dean extends Leader{
    @Override
    public void handlerRequest(int leaveDays) {
        myhandler(leaveDays, 10, "院长");
    }
}
