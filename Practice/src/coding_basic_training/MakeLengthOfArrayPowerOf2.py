import math

def solution(arr):
    return arr + [0 for i in range(2 ** math.ceil(math.log2(len(arr))) - len(arr))]