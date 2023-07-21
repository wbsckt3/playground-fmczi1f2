package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class AlgorithmsSearchBinarySearchTest {

    @Test
    public void test() throws FileNotFoundException {
        try {
            int[] sortedArray = { 2, 3, 5, 7, 11, 13, 17 };

            // Test cases for search values that exist in the array
            Assert.assertEquals("Search for 2", 0, AlgorithmsSearchBinarySearch.Search(sortedArray, 2));
            Assert.assertEquals("Search for 7", 3, AlgorithmsSearchBinarySearch.Search(sortedArray, 7));
            Assert.assertEquals("Search for 17", 6, AlgorithmsSearchBinarySearch.Search(sortedArray, 17));

            // Test cases for search values that do not exist in the array
            Assert.assertEquals("Search for 1", -1, AlgorithmsSearchBinarySearch.Search(sortedArray, 1));
            Assert.assertEquals("Search for 9", -1, AlgorithmsSearchBinarySearch.Search(sortedArray, 9));
            Assert.assertEquals("Search for 19", -1, AlgorithmsSearchBinarySearch.Search(sortedArray, 19));

        } catch (AssertionError ae) {
            Assert.fail("Oops! 🐞 " + ae.getMessage() + "\nHint 💡 Did you properly accumulate all stars into 'totalStars'? 🤔");
        }
    }

    // check if a string exists in a text file
    private static boolean existsInFile(String str, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        try {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(str))
                    return true;
            }
            return false;
        } finally {
            scanner.close();
        }
    }
}
