package com.yourself;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AlgorithmsSearchBinarySearchTest {

    @Test
    private static void testSearchNotFound() {
        int[] items = { 2, 3, 5, 7, 11, 13, 17 };
        Assert.assertEquals(-1, AlgorithmsSearchBinarySearch.Search(items, 1));
    }


}
