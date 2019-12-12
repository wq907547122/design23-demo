package com.wu.qiang.bridge.adapter;

/**
 * @auth wq on 2019/12/9 15:34
 **/
public class BagAdapter extends Bag{
    private BagEnum name;
    public BagAdapter(Color color, BagEnum name) {
        super(color);
        this.name = name;
    }
    @Override
    public String getName() {
        return color.getColor() + name.toString();
    }

    public enum BagEnum{
        Wallet,
        HandBag
    }
}
