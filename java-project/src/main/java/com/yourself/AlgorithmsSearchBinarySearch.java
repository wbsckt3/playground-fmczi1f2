// { autofold
package com.yourself;

import java.util.Arrays;

public class AlgorithmsSearchBinarySearch {
// }
    //works when the array is sorted
    public static int Search(int[] arr, int x){
        int i = 0;
        int j = arr.length;
        while (i != j){
            int m = (i + j)/2;
            if (x == arr[m]) return m;
            if (x < arr[m]) 
                j = m;
            else
                i = m + 1;
        }
        return -1;
    }

}
