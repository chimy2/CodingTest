function solution(quiz) {
    return quiz.map((v) => {
        const arr = v.split(' ');
        const num = Number(arr[0]) + Number(arr[2]) * (arr[1] == '+' ? 1 : -1);
        return num == Number(arr[4]) ? 'O' : 'X';
    });
}
