def solution(arr):
    answer = []
    for i, v in enumerate(arr):
        for j in range(v):
            answer.append(v)
    # for num in arr:
    #     answer += [num] * num
    return answer
