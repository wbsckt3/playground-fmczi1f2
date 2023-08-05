//Adding and removing elements

import java.util.*;

//the length of the array type does not change
//it is recommended to use a class ArrayList
var primeNumbers = new ArrayList<>(
    Arrays.asList(2, 5, 7));
primeNumbers.add(11);
//primeNumbers is {2, 5, 7, 11}
System.out.println(primeNumbers);

primeNumbers.add(1, 3);
//primeNumbers is {2, 3, 5, 7, 11}
System.out.println(primeNumbers);

primeNumbers.remove(2);
//primeNumbers is {2, 3, 7, 11}
System.out.println(primeNumbers);

primeNumbers.addAll(Arrays.asList(13, 17));
//primeNumbers is {2, 3, 7, 11, 13, 17}
System.out.println(primeNumbers);

primeNumbers.remove(0);
primeNumbers.remove(0);
primeNumbers.addAll(0, Arrays.asList(2, 3, 5));
//primeNumbers is {2, 3, 5, 7, 11, 13, 17}
System.out.println(primeNumbers);

primeNumbers.clear();
//primeNumbers is {}
System.out.println(primeNumbers);
