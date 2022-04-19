function solution(arr, queries) {
    for (let [x, y] of queries) {
        for (let i = x; i <= y; i++) {
            arr[i]++;
        }
    }
    return arr;
}
