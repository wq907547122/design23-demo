package com.wu.qiang.iterator;

/**
 * 抽象迭代器：婺源景点迭代器接口
 * @auth wq on 2019/12/11 16:57
 **/
public interface ViewSpotIterator {
    boolean hasNext();
    boolean isEmpty();
    WyViewSpot first();
    WyViewSpot next();
    WyViewSpot previous();
    WyViewSpot last();
}
