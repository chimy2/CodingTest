def solution(arr):
    answer = []
    for i, v in enumerate(arr):
        if i == 0 or arr[i - 1] != v:
            answer.append(v)
    return answer
