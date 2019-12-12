package com.wu.qiang.facade;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * 婺源特产的界面：(外观角色)
 * @auth wq on 2019/12/9 17:28
 **/
public class WySpecialty extends JPanel implements TreeSelectionListener {
    final JTree tree;
    JLabel label;
    Map<String, ImageIcon> map = new HashMap<>();
//    private Specialty1 s1=new Specialty1();
//    private Specialty2 s2=new Specialty2();
//    private Specialty3 s3=new Specialty3();
//    private Specialty4 s4=new Specialty4();
//    private Specialty5 s5=new Specialty5();
//    private Specialty6 s6=new Specialty6();
//    private Specialty7 s7=new Specialty7();
//    private Specialty8 s8=new Specialty8();

    WySpecialty(){
        DefaultMutableTreeNode top=new DefaultMutableTreeNode("婺源特产");
        DefaultMutableTreeNode node1=null,node2=null,tempNode=null;
        node1=new DefaultMutableTreeNode("婺源四大特产（红、绿、黑、白）");
        tempNode=new DefaultMutableTreeNode("婺源荷包红鲤鱼");
        map.put("婺源荷包红鲤鱼", new Specialty1());
        node1.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源绿茶");
        map.put("婺源绿茶", new Specialty2());
        node1.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源龙尾砚");
        map.put("婺源龙尾砚", new Specialty3());
        node1.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源江湾雪梨");
        map.put("婺源江湾雪梨", new Specialty4());
        node1.add(tempNode);
        top.add(node1);
        node2=new DefaultMutableTreeNode("婺源其它土特产");
        tempNode=new DefaultMutableTreeNode("婺源酒糟鱼");
        map.put("婺源酒糟鱼", new Specialty5());
        node2.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源糟米子糕");
        map.put("婺源糟米子糕", new Specialty6());
        node2.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源清明果");
        map.put("婺源清明果", new Specialty7());
        node2.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源油煎灯");
        map.put("婺源油煎灯", new Specialty8());
        node2.add(tempNode);
        top.add(node2);
        tree=new JTree(top);
        tree.addTreeSelectionListener(this);
        label=new JLabel();
    }
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        // 如果改变的是当前的树节点
        if(e.getSource() == tree) {
            Object obj = tree.getLastSelectedPathComponent();
            if (obj == null) {
                return;
            }
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) obj;
            if (!node.isLeaf()) {
                return;
            }
            String sele = node.getUserObject().toString();
            // 设置label的图片
            if (map.containsKey(sele)) {
                label.setIcon(map.get(sele));
            }


        }
    }
}
