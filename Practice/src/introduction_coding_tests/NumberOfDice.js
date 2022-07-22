function solution(box, n) {
    return box.reduce((ac, c) => ac * ~~(c / n), 1);
}
