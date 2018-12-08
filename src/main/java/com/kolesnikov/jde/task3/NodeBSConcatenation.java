package com.kolesnikov.jde.task3;

public class NodeBSConcatenation {

    private int value;
    private NodeBSConcatenation left;
    private NodeBSConcatenation right;
    private char bukva;

    public NodeBSConcatenation(int value, NodeBSConcatenation left, NodeBSConcatenation right, char bukva) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.bukva = bukva;
    }

    public int getValue() {
        return value;
    }

    public NodeBSConcatenation getLeft() {
        return left;
    }

    public NodeBSConcatenation getRight() {
        return right;
    }

    public char getBukva() {
        return bukva;
    }
}
