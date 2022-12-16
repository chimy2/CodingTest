def solution(t, p):
    return len([1 for i in range(len(t) - len(p) + 1) if t[i:i + len(p)] <= p])
