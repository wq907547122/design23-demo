package com.wu.qiang.adapter;

import com.wu.qiang.factory.method.AbstractReadXml;

/**
 * @auth wq on 2019/12/9 11:14
 **/
public class ReadAdapterXML {
    public static Object getObject(){
        return AbstractReadXml.getObject("src/main/resources/adapter-config.xml", "com.wu.qiang.adapter.");
    }
}
