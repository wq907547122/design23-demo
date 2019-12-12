package com.wu.qiang.abstractFactory.farm;

import com.wu.qiang.abstractFactory.animal.Animal;
import com.wu.qiang.abstractFactory.animal.Horse;
import com.wu.qiang.abstractFactory.plant.Fruitage;
import com.wu.qiang.abstractFactory.plant.Plant;

/**
 * 具体工厂：上饶农场类
 * @auth wq on 2019/12/6 16:44
 **/
public class SRfarm implements Farm{

    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}
