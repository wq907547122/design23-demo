package com.wu.qiang.interpreterPattern;

/**
 * 非终结符表达式类
 * @auth wq on 2019/12/12 14:25
 **/
public class AndExpression implements Expression {
    private Expression city=null;
    private Expression person=null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] ss = info.split("的");
        return city.interpret(ss[0]) && person.interpret(ss[1]);
    }
}
