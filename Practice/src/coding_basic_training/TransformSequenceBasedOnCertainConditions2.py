def solution(arr):
    answer = 0
    for i in arr:
        v = i
        temp = 0
        while v % 2 == 0 and v >= 50 or v % 2 == 1 and v < 50:
            if v < 50:
                v = v * 2 + 1
            else:
                v /= 2
            temp += 1
        answer = max(answer, temp)
    return answer
