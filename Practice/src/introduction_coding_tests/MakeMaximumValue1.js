function solution(numbers) {
    numbers.sort((a, b) => a - b);
    return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    // return numbers.at(-1) * numbers.at(-2);
    // let [a, b] = numbers.sort((a, b) => b - a);
    // return a * b;
}
