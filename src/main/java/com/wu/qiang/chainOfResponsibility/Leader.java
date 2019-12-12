package com.wu.qiang.chainOfResponsibility;

/**
 * 抽象处理者：领导类
 * @auth wq on 2019/12/11 9:46
 **/
public abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    /**
     * 处理请求的方法
     * @param leaveDays : 请假的天数
     */
    public abstract void handlerRequest(int leaveDays);

    protected void myhandler(int leaveDays, int canDealDays, String name) {
        if(leaveDays <= canDealDays)
        {
            System.out.println(name + "批准您请假" + leaveDays + "天。");
        }
        else
        {
            if(getNext() != null)
            {
                getNext().handlerRequest(leaveDays);
            }
            else
            {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
