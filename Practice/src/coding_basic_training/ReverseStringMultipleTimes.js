function solution(my_string, queries) {
    let answer = my_string.split("");
    for (let [x, y] of queries) {
        for (let i = x; i < x + (y - x + 1) / 2; i++) {
            let temp = answer[i];
            answer[i] = answer[y - i + x];
            answer[y - i + x] = temp;
        }
    }
    return answer.join("");
}
