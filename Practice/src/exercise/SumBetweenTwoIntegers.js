function solution(a, b) {
    [max, min] = [Math.max(a, b), Math.min(a, b)];
    return ((max - min + 1) * (min + max)) / 2;
    // return ((a + b) * (Math.abs(a - b) + 1)) / 2;
}
