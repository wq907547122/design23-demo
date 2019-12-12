package com.wu.qiang.abstractFactory.utils;

import com.wu.qiang.factory.method.AbstractReadXml;

/**
 * @auth wq on 2019/12/6 16:46
 **/
public class ReadXML {
    public static Object getObject(){
        return AbstractReadXml.getObject("src/main/resources/config.xml", "com.wu.qiang.abstractFactory.farm.");
    }
}
