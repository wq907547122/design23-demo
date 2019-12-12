package com.wu.qiang.mediator;

/**
 * 具体同事类：卖方
 * @auth wq on 2019/12/11 16:07
 **/
public class Seller extends Customer{

    public Seller(String name) {
        super(name);
        ClientWindow(50,100);
    }
    // 发送消息，具体由中介发送给其他的用户
    @Override
    public void send(String ad) {
        ReceiveArea.append("我(卖方)说: "+ad+"\n");
        //使滚动条滚动到最底端
        toBottom();
        this.medium.relay(this.name, ad);
    }
    // 接收到消息，就展示
    @Override
    public void receive(String from, String ad) {
        ReceiveArea.append(from + "说: "+ad+"\n");
        //使滚动条滚动到最底端
        toBottom();
    }
}
