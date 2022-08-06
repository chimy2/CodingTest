def solution(board):
    answer = 0
    arr = [[-1, -1], [-1, 0], [-1, 1], [0, -1], [0, 1], [1, -1], [1, 0], [1, 1]]
    for i in range(0, len(board)):
        for j in range(0, len(board)):
            if board[i][j] != 1:
                for x, y in arr:
                    if i + x < 0 or i + x >= len(board) or j + y < 0 or j + y >= len(board): continue
                    if board[i + x][j + y] == 1:
                        board[i][j] = 2
                        break
    for i in board:
        for j in i:
            if j == 0:
                answer += 1
    print(board)
    return answer
    # n = len(board)
    # danger = set()
    # for i, row in enumerate(board):
    #     for j, x in enumerate(row):
    #         if not x:
    #             continue
    #         danger.update((i+di, j+dj) for di in [-1,0,1] for dj in [-1, 0, 1])
    # return n*n - sum(0 <= i < n and 0 <= j < n for i, j in danger)