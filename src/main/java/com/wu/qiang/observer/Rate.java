package com.wu.qiang.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标主题：汇率
 * @auth wq on 2019/12/11 14:13
 **/
public abstract class Rate {
    // 保存所有的观察者
    protected List<Company> companies = new ArrayList<>();
    // 新增观察者
    public void add(Company company) {
        companies.add(company);
    }
    public void remove(Company company){
        companies.remove(company);
    }
    // 汇率改变的事件
    public abstract void change(int number);
}
