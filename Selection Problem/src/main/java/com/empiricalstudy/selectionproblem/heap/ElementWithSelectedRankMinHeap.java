package com.empiricalstudy.selectionproblem.heap;

import com.empiricalstudy.selectionproblem.ElementWithSelectedRank;
import com.empiricalstudy.selectionproblem.partitioning.ElementWithSelectedRankPartitioningBase;

public class ElementWithSelectedRankMinHeap implements ElementWithSelectedRank {

    @Override
    public int findElementAtSelectedRank(int[] array, int userChoice) {
        if (userChoice <= 0 || userChoice > array.length) {
            throw new IndexOutOfBoundsException(userChoice + " is out of range, array size is " + array.length);
        }

        MinHeap minHeap = new MinHeap();
        minHeap.buildHeap(array);
        int top = 0;
        while (userChoice != 0) {
            top = minHeap.remove(array);
            userChoice--;
        }
        return top;
    }
}
