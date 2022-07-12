def solution(emergency):
    answer = sorted(emergency.copy())
    return [len(emergency) - answer.index(i) for i in emergency]
    # return [sorted(emergency, reverse=True).index(e) + 1 for e in emergency]
