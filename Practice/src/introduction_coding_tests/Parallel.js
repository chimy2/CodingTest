function solution(dots) {
    const arr = [
        [0, 1, 2, 3],
        [0, 2, 1, 3],
        [0, 3, 1, 2],
    ];
    for (let [a, b, c, d] of arr) {
        let x1 = dots[a][0] > dots[b][0] ? b : a;
        let x2 = dots[a][0] > dots[b][0] ? a : b;
        let x3 = dots[c][0] > dots[d][0] ? d : c;
        let x4 = dots[c][0] > dots[d][0] ? c : d;
        if (
            (dots[x2][1] - dots[x1][1]) / (dots[x2][0] - dots[x1][0]) ==
            (dots[x4][1] - dots[x3][1]) / (dots[x4][0] - dots[x3][0])
        )
            return 1;
    }
    return 0;
}
