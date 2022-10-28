function solution(answers) {
    const arr = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
    ];
    const score = [0, 0, 0];
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < answers.length; j++) {
            if (arr[i][j % arr[i].length] == answers[j]) score[i]++;
        }
    }
    console.log(score);
    return [1, 2, 3].filter((i) => score[i - 1] == Math.max(...score));
}
