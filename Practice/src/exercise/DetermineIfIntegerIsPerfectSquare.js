function solution(n) {
    return Math.sqrt(n) == parseInt(Math.sqrt(n))
        ? Math.pow(Math.sqrt(n) + 1, 2)
        : -1;
    // return Number.isInteger(Math.sqrt(n)) ? Math.pow(Math.sqrt(n) + 1, 2) : -1;
}
