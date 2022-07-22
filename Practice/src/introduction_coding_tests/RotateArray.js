function solution(numbers, direction) {
    direction == 'left'
        ? numbers.push(numbers.shift(1))
        : numbers.unshift(numbers.pop());
    return numbers;
}
