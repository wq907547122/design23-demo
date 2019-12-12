package com.wu.qiang.observer;

/**
 * @auth wq on 2019/12/11 14:25
 **/
public class RMBrateTest {
    public static void main(String[] args) {
        RMBrate rmBrate = new RMBrate();
        rmBrate.add(new ImportCompany());
        rmBrate.add(new ExportCompany());
        rmBrate.change(10);
        rmBrate.change(-9);
    }
}
