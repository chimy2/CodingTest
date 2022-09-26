def solution(a, b):
    return (a + b) * (abs(a - b) + 1) / 2
    # return sum(range(min(a, b), max(a, b) + 1))
