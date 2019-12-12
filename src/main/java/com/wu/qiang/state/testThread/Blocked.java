package com.wu.qiang.state.testThread;

/**
 * @auth wq on 2019/12/11 11:37
 **/
public class Blocked extends ThreadState {
    public Blocked() {
        stateName="阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }
    public void resume(ThreadContext context)
    {
        System.out.print("调用resume()方法-->");
        if(stateName.equals(context.getState().stateName))
        {
            context.setState(new Runnable());
        }
        else
        {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}
