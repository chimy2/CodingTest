def solution(k, m, score):
    answer = 0
    arr = [0] * (k + 1)
    for i in score:
        arr[i] += 1
    for i in range(k, 0, -1):
        answer += int(arr[i] / m) * i * m
        arr[i - 1] += arr[i] % m
    return answer
    # 정렬한 것과 효율이 별차이 없음
    # return sum(sorted(score)[len(score) % m::m]) * m
    # return sum(sorted(score)[-m::-m]) * m
