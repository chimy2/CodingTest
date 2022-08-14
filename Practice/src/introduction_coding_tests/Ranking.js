function solution(score) {
    score = score.map((i) => i[0] + i[1]);
    const sort = [...score].sort((a, b) => b - a);
    return score.map((i) => sort.indexOf(i) + 1);
    // return score.map(
    //     (el) => score.filter((v) => v[0] + v[1] > el[0] + el[1]).length + 1
    // );
}
