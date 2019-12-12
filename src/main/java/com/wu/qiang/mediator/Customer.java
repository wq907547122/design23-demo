package com.wu.qiang.mediator;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 抽象同事类：客户
 * @auth wq on 2019/12/11 15:56
 **/
public abstract class Customer extends JFrame implements ActionListener {
    protected Medium medium;
    protected String name;
    JTextField SentText; // 发送信息的输入框
    JTextArea ReceiveArea; // 接收信息的内容
    public Customer(String name)
    {
        super(name);
        this.name=name;
    }
    void ClientWindow(int x,int y)
    {
        Container cp;
        JScrollPane sp;
        JPanel p1,p2;
        cp=this.getContentPane();
        SentText=new JTextField(18);
        ReceiveArea=new JTextArea(10,18);
        ReceiveArea.setEditable(false);
        p1=new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(ReceiveArea);
        sp=new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
        p2=new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
        p2.add(SentText);
        cp.add(p2,BorderLayout.SOUTH);
        SentText.addActionListener(this);
        this.setLocation(x,y);
        this.setSize(250, 330);
        this.setResizable(false); //窗口大小不可调整
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempInfo=SentText.getText().trim();
        SentText.setText("");
        this.send(tempInfo);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    // 使滚动条滚动到最底端
    public void toBottom() {
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
    }
    // 发送消息
    public abstract void send(String ad);

    /**
     * 接收消息
     * @param from 发送消息的人
     * @param ad 具体的消息
     */
    public abstract void receive(String from, String ad);
}
