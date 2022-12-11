def solution(number, limit, power):
    answer = 0
    arr = [1] * number
    for i in range(2, number + 1):
        for j in range(1, int(number / i) + 1):
            arr[i * j - 1] += 1
    return sum(power if limit < i else i for i in arr)
