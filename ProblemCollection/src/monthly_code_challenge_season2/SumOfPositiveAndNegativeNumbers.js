function solution(absolutes, signs) {
    return absolutes.reduce((ac, v, i) => ac + v * (signs[i] ? 1 : -1), 0);
}
