def solution(dots):
    for i in dots:
        if dots[0][0] != i[0] and dots[0][1] != i[1]:
            return abs((dots[0][0] - i[0]) * (dots[0][1] - i[1]))
