package com.wu.qiang.visitor;

/**
 * 具体元素：纸
 * @auth wq on 2019/12/12 10:01
 **/
public class Paper implements Material {
    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
