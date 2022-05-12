def solution(arr, flag):
    answer = []
    for i, v in enumerate(flag):
        if flag[i]:
            answer += [arr[i]] * arr[i] * 2
        else:
            answer = answer[:-arr[i]]
    return answer
