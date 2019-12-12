package com.wu.qiang.iterator;

/**
 * 抽象聚合：婺源景点集接口
 * @auth wq on 2019/12/11 16:56
 **/
public interface ViewSpotSet {
    void add(WyViewSpot obj);
    void remove(WyViewSpot obj);

    ViewSpotIterator getIterator();
}
