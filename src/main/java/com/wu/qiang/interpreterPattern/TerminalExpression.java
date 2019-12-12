package com.wu.qiang.interpreterPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式类
 * @auth wq on 2019/12/12 14:22
 **/
public class TerminalExpression implements Expression {
    private Set<String> set= new HashSet<>();

    public TerminalExpression(String[] data) {
        for(String s : data) {
            set.add(s);
        }
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
