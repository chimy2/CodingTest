import math

def solution(a, b, c):
    s = set([a, b, c])
    return math.prod([pow(a, i) + pow(b, i) + pow(c, i) for i in range(1, 5-len(s))])
    # return math.prod([a ** i + b ** i + c ** i for i in range(1, 5-len(s))])