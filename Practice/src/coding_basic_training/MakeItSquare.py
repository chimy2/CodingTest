def solution(arr):
    n = max(len(arr), len(arr[0]))
    if len(arr) <= len(arr[0]):
        for _ in range(n - len(arr)):
            arr.append([0] * n)
        return arr
    for i in arr:
        for _ in range(n - len(i)):
            i.append(0)
    return arr
