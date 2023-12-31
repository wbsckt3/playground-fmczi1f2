package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

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
  
            	success(true);

		if (existsInFile("(i + j)/2", new File("./src/main/java/com/yourself/AlgorithmsSearchBinarySearch.java"))) {
		   msg("Perfecto! 🙏", "Así se encuentra el punto medio en un array!");
		} else {
		   msg("Tip 🌟", "Asigna a m el cálculo del punto medio del array así: (i + j)/2");
		}
		
        } catch (AssertionError ae) {
		success(false);
		msg("Oops! 🐞", ae.getMessage());
		msg("Tip 💡", "Asigna a m el cálculo del punto medio del array (i + j)/2 ");
	}  
    }

	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
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
