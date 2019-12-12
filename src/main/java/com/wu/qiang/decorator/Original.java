package com.wu.qiang.decorator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

/**
 * 具体构件角色：原身
 * @auth wq on 2019/12/9 16:35
 **/
public class Original extends JFrame implements Morrigan {
    private String t="Morrigan0.jpg";
    public Original()
    {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }
    public void setImage(String t)
    {
        this.t=t;
    }
    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel l1=new JLabel(new ImageIcon("src/main/resources/decorator/"+t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
