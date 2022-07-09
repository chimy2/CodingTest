function solution(n, k) {
    return 12000 * n + (k - parseInt(n / 10)) * 2000;
    // return 12000 * n + (k - ~~(n / 10)) * 2000;
}
