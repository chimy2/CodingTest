def solution(a, b, flag):
    return a + (b if flag else -b)
    # return a + b * (2 * int(flag) - 1)