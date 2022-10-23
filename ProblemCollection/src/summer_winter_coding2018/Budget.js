function solution(d, budget) {
    return d
        .sort((a, b) => a - b)
        .reduce((ac, c) => ((budget -= c) >= 0 ? ac + 1 : ac), 0);
}
