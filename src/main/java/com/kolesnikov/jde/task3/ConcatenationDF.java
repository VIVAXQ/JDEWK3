package com.kolesnikov.jde.task3;

public class ConcatenationDF {

    public String preOrder(NodeBSConcatenation nodeBS) {
        String temporaryResult = "";
        temporaryResult = temporaryResult + nodeBS.getBukva();
        if (nodeBS.getLeft() != null) {
            temporaryResult = temporaryResult + preOrder(nodeBS.getLeft());
        }
        if (nodeBS.getRight() != null) {
            temporaryResult = temporaryResult + preOrder(nodeBS.getRight());
        }
        return temporaryResult;
    }

    public String inOrder(NodeBSConcatenation nodeBS) {
        String temporaryResult = "";
        if (nodeBS.getLeft() != null) {
            temporaryResult = temporaryResult + inOrder(nodeBS.getLeft());
        }
        temporaryResult = temporaryResult + nodeBS.getBukva();
        if (nodeBS.getRight() != null) {
            temporaryResult = temporaryResult + inOrder(nodeBS.getRight());
        }
        return temporaryResult;
    }

    public String postOrder(NodeBSConcatenation nodeBS) {
        String temporaryResult = "";
        if (nodeBS.getLeft() != null) {
            temporaryResult = temporaryResult + postOrder(nodeBS.getLeft());
        }
        if (nodeBS.getRight() != null) {
            temporaryResult = temporaryResult + postOrder(nodeBS.getRight());
        }
        temporaryResult = temporaryResult + nodeBS.getBukva();
        return temporaryResult;
    }
}
