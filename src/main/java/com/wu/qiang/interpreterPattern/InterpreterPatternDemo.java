package com.wu.qiang.interpreterPattern;

/**
 * 测试解释器
 * 文法规则
 <expression> ::= <city>的<person>
 <city> ::= 韶关|广州
 <person> ::= 老人|妇女|儿童
 * @auth wq on 2019/12/12 14:38
 **/
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.freeRade("韶关的老人");
        context.freeRade("韶关的年轻人");
        context.freeRade("广州的儿童");
        context.freeRade("广州的妇女");
        context.freeRade("广州的青年");
        context.freeRade("四川的儿童");
    }
}
