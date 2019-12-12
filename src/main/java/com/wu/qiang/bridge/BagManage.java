package com.wu.qiang.bridge;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

/**
 * @auth wq on 2019/12/9 14:24
 **/
public class BagManage {
    public static void main(String[] args) {
        Color color = null;
        Bag bag = null;
        color = (Color) ReadBridgeXml.getObject("color");
        bag = (Bag) ReadBridgeXml.getObject("bag");
        bag.setColor(color);
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
