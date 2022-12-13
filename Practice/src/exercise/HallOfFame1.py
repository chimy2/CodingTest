def solution(k, score):
    answer = []
    arr = [0] * k
    for i in range(len(score)):
        num = score[i]
        for j in range(k):
            if num > arr[j]:
                arr[j], num = num, arr[j]
        answer.append(arr[min(i, k - 1)])
    return answer
