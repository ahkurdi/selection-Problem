package com.empiricalstudy.selectionproblem.partitioning;

public interface Partitionable {

    public int partition(int[] array, int start, int end);

    public int getPivot(int[] array, int start, int end);
}
