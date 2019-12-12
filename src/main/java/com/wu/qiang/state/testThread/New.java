package com.wu.qiang.state.testThread;

/**
 * 具体状态类：新建状态
 * @auth wq on 2019/12/11 11:26
 **/
public class New extends ThreadState{
    public New()
    {
        stateName="新建状态";
        System.out.println("当前线程处于：新建状态.");
    }

    public void start(ThreadContext context){
        System.out.print("调用start()方法-->");
        if (stateName.equals(context.getState().stateName)) {
            context.setState(new Runnable());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}
