def solution(strArr):
    answer = [0] * 30
    for s in strArr:
        answer[len(s) - 1] += 1
    return max(answer)
