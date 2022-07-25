def solution(n):
    j = 1
    for i in range(2, 11):
        if i * j > n: return i - 1
        j *= i
