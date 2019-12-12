package com.wu.qiang.command;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 接收者：肠粉厨师
 * @auth wq on 2019/12/10 17:10
 **/
public class ChangFenChef extends JFrame {
    JLabel l=new JLabel();
    public ChangFenChef()
    {
        super("煮肠粉");
        l.setIcon(new ImageIcon("src/main/resources/command/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
