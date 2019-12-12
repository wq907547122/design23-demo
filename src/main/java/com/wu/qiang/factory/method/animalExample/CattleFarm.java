package com.wu.qiang.factory.method.animalExample;

/**
 * @auth wq on 2019/12/6 16:06
 **/
//具体工厂：养牛场
public class CattleFarm implements AnimalFarm
{
    public Animal newAnimal()
    {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}
