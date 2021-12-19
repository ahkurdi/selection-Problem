package com.empiricalstudy.selectionproblem.partitioning;

import com.empiricalstudy.selectionproblem.Util;

public class ElementWithSelectedRankMedianOfThreeRandomAlgorithm extends ElementWithSelectedRankPartitioningBase implements Partitionable {

    public int getPivot(int[] array, int start, int end) {
        if ((end - start) < 10) {
            return array[start];
        }

        int firstRandom = Util.getRandom(start + 1, end + 1) - 1;
        Util.swap(array, firstRandom, start);
        int secondRandom = Util.getRandom(start + 1, end + 1) - 1;
        int lastRandom = Util.getRandom(start + 1, end + 1) - 1;

        if (array[start] > array[secondRandom]) {
            if (array[start] > array[lastRandom]) {
                if (array[secondRandom] > array[lastRandom]) {
                    Util.swap(array, secondRandom, start);
                } else {
                    Util.swap(array, lastRandom, start);
                }
            }
        } else {
            if (array[secondRandom] < array[lastRandom]) {
                Util.swap(array, secondRandom, start);
            } else {
                if (array[lastRandom] > array[start]) {
                    Util.swap(array, lastRandom, start);
                }
            }
        }
        return array[start];
    }
}

