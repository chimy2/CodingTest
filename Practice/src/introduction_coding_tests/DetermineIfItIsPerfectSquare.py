import math

def solution(n):
    return +(math.sqrt(n) % 1 == 0) + 1
    # return 1 if (n ** 0.5).is_integer() else 2
