function solution(k, m, score) {
    var answer = 0;
    const arr = Array(k + 1).fill(0);
    for (let i of score) {
        arr[i]++;
    }
    for (let i = k; i > 0; i--) {
        answer += parseInt(arr[i] / m) * i * m;
        arr[i - 1] += arr[i] % m;
    }
    return answer;
}
