package com.yourself;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Date;

public class AlgorithmsSearchBinarySearchTest {

    @Test
    public void testSearchNotFound() {
        int[] items = { 2, 3, 5, 7, 11, 13, 17 };
        assertEquals(-1, Search(items, 1));
    }

    @Test
    public void testSearchFound() {
        int[] items = { 2, 3, 5, 7, 11, 13, 17 };
        assertEquals(3, Search(items, 7));
    }

    @Test
    public void testSearchNotFoundLargeArray() {
        int[] items = { 2, 3, 5, 7, 11, 13, 17 };
        assertEquals(-1, Search(items, 19));
    }

    @Test
    public void testSearchPerformance() {
        int[] items = new int[10000000];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
        int count = 100;

        Date start = new Date();
        for (int i = 0; i < count; i++)
            Search(items, 7777777);

        long milliseconds = (new Date()).getTime() - start.getTime();
        System.out.println(milliseconds);
        // Here you can add an assert statement if you want to check the performance.
        // For simplicity, we won't include it in this example.
    }
}
