function solution(num_list, n) {
    var answer = [];
    for (let i = 0; i < num_list.length / n; i++) {
        answer.push(Array(n).fill(0));
    }
    for (let i = 0; i < num_list.length; i++) {
        answer[~~(i / n)][i % n] = num_list[i];
    }
    return answer;
}
