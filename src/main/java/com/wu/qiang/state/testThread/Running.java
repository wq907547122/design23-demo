package com.wu.qiang.state.testThread;

/**
 * @auth wq on 2019/12/11 11:35
 **/
public class Running extends ThreadState {
    public Running(){
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态.");
    }
    public void suspend(ThreadContext context)
    {
        System.out.print("调用suspend()方法-->");
        if(stateName.equals(context.getState().stateName))
        {
            context.setState(new Blocked());
        }
        else
        {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }
    public void stop(ThreadContext context)
    {
        System.out.print("调用stop()方法-->");
        if(stateName.equals(context.getState().stateName))
        {
            context.setState(new Dead());
        }
        else
        {
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }
}
