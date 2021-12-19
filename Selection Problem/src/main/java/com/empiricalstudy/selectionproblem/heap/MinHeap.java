package com.empiricalstudy.selectionproblem.heap;

public class MinHeap extends BuildHeap {
    @Override
    public void heapify(int[] arr, int n, int i) {
        int min = i; // Initialize small as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] < arr[min])
            min = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] < arr[min])
            min = r;

        // If largest is not root
        if (min != i) {
            int swap = arr[i];
            arr[i] = arr[min];
            arr[min] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, min);
        }
    }
}
