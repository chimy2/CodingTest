def solution(n, k):
    return list(map(lambda i: i * k, range(1, int(n / k) + 1)))
    # return [i * k for i in range(1, int(n / k) + 1)]
    # return [i for i in range(k, n + 1, k)]
