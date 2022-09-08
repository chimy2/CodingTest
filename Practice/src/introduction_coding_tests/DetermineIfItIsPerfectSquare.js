function solution(n) {
    return +Math.sqrt(n) % 1 != 0 + 1;
    // return Number.isInteger(Math.sqrt(n)) ? 1 : 2;
}
