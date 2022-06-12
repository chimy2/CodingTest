def solution(board, k):
    answer = 0
    for i in range(len(board)):
        j = 0
        while j < len(board[0]) and i + j < k:
            answer += board[i][j]
            j += 1
    return answer
