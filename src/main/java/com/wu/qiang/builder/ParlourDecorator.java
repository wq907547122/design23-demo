package com.wu.qiang.builder;

/**
 * @auth wq on 2019/12/6 17:49
 **/
public class ParlourDecorator {
    public static void main(String[] args) {
        try{
            Decorator d = (Decorator) ReadXML.getObject();
            ProjectManager pm = new ProjectManager(d);
            Parlour p = pm.decorator();
            p.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
