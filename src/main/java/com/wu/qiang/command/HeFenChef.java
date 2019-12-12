package com.wu.qiang.command;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @auth wq on 2019/12/10 17:19
 **/
public class HeFenChef extends JFrame {

    JLabel l=new JLabel();
    public HeFenChef()
    {
        super("煮河粉");
        l.setIcon(new ImageIcon("src/main/resources/command/HeFen.jpg"));
        this.add(l);
        this.setLocation(200, 280);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
