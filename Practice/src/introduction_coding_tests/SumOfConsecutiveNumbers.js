function solution(num, total) {
    return Array(num)
        .fill(total / num - (num - 1) / 2)
        .map((v, i) => v + i);
}
