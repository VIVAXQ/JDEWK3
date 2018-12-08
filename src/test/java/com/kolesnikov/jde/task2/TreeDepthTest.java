package com.kolesnikov.jde.task2;

import com.kolesnikov.jde.task1.NodeBS;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TreeDepthTest {

    @Test
    public void countDepth() throws Exception {
        List<NodeBS> testTree = new ArrayList<NodeBS>();
        testTree.add(new NodeBS(13, null, null)); //0
        testTree.add(new NodeBS(14, testTree.get(0), null)); //1
        testTree.add(new NodeBS(10, null, testTree.get(1))); //2
        testTree.add(new NodeBS(1, null, null));//3
        testTree.add(new NodeBS(4, null, null));//4
        testTree.add(new NodeBS(7, null, null));//5
        testTree.add(new NodeBS(6, testTree.get(4), testTree.get(5))); //6
        testTree.add(new NodeBS(3, testTree.get(3), testTree.get(6)));//7
        testTree.add(new NodeBS(8, testTree.get(7), testTree.get(2))); //8
        assertEquals(4, new TreeDepth().countDepth(testTree));
    }
}