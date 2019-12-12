package com.wu.qiang.abstractFactory;

import com.wu.qiang.abstractFactory.animal.Animal;
import com.wu.qiang.abstractFactory.farm.Farm;
import com.wu.qiang.abstractFactory.plant.Plant;
import com.wu.qiang.abstractFactory.utils.ReadXML;

/**
 * @auth wq on 2019/12/6 16:50
 **/
public class FarmTest {
    public static void main(String[] args) {
        try {
            Farm farm = (Farm) ReadXML.getObject();
            Animal animal = farm.newAnimal();
            Plant plant = farm.newPlant();
            animal.show();
            plant.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
