def solution(n, control):
    a = {"w": 1, "s": -1, "a": -10, "d": 10}
    for i, j in enumerate(control):
        n += a.get(j)
    return n
