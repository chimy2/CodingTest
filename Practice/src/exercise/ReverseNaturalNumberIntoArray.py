def solution(n):
    return list(reversed([int(i) for i in str(n)]))
    # return list(map(int, reversed(str(n))))
    # return [int(i) for i in str(n)][::-1]
