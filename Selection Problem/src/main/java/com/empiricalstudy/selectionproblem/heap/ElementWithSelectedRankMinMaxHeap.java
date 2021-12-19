package com.empiricalstudy.selectionproblem.heap;

import com.empiricalstudy.selectionproblem.ElementWithSelectedRank;

public class ElementWithSelectedRankMinMaxHeap implements ElementWithSelectedRank {

    @Override
    public int findElementAtSelectedRank(int[] array, int userChoice) {
        if (userChoice <= 0 || userChoice > array.length) {
            throw new IndexOutOfBoundsException(userChoice + " is out of range, array size is " + array.length);
        }

        int mid = array.length / 2;
        int top = 0;

        if (userChoice <= mid) {
            MinHeap minHeap = new MinHeap();
            minHeap.buildHeap(array);

            while (userChoice != 0) {
                top = minHeap.remove(array);
                userChoice--;
            }
        } else {
            userChoice = array.length - userChoice + 1;

            MaxHeap maxHeap = new MaxHeap();
            maxHeap.buildHeap(array);

            while (userChoice != 0) {
                top = maxHeap.remove(array);
                userChoice--;
            }

        }
        return top;
    }
}
