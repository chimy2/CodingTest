def solution(strArr):
    return [v.lower() if i % 2 == 0 else v.upper() for i, v in enumerate(strArr)]