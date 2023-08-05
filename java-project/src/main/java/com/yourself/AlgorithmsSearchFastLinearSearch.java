//Fast linear search:

Int Search(List<Integer> list, int x)
{
    var i = 0;
    var count = list.size();
    list.add(x);
    while (true) {
        if (list.get(i) == x) {
            return i < count ? i : -1;
        }
        i++;
    }
}

var items = new ArrayList<Integer>(
    Arrays.asList(2, 3, 5, 7, 11, 13, 17));

System.out.println(Search(items, 1));
//print -1
System.out.println(Search(items, 7));
//print 3
System.out.println(Search(items, 19));
//print -1

// * simplified speed test *

items = new ArrayList<>(10000000);
for (int i = 0; i < 10000000; i++) {
    items.add(i);
}
var count = 100;

var start = new Date();

for (int i = 0; i < count; i++) {
    Search(items, 7777777);
}

var milliseconds = (new Date()).getTime() - start.getTime();

System.out.println(milliseconds);
// about 1505 milliseconds
