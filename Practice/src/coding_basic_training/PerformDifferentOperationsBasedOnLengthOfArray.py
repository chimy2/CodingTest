def solution(arr, n):
    return [v + n if len(arr) % 2 ^ i % 2 else v for i, v in enumerate(arr)]
