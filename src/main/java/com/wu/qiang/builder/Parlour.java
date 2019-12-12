package com.wu.qiang.builder;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

/**
 * 产品：客厅
 * @auth wq on 2019/12/6 17:28
 **/
public class Parlour {
    // 墙、电视和沙发等组成部分
    private String wall; // 墙
    private String tv; // 电视
    private String sofa; // 沙发

    public void setWall(String wall) {
        this.wall = wall;
    }
    public void setTv(String tv) {
        this.tv = tv;
    }
    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show() {
        JFrame jf=new JFrame("建造者模式测试");
        Container contentPane=jf.getContentPane();
        JPanel p=new JPanel();
        JScrollPane sp=new JScrollPane(p);
        String parlour=wall+tv+sofa;
        JLabel l=new JLabel(new ImageIcon("src/main/resources/"+parlour+".png"));
        p.setLayout(new GridLayout(1,1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
