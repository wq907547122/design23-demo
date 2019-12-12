package com.wu.qiang.command;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 接收者：馄饨厨师
 * @auth wq on 2019/12/10 17:15
 **/
public class HunTunChef extends JFrame {
    JLabel l=new JLabel();
    public HunTunChef()
    {
        super("煮馄饨");
        l.setIcon(new ImageIcon("src/main/resources/command/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
