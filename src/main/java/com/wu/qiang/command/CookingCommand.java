package com.wu.qiang.command;

/**
 * @auth wq on 2019/12/10 17:28
 **/
public class CookingCommand {
    public static void main(String[] args) {
        Breakfast food1=new ChangFen();
        Breakfast food2=new HunTun();
        Breakfast food3=new HeFen();
        Waiter waiter = new Waiter();
        waiter.setChangFen(food1);
        waiter.setHunTun(food2);
        waiter.setHeFen(food3);

        waiter.chooseChangFen();
        waiter.chooseHeFen();
        waiter.chooseHunTun();
    }
}
