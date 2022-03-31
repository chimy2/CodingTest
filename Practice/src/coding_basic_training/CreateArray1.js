function solution(n, k) {
    return Array(parseInt(n / k))
        .fill(0)
        .map((v, i) => (i + 1) * k);
}
