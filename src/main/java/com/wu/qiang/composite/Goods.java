package com.wu.qiang.composite;

/**
 * 树叶构件：商品
 * @auth wq on 2019/12/10 11:27
 **/
public class Goods implements Articles {
    private String name; // 名字
    private int quantity; // 数量
    private float unitiPrice; // 单价
    public Goods(String name, int quantity, float unitiPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitiPrice = unitiPrice;
    }
    @Override
    public float calculation() {
        return quantity * unitiPrice;
    }

    @Override
    public void show() {
        System.out.println(getGoodsInfos());
    }

    private String getGoodsInfos() {
        return  new StringBuilder()
                .append("        ")
                .append(name)
                .append("(数量：")
                .append(this.quantity)
                .append("，单价:")
                .append(this.unitiPrice)
                .append("元)").toString();
    }
}
