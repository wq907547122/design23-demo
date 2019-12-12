package com.wu.qiang.composite;


/**
 * @auth wq on 2019/12/10 13:34
 **/
public class ShoppingTest {
    public static void main(String[] args) {

        Bags bigBag = getBigs();
        Bags mediumBag = getMediumBag();
        Bags smallRedBag = getSmallRedBag();
        Bags smallWhiteBag = getSmallWhiteBag();
        mediumBag.add(smallRedBag);
        bigBag.add(new Goods("李宁牌运动鞋",1,198));
        mediumBag.add(new Goods("景德镇瓷器",1,380));
        bigBag.add(smallWhiteBag);
        bigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        bigBag.show();
        System.out.println("要支付的总价是：" + bigBag.calculation() + "元");

    }
    // 获取大袋子
    private static Bags getBigs() {
        return new Bags("大袋子", 0);
    }
    // 获取中袋子
    private static Bags getMediumBag() {
        return new Bags("中袋子", 1);
    }

    private static Bags getSmallRedBag() {
        Bags result = new Bags("红色小袋子", 2);
        result.add(new Goods("婺源特产",2,7.9f));
        result.add(new Goods("婺源地图",1,9.9f));
        return result;
    }
    private static Bags getSmallWhiteBag() {
        Bags result = new Bags("白色小袋子", 1);
        result.add(new Goods("韶关香菇",2,68));
        result.add(new Goods("韶关红茶",3,180));
        return result;
    }
}
