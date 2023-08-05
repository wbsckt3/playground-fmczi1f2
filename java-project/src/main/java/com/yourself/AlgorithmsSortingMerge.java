// SORTING MERGE SORT//

 Time Complexity O(n log(n)))
// Space Complexity O(n)

int[] sort(int[] arr) {
    int[] items = Arrays.copyOf(arr, arr.length);
    doSort(items);
    return items;
}

void doSort(int[] items) {
    int len = items.length;
    if (len == 1)
    return;

    int lLeft = len/2;
    int[] left = Arrays.copyOf(items, lLeft);
    int[] right = Arrays.copyOfRange(items, lLeft, len);

    doSort(left);
    doSort(right);

    merge(left, right, items);
}

void merge(int[] left, int[] right, int[] result) {
    int l = 0;
    int r = 0;
    int i = 0;

    while (l < left.length &amp;&amp; r < right.length) {
        if (left[l] < right[r]) {
            result[i] = left[l];
            l++;
        } else {
            result[i] = right[r];
            r++;
        }
        i++;
    }
    System.arraycopy(left, l, result, i, left.length - l);
    System.arraycopy(right, r, result, i, right.length - r);
}


int[] items = { 4, 1, 5, 3, 2 };

int[] sortItems = sort(items);
// sortItems is {1, 2, 3, 4, 5}
System.out.println(Arrays.toString(sortItems));

// * simplified speed test *
items = new int[200];
for (int i = 0; i < items.length; i++) {
    items[i] = i;
}
int tmp = items[5];
items[5] = items[6];
items[6] = tmp;         
int count = 10000;
Date start = new Date();

for (int i = 0; i < count; i++)
    sort(items);

long milliseconds = (new Date()).getTime() - start.getTime();

System.out.println(milliseconds);
// about 161 milliseconds
