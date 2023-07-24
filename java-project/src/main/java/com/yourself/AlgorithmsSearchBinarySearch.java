// { autofold
package com.yourself;

import java.util.Arrays;

public class AlgorithmsSearchBinarySearch {
// }
    // Funciona con un array ordenado de menor a mayor
    public static int Search(int[] arr, int x){
        int i = 0;
        int j = arr.length;
        while (i != j){
            int m = ?; // como calculas el punto medio del array?
            if (x == arr[m]) return m;
            if (x < arr[m]) 
                j = m;
            else
                i = m + 1;
        }
        return -1;
    }

}
