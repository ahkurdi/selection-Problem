package com.empiricalstudy.selectionproblem;


import com.empiricalstudy.selectionproblem.heap.ElementWithSelectedRankMinHeap;
import com.empiricalstudy.selectionproblem.heap.ElementWithSelectedRankMinMaxHeap;
import com.empiricalstudy.selectionproblem.partitioning.ElementWithSelectedRankMedianOfMediansAlgorithm;
import com.empiricalstudy.selectionproblem.partitioning.ElementWithSelectedRankMedianOfThreeAlgorithm;
import com.empiricalstudy.selectionproblem.partitioning.ElementWithSelectedRankMedianOfThreeRandomAlgorithm;
import com.empiricalstudy.selectionproblem.partitioning.ElementWithSelectedRankRandomizationAlgorithm;


public class SelectionProblemApplication {

    public static void main(String[] args) {

        int[] randomList = Util.getRandomList(1, 1000000, 10000000);
        int rank = Util.getRandom(1, 10000);

        callFind(new ElementWithSelectedRankRandomizationAlgorithm(), Util.copyArray(randomList), rank);
        callFind(new ElementWithSelectedRankMinHeap(), Util.copyArray(randomList), rank);
        callFind(new ElementWithSelectedRankMedianOfMediansAlgorithm(), Util.copyArray(randomList), rank);
        callFind(new ElementWithSelectedRankMedianOfThreeRandomAlgorithm(), Util.copyArray(randomList), rank);
        callFind(new ElementWithSelectedRankMedianOfThreeAlgorithm(), Util.copyArray(randomList), rank);
        callFind(new ElementWithSelectedRankMinMaxHeap(), Util.copyArray(randomList), rank);
    }

    private static void callFind(ElementWithSelectedRank elementWithSelectedRank, int[] list, int rank) {
        long start = System.currentTimeMillis();
        int elementAtSelectedRank = elementWithSelectedRank.findElementAtSelectedRank(list, rank);
        long end = System.currentTimeMillis();
        System.out.println("runuing " + elementWithSelectedRank.getClass() + " takes : (" + (end - start) + ") ms to found rank " + rank + " equles = (" + elementAtSelectedRank + ") for array in size " + list.length);
    }

}
