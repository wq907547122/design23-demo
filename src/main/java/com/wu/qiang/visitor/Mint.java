package com.wu.qiang.visitor;

/**
 * 具体访问者：造币公司
 * @auth wq on 2019/12/12 10:16
 **/
public class Mint implements Company {
    @Override
    public String create(Paper element) {
        return "纸币";
    }

    @Override
    public String create(Cuprum element) {
        return "铜币";
    }
}
