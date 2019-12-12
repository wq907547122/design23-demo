package com.wu.qiang.proxy;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 真实主题，需要被代理的对象
 * @auth wq on 2019/12/9 9:51
 **/
public class WySpecialty extends JFrame implements Specialty {
    public WySpecialty() {
        super("韶关代理婺源特产测试");
        JLabel l1=new JLabel(new ImageIcon("src/main/resources/WuyuanSpecialty.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void display() {
        this.setVisible(true);
    }

}
