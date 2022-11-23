def solution(n):
    for i in range(2, n // 2):
    # for i in range(2, int(n ** .5) + 1):
        if n % i == 1: return i
    return n - 1
    # return next(i for i in range(2, n) if n % i == 1)
