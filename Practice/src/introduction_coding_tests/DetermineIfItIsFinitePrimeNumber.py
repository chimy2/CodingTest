def solution(a, b):
    i = 2
    while i <= 5:
        if b % i == 0:
            b /= i
        else:
            i += 3
    if a % b == 0:
        return 1
    return 2
