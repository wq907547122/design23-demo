package com.wu.qiang.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @auth wq on 2019/12/11 9:57
 **/
public class LeaveApprovalTes {
    public static void main(String[] args) {
        // 责任链就是相当于一个arrayList的处理
        List<Leader> leaders = new ArrayList<>();
        Leader leader1 = new ClassAdviser(); // 班主任
        Leader leader2 = new DepartmentHead(); // 系主任
        Leader leader3 = new Dean(); // 院长
        Leader leader4 = new DeanOfStudies(); // 教务处长
        leaders.add(leader1);
        leaders.add(leader2);
        leaders.add(leader3);
        leaders.add(leader4);
        // 按照次序，下一个是上一个的next
        for(int i = 0; i < leaders.size() - 1; i++) {
            leaders.get(i).setNext(leaders.get(i + 1));
        }
        leaders.get(0).handlerRequest(7);
    }
}
