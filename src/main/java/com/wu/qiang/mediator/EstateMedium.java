package com.wu.qiang.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者：房地产中介
 * @auth wq on 2019/12/11 16:03
 **/
public class EstateMedium implements Medium{
    List<Customer> list = new ArrayList<>();
    @Override
    public void register(Customer customer) {
        if (!list.contains(customer)) {
            list.add(customer);
            customer.setMedium(this); // 设置中介
        }
    }
    // 中介转发消息
    @Override
    public void relay(String from, String ad) {
        for(Customer c : list) {
            // 发送给除了发送的其他人
            if (!c.getName().equals(from)) {
                c.receive(from, ad);
            }
        }
    }
}
