package com.wu.qiang.factory.method.animalExample;

import com.wu.qiang.factory.method.AbstractReadXml;

/**
 * @auth wq on 2019/12/6 15:30
 **/
public class ReadXML2 {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getObject()
    {
        return AbstractReadXml.getObject("src/main/resources/config2.xml",
                "com.wu.qiang.factory.method.animalExample.");
    }
}
