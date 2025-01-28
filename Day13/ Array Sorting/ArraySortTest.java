package test1;

import org.junit.Assert;
import org.junit.Test;
import Day13.ArraySort;

public class ArraySortTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNullArray() {
        ArraySort sorter = new ArraySort();
        sorter.sort(null);
    }

    @Test
    public void testEmptyArray() {
        ArraySort sorter = new ArraySort();
        int[] result = sorter.sort(new int[]{});
        Assert.assertArrayEquals(new int[]{}, result);
    }

    

    @Test
    public void testAlreadySortedArray() {
        ArraySort sorter = new ArraySort();
        int[] result = sorter.sort(new int[]{1, 2, 3, 4, 5});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testUnsortedArray() {
        ArraySort sorter = new ArraySort();
        int[] result = sorter.sort(new int[]{7, 3, 8, 5, 5, 0});
        Assert.assertArrayEquals(new int[]{0, 3, 5, 5, 7, 8}, result);
    }

    @Test
    public void testArrayWithDuplicates() {
        ArraySort sorter = new ArraySort();
        int[] result = sorter.sort(new int[]{4, 4, 4, 4});
        Assert.assertArrayEquals(new int[]{4, 4, 4, 4}, result);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        ArraySort sorter = new ArraySort();
        int[] result = sorter.sort(new int[]{-3, -1, -2, -4, 0});
        Assert.assertArrayEquals(new int[]{-4, -3, -2, -1, 0}, result);
    }

    
}
