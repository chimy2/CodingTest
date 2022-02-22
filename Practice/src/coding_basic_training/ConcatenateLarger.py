def solution(a, b):
    return max(int(f"{a}{b}"), int(f"{b}{a}"))
    # return int(max(f"{a}{b}", f"{b}{a}"))