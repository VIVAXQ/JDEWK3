package com.kolesnikov.jde.task4;

import com.kolesnikov.jde.task3.NodeBSConcatenation;

import java.util.ArrayList;
import java.util.List;

public class ConcatenationBF {

    public String concatenationBreadthFirstSearch(List<NodeBSConcatenation> treeBS) {
        List<NodeBSConcatenation> thisLevel = new ArrayList<NodeBSConcatenation>();
        int rootNodeId = treeBS.size() - 1;
        thisLevel.add(treeBS.get(rootNodeId));
        treeBS.remove(rootNodeId);
        String countNodes = "";
        while (!treeBS.isEmpty()) {
            List<NodeBSConcatenation> nextLevel = new ArrayList<NodeBSConcatenation>();
            for (int i = 0; i < thisLevel.size(); i++) {
                countNodes = countNodes + thisLevel.get(i).getBukva();
                NodeBSConcatenation leftTemporary = thisLevel.get(i).getLeft();
                if (leftTemporary != null) {
                    nextLevel.add(leftTemporary);
                }
                NodeBSConcatenation rightTemporary = thisLevel.get(i).getRight();
                if (rightTemporary != null) {
                    nextLevel.add(rightTemporary);
                }
                treeBS.remove(thisLevel.get(i));
            }
            thisLevel = nextLevel;
        }
        return countNodes;
    }
}
