package com.empiricalstudy.selectionproblem.heap;

abstract class BuildHeap {

    private int size = 0;

    abstract public void heapify(int[] arr, int n, int i);

    // Function to build a Heap from the Array
    public void buildHeap(int[] arr) {
        size = arr.length;

        int startIdx = (size / 2) - 1;

        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, size, i);
        }
    }


    public int remove(int[] arr) {
        int popped = arr[0];
        arr[0] = arr[--size];
        heapify(arr, size, 0);

        return popped;
    }

}
