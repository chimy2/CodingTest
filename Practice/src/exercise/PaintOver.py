def solution(n, m, section):
    answer = 0
    last = 0
    for s in section:
        if last <= s:
            answer += 1
            last = s + m
    return answer
