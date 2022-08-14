def solution(score):
    return [len([0 for x, y in score if i + j < x + y]) + 1 for i, j in score]
