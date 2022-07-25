function solution(n) {
    for (let i = 2, j = 1; j <= n; i++) {
        if (i * j > n) return i - 1;
        j *= i;
    }
}
