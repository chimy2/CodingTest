function solution(X, Y) {
    let answer = '';
    const countX = Array(10).fill(0);
    const countY = Array(10).fill(0);
    [...X].forEach((v) => countX[v]++);
    [...Y].forEach((v) => countY[v]++);
    for (let i = 9; i >= 0; i--) {
        answer += i.toString().repeat(Math.min(countX[i], countY[i]));
    }
    return answer.length > 0 ? (answer[0] == 0 ? '0' : answer) : '-1';
}
