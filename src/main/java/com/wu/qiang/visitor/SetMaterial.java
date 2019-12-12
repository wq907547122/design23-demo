package com.wu.qiang.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色:材料集
 * @auth wq on 2019/12/12 10:06
 **/
public class SetMaterial {
    private List<Material> list = new ArrayList<>();

    // 返回这个公司创建的所有产品的字符串的相加
    public String accept(Company visitor){
        StringBuilder sb = new StringBuilder();
        Iterator<Material> iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().accept(visitor)).append(" ");
        }
//        for(Material m : list) {
//            sb.append(m.accept(visitor));
//        }
        return sb.toString(); // 返回某公司的作品集
    }

    public void add(Material element){
        list.add(element);
    }

    public void remove(Material element) {
        list.remove(element);
    }
}
