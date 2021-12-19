package com.empiricalstudy.selectionproblem.partitioning;

import com.empiricalstudy.selectionproblem.ElementWithSelectedRank;
import com.empiricalstudy.selectionproblem.Util;

public abstract class ElementWithSelectedRankPartitioningBase implements ElementWithSelectedRank {

    @Override
    public int findElementAtSelectedRank(int[] array, int userChoice) {
        if (userChoice <= 0 || userChoice > array.length) {
            throw new IndexOutOfBoundsException(userChoice + " is out of range, array size is " + array.length);
        }
        return select(array, 0, array.length - 1, userChoice);
    }

    abstract public int getPivot(int[] array, int start, int end);

    protected int select(int[] array, int start, int end, int userChoice) {
        if (start == end)
            return array[start];

        int mid = partition(array, start, end);
        int k = mid - start + 1;

        if (k == userChoice) {
           System.out.println("find K = "+k);
            Util.print(array);
            return array[mid];
        }
        else if (userChoice < k) {
            return select(array, start, mid - 1, userChoice);
        } else {
            return select(array, mid + 1, end, userChoice - k);
        }
    }


    public int partition(int[] array, int start, int end) {
        int pivot = getPivot(array, start, end);

        while (start < end) {
            while ((array[end] > pivot) && (start < end)) {
                end = end - 1;
            }

            if (start != end) {
                array[start] = array[end];
                start = start + 1;
            }

            while ((array[start] < pivot) && (start < end)) {
                start = start + 1;
            }

            if (start != end) {
                array[end] = array[start];
                end = end - 1;
            }
        }

        array[end] = pivot;
        return end;
    }
}
