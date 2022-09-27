def solution(strings, n):
    return sorted(strings, key=lambda a: (a[n], a))
