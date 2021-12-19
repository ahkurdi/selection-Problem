package com.empiricalstudy.selectionproblem;

import com.empiricalstudy.selectionproblem.partitioning.ElementWithSelectedRankRandomizationAlgorithm;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Arrays;

@SpringJUnitConfig
class TestRandomizationAlgorithm implements SelectionAlgorithmTestTemplate {

    public static ElementWithSelectedRank elementWithSelectedRank = new ElementWithSelectedRankRandomizationAlgorithm();

    @Test
    @Override
    public void testSortedData() {
        int[] sortedList = Util.getSortedList(1, 1001097, 10000);
        int rank = 5;

        Util.print(sortedList);

        int elementAtSelectedRank = TestRandomizationAlgorithm.elementWithSelectedRank.findElementAtSelectedRank(Util.copyArray(sortedList), rank);

        int[] copySorted = Util.copyArray(sortedList);
        Arrays.sort(copySorted);

        Assert.assertEquals(copySorted[rank - 1], elementAtSelectedRank);
        System.out.println(" element At (" + rank + ") Rank for sorted list is : " + elementAtSelectedRank);

    }

    @Test
    @Override
    public void testSimiSortedData() {
        int[] simiSortedList = Util.getSimiSortedList(1, 100000, 1050);
        int rank = 22;

        Util.print(simiSortedList);

        int elementAtSelectedRank = TestRandomizationAlgorithm.elementWithSelectedRank.findElementAtSelectedRank(Util.copyArray(simiSortedList), rank);

        int[] copySorted = Util.copyArray(simiSortedList);
        Arrays.sort(copySorted);

        Assert.assertEquals(copySorted[rank - 1], elementAtSelectedRank);
        System.out.println(" element At (" + rank + ") Rank for simi sorted list is : " + elementAtSelectedRank);
    }

    @Test
    @Override
    public void testRandomData() {
        int[] randomSortedList = Util.getRandomList(1, 1001097, 10000);
        int rank = 1000;

        Util.print(randomSortedList);

        int elementAtSelectedRank = TestRandomizationAlgorithm.elementWithSelectedRank.findElementAtSelectedRank(Util.copyArray(randomSortedList), rank);

        int[] copySorted = Util.copyArray(randomSortedList);
        Arrays.sort(copySorted);

        Assert.assertEquals(copySorted[rank - 1], elementAtSelectedRank);
        System.out.println(" element At (" + rank + ") Rank for random list is : " + elementAtSelectedRank);


        int[] randomList2 = Util.getRandomList(1000, 1000000, 10000);
        int rank2 = 500;

        int elementAtSelectedRank2 = TestRandomizationAlgorithm.elementWithSelectedRank.findElementAtSelectedRank(Util.copyArray(randomList2), rank2);

        int[] copySorted2 = Util.copyArray(randomList2);
        Arrays.sort(copySorted2);

        Assert.assertEquals(copySorted2[rank2 - 1], elementAtSelectedRank2);
        System.out.println(" element At (" + rank2 + ") Rank for random list is : " + elementAtSelectedRank2);
    }

    @Test
    @Override
    public void testReversedData() {
        int[] simiSortedList = Util.getSortedReversedList(50, 500, 223);
        int rank = 1;

        Util.print(simiSortedList);

        int elementAtSelectedRank = TestRandomizationAlgorithm.elementWithSelectedRank.findElementAtSelectedRank(Util.copyArray(simiSortedList), rank);

        int[] copySorted = Util.copyArray(simiSortedList);
        Arrays.sort(copySorted);

        Assert.assertEquals(copySorted[rank - 1], elementAtSelectedRank);
        System.out.println(" element At (" + rank + ") Rank for reversed list is : " + elementAtSelectedRank);
    }
}
