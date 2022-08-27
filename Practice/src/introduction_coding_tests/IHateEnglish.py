def solution(numbers):
    arr = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for i, v in enumerate(arr):
        numbers = numbers.replace(v, str(i))
    return int(numbers)
