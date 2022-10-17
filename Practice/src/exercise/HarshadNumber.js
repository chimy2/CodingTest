function solution(x) {
    return x % [...x.toString()].reduce((p, c) => p + +c, 0) == 0;
}
