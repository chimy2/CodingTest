def solution(sides):
    x, y, long = sorted(sides)
    return 1 if x + y > long else 2
    # return 1 if max(sides) < (sum(sides) - max(sides)) else 2
