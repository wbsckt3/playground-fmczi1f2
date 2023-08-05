// RADIX SORT

// Time Complexity O(nk)
// Space Complexity O(n+k)

function listToBuckets(items, cBase, i) {
    let buckets = Array
        .apply(null, Array(cBase))
        .map(function () { return [] });

    let pBase = Math.pow(cBase, i);
    for (let x of items) {
        //Isolate the base-digit from the number
        let digit = Math.floor(x / pBase) % cBase;
        //Drop the number into the correct bucket
        buckets[digit].push(x);
    }

    return buckets;
}

function bucketsToList(buckets) {
    let result = [];

    for (let bucket of buckets) {
        //add the numbers in a bucket
        //sequentially to the returned array
        result = result.concat(bucket);
    }

    return result;
}

function sort(arr, cBase = 10) {
    let maxVal = Math.max.apply(Math, arr);
    let i = 0;

    while (Math.pow(cBase, i) <= maxVal) {
        arr = bucketsToList(listToBuckets(arr, cBase, i));
        i++;
    }

    return arr;
}

let items = [4, 1, 5, 3, 2];
let sortItems = sort(items);
// sortItems is [1, 2, 3, 4, 5]
console.log(sortItems);

// * simplified speed test *
let i = 0;
items = Array
    .apply(null, Array(200))
    .map(() => ++i );
let tmp = items[5];
items[5] = items[6];
items[6] = tmp;
let count = 10000;
let start = new Date();

for (i = 0; i < count; i++)
    sort(items);

let milliseconds = (new Date()) - start;

console.log("milliseconds is", milliseconds);
// about 405 milliseconds
