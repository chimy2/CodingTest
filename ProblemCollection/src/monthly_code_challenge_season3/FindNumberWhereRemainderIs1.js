function solution(n) {
    for (let i = 2; i < n / 2; i++) {
        if (n % i == 1) return i;
    }
    return n - 1;
}
