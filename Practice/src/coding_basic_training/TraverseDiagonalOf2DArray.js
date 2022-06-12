function solution(board, k) {
    var answer = 0;
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[i].length && i + j < k; j++) {
            answer += board[i][j];
        }
    }
    return answer;
}
