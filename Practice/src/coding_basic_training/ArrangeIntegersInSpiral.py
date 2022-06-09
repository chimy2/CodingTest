def solution(n):
    answer = [[0] * n for _ in range(n)]
    d = [[0, 1], [1, 0], [0, -1], [-1, 0]]
    x = 0
    y = 0
    c = 0
    for i in range(1, n * n + 1):
        answer[x][y] = i
        x2 = x + d[c % 4][0]
        y2 = y + d[c % 4][1]
        if x2 < 0 or y2 < 0 or x2 >= n or y2 >= n or answer[x2][y2] != 0:
            c += 1
        x += d[c % 4][0]
        y += d[c % 4][1]
    return answer
