function solution(board) {
    var answer = 0;
    const arr = [];
    for (let i = 0; i < board.length + 2; i++) {
        arr.push(Array(board.length + 2).fill(false));
    }
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[0].length; j++) {
            if (board[i][j] == 1) {
                for (let k = 0; k < 3; k++) {
                    for (let l = 0; l < 3; l++) {
                        arr[k + i][l + j] = true;
                    }
                }
            }
        }
    }
    for (let i = 1; i <= board.length; i++) {
        for (let j = 1; j <= board.length; j++) {
            if (!arr[i][j]) answer++;
        }
    }
    return answer;
}
