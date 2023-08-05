//Finding an array element

Integer[] numbers = { 2, 3, 5, 7, 11, 13, 17 };
Boolean contain5 = Arrays
    .asList(numbers).contains(5);
//contain5 is true

int index5 = Arrays
    .asList(numbers).indexOf(5);
//index is 2

Boolean contain10 = Arrays
    .asList(numbers).contains(10);
//contain10 is false

System.out.println("contain5 is " + contain5);
System.out.println("index5 is " + index5);
System.out.println("contain10 is " + contain10); 
Try it in Playground
