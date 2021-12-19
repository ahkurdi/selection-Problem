package heap;

import com.empiricalstudy.selectionproblem.heap.MaxHeap;
import com.empiricalstudy.selectionproblem.heap.MinHeap;
import com.jayway.jsonpath.internal.function.numeric.Min;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class TestHeap {

    @Test
    public void testMaxHeap() {
        int[] arr = new int[]{10, 5, 6, 3, 2, 19, 54, 1,100,25,3,77};
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.buildHeap(arr);
        Assert.assertEquals(100, maxHeap.remove(arr));
        Assert.assertEquals(77, maxHeap.remove(arr));
        Assert.assertEquals(54, maxHeap.remove(arr));
        Assert.assertEquals(25, maxHeap.remove(arr));
        Assert.assertEquals(19, maxHeap.remove(arr));
        Assert.assertEquals(10, maxHeap.remove(arr));
    }

    @Test
    public void testMinHeap() {
        int[] arr = new int[]{10, 5, 6, 3, 2, 19, 54, 1,100,3,25,77};
        MinHeap minHeap = new MinHeap();
        minHeap.buildHeap(arr);
        Assert.assertEquals(1, minHeap.remove(arr));
        Assert.assertEquals(2, minHeap.remove(arr));
        Assert.assertEquals(3, minHeap.remove(arr));
        Assert.assertEquals(3, minHeap.remove(arr));
        Assert.assertEquals(5, minHeap.remove(arr));
        Assert.assertEquals(6, minHeap.remove(arr));
        Assert.assertEquals(10, minHeap.remove(arr));
    }
}
