package com.wu.qiang.abstractFactory.farm;

import com.wu.qiang.abstractFactory.animal.Animal;
import com.wu.qiang.abstractFactory.animal.Cattle;
import com.wu.qiang.abstractFactory.plant.Plant;
import com.wu.qiang.abstractFactory.plant.Vegetables;

/**
 * 具体工厂：韶关农场类
 * @auth wq on 2019/12/6 16:43
 **/
public class SGfarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
