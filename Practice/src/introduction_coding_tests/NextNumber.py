def solution(common):
    x, y, z = common[-3:]
    return z + y - x if y - x == z - y else z * y / x
