def solution(survey, choices):
    type = "RTCFJMAN"
    score = [0] * 4
    for s, c in zip(survey, choices):
        score[type.index(s[0]) // 2] += (4 - c) * (1 if type.index(s[0]) % 2 else -1)
    return "".join(type[i * 2 + (1 if v > 0 else 0)] for i, v in enumerate(score))
