import re

def solution(dartResult):
    area = {"S": 1, "D": 2, "T": 3}
    answer = list(map(int, re.findall("\d+", dartResult)))
    i = -1
    for v in re.findall("[\D]", dartResult):
        if area.get(v):
            i += 1
            answer[i] **= area.get(v)
        else:
            if v == "*" and i > 0:
                answer[i - 1] *= 2
            answer[i] *= 2 if v == "*" else -1
    return sum(answer)
    # dart = {'S': 1, 'D': 2, 'T': 3}
    # scores = []
    # n = 0
    # for i, d in enumerate(dartResult):
    #     if d in dart:
    #         scores.append(int(dartResult[n:i]) ** dart[d])
    #     if d == "*":
    #         scores[-2:] = [x * 2 for x in scores[-2:]]
    #     if d == "#":
    #         scores[-1] = (-1) * scores[-1]
    #     if not (d.isnumeric()):
    #         n = i + 1
    # return sum(scores)
