function solution(numbers, k) {
    return (((k - 1) * 2) % numbers.length) + 1;
}
