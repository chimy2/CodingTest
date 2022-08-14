function solution(numlist, n) {
    return numlist.sort((a, b) =>
        n * 2 == a + b ? b - a : Math.abs(n - a) - Math.abs(n - b)
    );
    // return numlist.sort((a, b) => Math.abs(a - n) - Math.abs(b - n) || b - a);
}
