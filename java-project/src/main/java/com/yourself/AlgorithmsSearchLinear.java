// Linear search:

int Search(int[] arr, int x)
{
    int i = 0;
    int count = arr.length;
    while (i < count)
    {
        if (arr[i] == x)
        return i;
        i++;
    }
    return -1; 
}

int[] items = { 2, 3, 5, 7, 11, 13, 17 };

System.out.println(Search(items, 1));
//print -1
System.out.println(Search(items, 7));
//print 3
System.out.println(Search(items, 19));
//print -1

// * simplified speed test *

items = new int[10000000];
for (int i = 0; i < items.length; i++) {
    items[i] = i;
}
int count = 100;

Date start = new Date();

for (int i = 0; i < count; i++)
Search(items, 7777777);

long milliseconds = (new Date()).getTime() - start.getTime();

System.out.println(milliseconds);
// about 380 milliseconds
