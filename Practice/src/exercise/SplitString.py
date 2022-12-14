def solution(s):
    answer = 0
    j = ""
    count = 0
    for i in s:
        if not count:
            answer += 1
            j = i;
            count = 1
        elif i == j:
            count += 1
        else:
            count -= 1
    return answer
