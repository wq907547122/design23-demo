package com.wu.qiang.bridge.adapter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

/**
 * @auth wq on 2019/12/9 15:18
 **/
public class BagManage {
    public static void main(String[] args) {
        // 适配模式：获取 适配器,颜色适配器，根据传递的颜色，确定具体调用那种颜色
        Color color = new ColorAdapter(new Red());
//        Bag bag = new HandBag(color);
        // 桥接模式： 获取  抽象化角色，并且使用这个适配器来创建对象或者做一个set方法，这里使用的是构造函数
        // Bag bag = new Wallet(color);
        Bag bag = new BagAdapter(color, BagAdapter.BagEnum.HandBag);
        // 使用桥接模式的 抽象化接口
        show(bag.getName());
    }
    public static void show(String name)
    {
        JFrame jf=new JFrame("桥接模式测试");
        Container contentPane=jf.getContentPane();
        JPanel p=new JPanel();
        JLabel l=new JLabel(new ImageIcon("src/main/resources/bridge/"+name+".jpg"));
        p.setLayout(new GridLayout(1,1));
        p.setBorder(BorderFactory.createTitledBorder("女士皮包"));
        p.add(l);
        contentPane.add(p, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
