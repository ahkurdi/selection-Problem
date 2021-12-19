package com.empiricalstudy.selectionproblem.partitioning;

import com.empiricalstudy.selectionproblem.Util;

public class ElementWithSelectedRankRandomizationAlgorithm extends ElementWithSelectedRankPartitioningBase implements Partitionable {

    public int getPivot(int[] array, int start, int end) {
        if ((end - start) > 3) {
            int pivotIdx = Util.getRandom(start + 1, end + 1) - 1;
            Util.swap(array, pivotIdx, start);
        }
        return array[start];
    }
}
