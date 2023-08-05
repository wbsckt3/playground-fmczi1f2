// SORTING - BUBBLE SORT

// Time Complexity O(n^2)
// Space Complexity O(1)

int[] sort(int[] arr) {
    int len = arr.length;
    int[] items = Arrays.copyOf(arr, len);
    for (int i = 0; i < len; i++) {
        for (int j = i + 1; j < len; j++) {
            if (items[j] < items[i]) {
                int tmp = items[j];
                items[j] = items[i];
                items[i] = tmp;
            }
        }           
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
// about 667 milliseconds
