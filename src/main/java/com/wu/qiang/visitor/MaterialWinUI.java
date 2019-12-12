package com.wu.qiang.visitor;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 具体的视图UI层组件，展示使用的访问者模式的利用，即客户端
 * @auth wq on 2019/12/12 10:18
 **/
public class MaterialWinUI extends JFrame implements ItemListener {
    JPanel CenterJP;
    SetMaterial os;    //材料集对象
    Company visitor1,visitor2;    //访问者对象
    String[] select;
    public MaterialWinUI() {
        super("利用访问者模式设计艺术公司和造币公司");
        JRadioButton Art;
        JRadioButton mint;
        os=new SetMaterial();
        os.add(new Cuprum());
        os.add(new Paper());
        visitor1=new ArtCompany();//艺术公司
        visitor2=new Mint(); //造币公司
        this.setBounds(10,10,750,350);
        this.setResizable(false);
        CenterJP=new JPanel();
        this.add("Center",CenterJP);
        JPanel SouthJP=new JPanel();
        JLabel yl=new JLabel("原材料有：铜和纸，请选择生产公司：");
        Art=new JRadioButton("艺术公司",true);
        mint=new JRadioButton("造币公司");
        Art.addItemListener(this);
        mint.addItemListener(this);
        ButtonGroup group=new ButtonGroup();
        group.add(Art);
        group.add(mint);
        SouthJP.add(yl);
        SouthJP.add(Art);
        SouthJP.add(mint);
        this.add("South",SouthJP);
        select=(os.accept(visitor1)).split(" ");    //获取产品名
        showPicture(select[0],select[1]);    //显示产品
    }
    //显示图片
    void showPicture(String cuprum,String paper)
    {
        CenterJP.removeAll();    //清除面板内容
        CenterJP.repaint();    //刷新屏幕
        String FileName1="src/main/resources/visitor/Picture/"+cuprum+".jpg";
        String FileName2="src/main/resources/visitor/Picture/"+paper+".jpg";
        JLabel lb=new JLabel(new ImageIcon(FileName1),JLabel.CENTER);
        JLabel rb=new JLabel(new ImageIcon(FileName2),JLabel.CENTER);
        CenterJP.add(lb);
        CenterJP.add(rb);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (!(source instanceof JRadioButton)) {
            return;
        }
        JRadioButton jc = (JRadioButton) source;
        if (!jc.isSelected()) {
            return;
        }
        if ("造币公司".equals(jc.getText())){
            select=(os.accept(visitor2)).split(" ");
        } else {
            select=(os.accept(visitor1)).split(" ");
        }
        showPicture(select[0],select[1]);    //显示产品
    }
}
