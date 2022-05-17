function solution(strArr) {
    var answer = Array(30).fill(0);
    for (let s of strArr) {
        answer[s.length - 1]++;
    }
    return answer.reduce((p, c) => (p > c ? p : c));
    // return Math.max(...answer);
}
