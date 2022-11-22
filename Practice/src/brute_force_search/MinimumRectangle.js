function solution(sizes) {
    return sizes
        .reduce(
            (p, c) => [
                Math.max(p[0], Math.min(c[0], c[1])),
                Math.max(p[1], c[0], c[1]),
            ],
            [0, 0]
        )
        .reduce((p, c) => p * c);
}
