function solution(n) {
    return Array(parseInt((n + 1) / 2))
        .fill(1)
        .map((v, i) => i * 2 + v);
}
