function solution(array) {
    return array.map((v, i) => [v, i]).reduce((p, c) => (p[0] > c[0] ? p : c));
    // let max = Math.max(...array);
    // return [max, array.indexOf(max)];
}
