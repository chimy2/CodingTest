def solution(board, moves):
    answer = 0
    arr = []
    for y in moves:
        for x in range(len(board)):
            if board[x][y - 1]:
                if len(arr) > 0 and arr[-1] == board[x][y - 1]:
                    arr.pop()
                    answer += 2
                else:
                    arr.append(board[x][y - 1])
                board[x][y - 1] = 0
                break
    return answer
