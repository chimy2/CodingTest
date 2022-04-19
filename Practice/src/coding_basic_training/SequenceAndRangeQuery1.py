def solution(arr, queries):
    for x, y in queries:
        for i in range(x, y + 1):
            arr[i] += 1
    return arr
