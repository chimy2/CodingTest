function solution(array, n) {
    return array.reduce((p, c) =>
        Math.abs(n - p) < Math.abs(n - c) ||
        (Math.abs(n - p) == Math.abs(n - c) && p < c)
            ? p
            : c
    );
}
