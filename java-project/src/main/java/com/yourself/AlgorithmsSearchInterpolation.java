//Interpolation Search:

//works when the array is sorted
int Search(int[] arr, long x)
{
    int low = 0;
    int high = arr.length - 1;

    while ((arr[low] < x) &amp;&amp; (x < arr[high]))
    {
        long delta = (x - arr[low])*(high - low);
        int mid = low + (int)(delta/(arr[high] - arr[low]));

        if (arr[mid] < x)
          low = mid + 1;
        else if (arr[mid] > x)
          high = mid - 1;
        else
          return mid;
    }

    if (arr[low] == x)
    return low;
    if (arr[high] == x)
    return high;
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
// less than one millisecond
