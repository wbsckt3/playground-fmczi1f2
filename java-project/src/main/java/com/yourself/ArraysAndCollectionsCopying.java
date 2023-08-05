//ARRAY COPYING

import java.util.Arrays;
var numbers1 = new int[] {1, 2, 3, 4, 5};

//first variant
var numbers2 = Arrays
    .copyOf(numbers1, numbers1.length);

//second variant
var numbers3 = new int[5];
System.arraycopy( numbers1, 0, 
    numbers3, 0, numbers1.length);

System.out.println(Arrays.toString(numbers2));
System.out.println(Arrays.toString(numbers3));
