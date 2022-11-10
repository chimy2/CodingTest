function solution(board, moves) {
    let answer = 0;
    const arr = [];
    for (let y of moves) {
        for (let x = 0; x < board.length; x++) {
            if (board[x][y - 1] > 0) {
                if (arr.length > 0 && board[x][y - 1] == arr[arr.length - 1]) {
                    arr.pop();
                    answer += 2;
                } else {
                    arr.push(board[x][y - 1]);
                }
                board[x][y - 1] = 0;
                break;
            }
        }
    }
    return answer;
}
