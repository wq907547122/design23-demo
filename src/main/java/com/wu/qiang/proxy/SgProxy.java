package com.wu.qiang.proxy;

/**
 * 代理： 韶关代理
 * @auth wq on 2019/12/9 9:56
 **/
public class SgProxy implements Specialty{

    private WySpecialty realSubject = new WySpecialty();

    @Override
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest(){
        System.out.println("韶关代理婺源特产开始。");
    }
    public void postRequest() {
        System.out.println("韶关代理婺源特产结束。");
    }
}
