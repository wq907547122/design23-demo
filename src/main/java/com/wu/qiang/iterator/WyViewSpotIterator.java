package com.wu.qiang.iterator;

import java.util.List;

/**
 * @auth wq on 2019/12/11 16:59
 **/
public class WyViewSpotIterator implements ViewSpotIterator {
    private List<WyViewSpot> list = null;
    private int index = -1;
    WyViewSpot obj = null;

    public WyViewSpotIterator(List<WyViewSpot> list) {
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        if (list == null) {
            return false;
        }
        if (index < list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return list == null || list.size() == 0;
    }

    @Override
    public WyViewSpot first() {
        if(isEmpty()) {
            return null;
        }
        index = 0;
        obj = list.get(index);
        return obj;
    }

    @Override
    public WyViewSpot next() {
        if (hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public WyViewSpot previous() {
        if (index > 0) {
            obj = list.get(--index);
        }
        return obj;
    }

    @Override
    public WyViewSpot last() {
        if (isEmpty()) {
            return null;
        }
        index = list.size() - 1;
        obj = list.get(index);
        return obj;
    }
}
