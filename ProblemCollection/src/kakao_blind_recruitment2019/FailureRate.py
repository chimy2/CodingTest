def solution(N, stages):
    answer = [i for i in range(1, N + 1)]
    arr = [0] * (N + 1)
    for i in stages:
        arr[i - 1] += 1
    count = arr[N]
    for i in range(N - 1, -1, -1):
        count += arr[i]
        if count == 0:
            continue
        arr[i] /= count
    return sorted(answer, key=lambda x: arr[x - 1], reverse=True)
