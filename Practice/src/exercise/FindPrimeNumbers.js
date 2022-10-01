function solution(n) {
    var answer = 0;
    const arr = Array(n + 1).fill(true);
    for (let i = 2; i <= n; i++) {
        if (arr[i]) {
            answer++;
            for (let j = i * i; j <= n; j *= i) {
                arr[j] = false;
            }
        }
    }
    return answer;
}
