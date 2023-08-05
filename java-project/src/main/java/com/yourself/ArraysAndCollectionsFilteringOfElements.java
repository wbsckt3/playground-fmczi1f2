//Filtering of elements 

import java.util.*;
import java.util.stream.Collectors;

var numbers = new ArrayList<>(
    Arrays.asList(1, 2, 3, 4, 5));

var oddItems = numbers.stream()
    .filter(i -> i % 2 == 1)
    .collect(Collectors.toList());
//oddItems is { 1, 3, 5 }
System.out.println(oddItems);
Try it in Playground
