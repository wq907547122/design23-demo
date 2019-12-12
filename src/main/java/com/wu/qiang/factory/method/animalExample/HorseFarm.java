package com.wu.qiang.factory.method.animalExample;

/**
 * @auth wq on 2019/12/6 16:05
 **/
//具体工厂：养马场
public class HorseFarm implements AnimalFarm
{
    public Animal newAnimal()
    {
        System.out.println("新马出生！");
        return new Horse();
    }
}

