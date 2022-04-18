function solution(numbers, n) {
    return numbers.reduce((ac, v) => (ac <= n ? ac + v : ac));
}
