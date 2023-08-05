//SORTING QUICKSORT//

Time Complexity from O(n log(n)) to O(n^2)
// Space Complexity O(log(n))

void doSort(int[] items, int fst, int lst) {
    if (fst >= lst)
    return;
    int i = fst;
    int j = lst;
    int x = items[(fst + lst)/2];

    while (i < j) {
        while (items[i] < x) i++;
        while (items[j] > x) j--;
        if (i <= j) {
            int tmp = items[i];
            items[i] = items[j];
            items[j] = tmp;
            i++;
            j--;
        }
    }
    doSort(items, fst, j);
    doSort(items, i, lst);
}

int[] sort(int[] arr)
{
    int len = arr.length;
    int[] items = Arrays.copyOf(arr, len);
    doSort(items, 0, len - 1);
    return items;
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
// about 122 milliseconds
