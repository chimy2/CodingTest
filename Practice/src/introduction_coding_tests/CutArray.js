function solution(numbers, num1, num2) {
    return numbers.filter((_, i) => i >= num1 && i <= num2);
    // return numbers.splice(num1, num2 - num1 + 1);
    // return numbers.slice(num1, num2 + 1);
}
