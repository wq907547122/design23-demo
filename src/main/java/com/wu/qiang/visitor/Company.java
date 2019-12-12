package com.wu.qiang.visitor;

/**
 * 抽象访问者:公司
 * @auth wq on 2019/12/12 9:59
 **/
public interface Company {
    // 公司使用纸创造出来的内容
    String create(Paper element);
    // 公司使用铜创造出来的东西
    String create(Cuprum element);
}
