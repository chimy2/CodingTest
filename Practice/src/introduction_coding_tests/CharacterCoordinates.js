function solution(keyinput, board) {
    var answer = [0, 0];
    const d = { left: [-1, 0], right: [1, 0], up: [0, 1], down: [0, -1] };
    for (let i of keyinput) {
        let x = answer[0] + d[i][0];
        let y = answer[1] + d[i][1];
        if (Math.abs(x) <= board[0] / 2 && Math.abs(y) <= board[1] / 2) {
            answer[0] = x;
            answer[1] = y;
        }
    }
    return answer;
}
