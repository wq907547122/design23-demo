package com.wu.qiang.abstractFactory.farm;

import com.wu.qiang.abstractFactory.animal.Animal;
import com.wu.qiang.abstractFactory.plant.Plant;

/**
 * 抽象工厂：农场类
 * @auth wq on 2019/12/6 16:41
 **/
public interface Farm {
    // 创建动物的接口
    Animal newAnimal();
    // 创建植物的接口
    Plant newPlant();
}
