def solution(s):
    return [i - s.rfind(v, 0, i) if s.rfind(v, 0, i) >= 0 else -1 for i, v in enumerate(s)]
