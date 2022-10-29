def solution(n, lost, reserve):
    answer = n
    arr = [0] * (n + 2)
    for i in reserve:
        arr[i] += 1
    for i in lost:
        arr[i] -= 1
    for i, v in enumerate(arr):
        if v == -1:
            if arr[i - 1] == 1:
                pass
            elif arr[i + 1] == 1:
                arr[i + 1] = 0
            else:
                answer -= 1
    return answer
