def solution(d, budget):
    answer = 0
    for i, v in enumerate(sorted(d)):
        budget -= v
        if budget >= 0:
            answer += 1
    return answer
