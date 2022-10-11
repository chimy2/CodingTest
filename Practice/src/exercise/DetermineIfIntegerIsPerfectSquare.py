def solution(n):
    return (n ** 0.5 + 1) ** 2 if n ** 0.5 == int(n ** 0.5) else -1
    # return (n ** .5 + 1) ** 2 if n ** .5 % 1 == 0 else -1
    # return n ** .5 % 1 == 0 and int(n ** .5 + 1) ** 2 or -1
