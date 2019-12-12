package com.wu.qiang.visitor;

/**
 * 抽象元素：材料
 * @auth wq on 2019/12/12 9:59
 **/
public interface Material {
    String accept(Company visitor);
}
