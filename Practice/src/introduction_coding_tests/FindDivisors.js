function solution(n) {
    return Array(n + 1)
        .fill(0)
        .map((v, i) => i)
        .filter((i) => n % i == 0);
}
