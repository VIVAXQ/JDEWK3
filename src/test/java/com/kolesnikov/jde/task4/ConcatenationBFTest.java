package com.kolesnikov.jde.task4;

import com.kolesnikov.jde.task3.NodeBSConcatenation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConcatenationBFTest {

    @Test
    public void concatenationBreadthFirstSearch() throws Exception {
        List<NodeBSConcatenation> testTree = new ArrayList<NodeBSConcatenation>();
        testTree.add(new NodeBSConcatenation(13, null, null, 'h')); //0
        testTree.add(new NodeBSConcatenation(14, testTree.get(0), null, 'i')); //1
        testTree.add(new NodeBSConcatenation(10, null, testTree.get(1), 'g')); //2
        testTree.add(new NodeBSConcatenation(1, null, null, 'a'));//3
        testTree.add(new NodeBSConcatenation(4, null, null, 'c'));//4
        testTree.add(new NodeBSConcatenation(7, null, null, 'e'));//5
        testTree.add(new NodeBSConcatenation(6, testTree.get(4), testTree.get(5), 'd')); //6
        testTree.add(new NodeBSConcatenation(3, testTree.get(3), testTree.get(6), 'b'));//7
        testTree.add(new NodeBSConcatenation(8, testTree.get(7), testTree.get(2), 'f')); //8
        assertEquals("fbgadiceh", new ConcatenationBF().concatenationBreadthFirstSearch(testTree));
    }
}