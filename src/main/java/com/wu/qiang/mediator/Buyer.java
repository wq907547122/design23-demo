package com.wu.qiang.mediator;

/**
 * 具体同事类：买方
 * @auth wq on 2019/12/11 16:12
 **/
public class Buyer extends Customer {
    public Buyer(String name) {
        super(name);
        ClientWindow(350, 100);
    }

    @Override
    public void send(String ad) {
        ReceiveArea.append("我(买方)说: "+ad+"\n");
        //使滚动条滚动到最底端
        toBottom();
        medium.relay(this.name, ad);
    }

    @Override
    public void receive(String from, String ad) {
        ReceiveArea.append(from +"说: "+ad+"\n");
        //使滚动条滚动到最底端
        toBottom();
    }
}
