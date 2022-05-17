function solution(arr, n) {
    return arr.map(
        (v, i) =>
            v +
            (arr.length % 2 == 0 && i % 2 == 1
                ? n
                : arr.length % 2 == 1 && i % 2 == 0
                ? n
                : 0)
    );
    // return arr.map((v, i) => (arr.length % 2 ^ i % 2 ? v + n : v));
}
