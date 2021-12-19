package com.empiricalstudy.selectionproblem.partitioning;

import com.empiricalstudy.selectionproblem.Util;

public class ElementWithSelectedRankMedianOfThreeAlgorithm extends ElementWithSelectedRankPartitioningBase implements Partitionable {

    public int getPivot(int[] array, int start, int end) {
        if ((end - start) < 3) {
            return array[start];
        }
        int middleIndex = ((end + start) / 2);

        if (array[start] > array[middleIndex]) {
            if (array[start] > array[end]) {
                if (array[middleIndex] > array[end]) {
                    Util.swap(array, middleIndex, start);
                } else {
                    Util.swap(array, end, start);
                }
            }
        } else {
            if (array[middleIndex] < array[end]) {
                Util.swap(array, middleIndex, start);
            } else {
                if (array[end] > array[start]) {
                    Util.swap(array, end, start);
                }
            }
        }
        return array[start];
    }
}
