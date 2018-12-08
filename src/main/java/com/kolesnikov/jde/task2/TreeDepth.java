package com.kolesnikov.jde.task2;

import com.kolesnikov.jde.task1.NodeBS;

import java.util.ArrayList;
import java.util.List;

public class TreeDepth {

    public int countDepth(List<NodeBS> treeBS) {
        List<NodeBS> thisLevel = new ArrayList<NodeBS>();
        int rootNodeId = treeBS.size() - 1;
        thisLevel.add(treeBS.get(rootNodeId));
        treeBS.remove(rootNodeId);
        int countNodes = 0;
        while (!treeBS.isEmpty()) {
            List<NodeBS> nextLevel = new ArrayList<NodeBS>();
            for (int i = 0; i < thisLevel.size(); i++) {
                NodeBS leftTemporary = thisLevel.get(i).getLeft();
                if (leftTemporary != null) {
                    nextLevel.add(leftTemporary);

                }
                NodeBS rightTemporary = thisLevel.get(i).getRight();
                if (rightTemporary != null) {
                    nextLevel.add(rightTemporary);
                }
                treeBS.remove(thisLevel.get(i));
            }
            countNodes++;
            thisLevel = nextLevel;
        }
        return countNodes;
    }
}
