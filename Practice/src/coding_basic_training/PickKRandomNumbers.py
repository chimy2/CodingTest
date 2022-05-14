def solution(arr, k):
    return (list(dict.fromkeys(arr)) + [-1] * k)[:k]
