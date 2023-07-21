package com.yourself;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class AlgorithmsSearchBinarySearchTest {

    @Test
    private void test() throws FileNotFoundException {
        try {
            int[] items = { 2, 3, 5, 7, 11, 13, 17 };
            Assert.assertEquals(-1, AlgorithmsSearchBinarySearch.Search(items, 1));
        } catch (AssertionError ae) {
			success(false);
			msg("Oops! 🐞", ae.getMessage());
			msg("Hint 💡", "Did you properly accumulate all stars into 'totalStars'? 🤔");
		}  
    }


}
