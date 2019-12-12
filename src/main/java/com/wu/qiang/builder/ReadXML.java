package com.wu.qiang.builder;

import com.wu.qiang.factory.method.AbstractReadXml;

/**
 * 读取XML
 * @auth wq on 2019/12/6 17:47
 **/
public class ReadXML {
    public static Object getObject(){
        return AbstractReadXml.getObject("src/main/resources/buildConfig.xml", "com.wu.qiang.builder.");
    }
}
