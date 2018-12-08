package com.kolesnikov.jde.task1;

public class RecursiveCount {

    public int countBeans(NodeBS nodeBS) {
        int temporaryResult = 0;
        if (nodeBS.getLeft() != null) {
            temporaryResult = temporaryResult + countBeans(nodeBS.getLeft());
        }
        if (nodeBS.getRight() != null) {
            temporaryResult = temporaryResult + countBeans(nodeBS.getRight());
        }
        temporaryResult++;
        return temporaryResult;
    }
}

