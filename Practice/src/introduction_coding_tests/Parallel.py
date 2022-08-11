def solution(dots):
    arr = [[0, 1, 2, 3], [0, 2, 1, 3], [0, 3, 1, 2]];
    for a, b, c, d in arr:
        if (dots[b][1] - dots[a][1]) * (dots[d][0] - dots[c][0]) == (dots[d][1] - dots[c][1]) * (
                dots[b][0] - dots[a][0]):
            return 1
    return 0
