package com.wu.qiang.composite;

import java.util.ArrayList;

/**
 * 树枝构件：袋子
 * @auth wq on 2019/12/10 11:36
 **/
public class Bags implements Articles{
    private String name;     //名字
    private int level; // 级
    private ArrayList<Articles> bags=new ArrayList<Articles>();
    public Bags(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i){
        return bags.get(i);
    }


    @Override
    public float calculation() {
        float s = 0;
        for(Articles art : bags) {
            s += art.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        System.out.println(getInfoName());
        for (Articles art : bags) {
            art.show();
        }
    }

    private String getInfoName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= level; i++) {
            sb.append("  ");
        }
        sb.append("+ 包装袋(")
                .append(name)
                .append(")的商品：");
        return sb.toString();
    }
}
