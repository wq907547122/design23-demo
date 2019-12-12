package com.wu.qiang.mediator;

/**
 * 抽象中介者：中介公司
 * @auth wq on 2019/12/11 15:56
 **/
public interface Medium {
    // 在中介中注册客户
    void register(Customer customer);

    /**
     * 转发消息
     * @param from
     * @param ad
     */
    void relay(String from, String ad);
}
