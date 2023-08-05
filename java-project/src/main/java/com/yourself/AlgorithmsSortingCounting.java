// SORTING - counting sort//

 Time Complexity O(n+k)
// Space Complexity O(k)

int[] sort(int[] arr) {
    int[] items = new int[arr.length];

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int x : arr) {
        if (x > max) max = x;
        if (x < min) min = x;
    }

    int[] counts = new int[max - min + 1];

    for (int x : arr) {
        counts[x - min]++;
    }

    int total = 0;
    for (int i = min; i <= max; i++) {
        int oldCount = counts[i - min];
        counts[i - min] = total;
        total += oldCount;
    }

    for (int x : arr) {
        items[counts[x - min]] = x;
        counts[x - min]++;
    }
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
// about 93 milliseconds
