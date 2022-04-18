def solution(numbers, n):
    answer = 0
    for i, v in enumerate(numbers):
        if answer <= n:
            answer += v
        else:
            break
    return answer
