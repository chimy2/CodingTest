def solution(n):
    answer = 1
    i = 1
    while i <= n:
        while "3" in str(answer) or answer % 3 == 0:
            answer += 1
        i += 1
        answer += 1
    return answer - 1
