package com.kolesnikov.jde.task1;

public class NodeBS {

    private int value;
    private NodeBS left;
    private NodeBS right;

    public NodeBS(int value, NodeBS left, NodeBS right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public NodeBS getLeft() {
        return left;
    }

    public NodeBS getRight() {
        return right;
    }
}
