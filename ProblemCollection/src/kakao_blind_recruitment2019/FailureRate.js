function solution(N, stages) {
    const answer = Array(N)
        .fill(1)
        .map((v, i) => v + i);
    const arr = Array(N + 1).fill(0);
    for (let i of stages) arr[i - 1]++;
    let count = arr[N];
    for (let i = N - 1; i >= 0; i--) {
        count += arr[i];
        arr[i] /= count;
    }
    return answer.sort((a, b) => arr[b - 1] - arr[a - 1]);
}
