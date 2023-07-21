package com.yourself;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class AlgorithmsSearchBinarySearchTest {

    @Test
    private static void testSearchNotFound() {
        int[] items = { 2, 3, 5, 7, 11, 13, 17 };
        Assert.assertEquals(-1, Search(items, 1));
    }


}
