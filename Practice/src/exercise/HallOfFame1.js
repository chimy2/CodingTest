function solution(k, score) {
    const answer = Array(score.length).fill(0);
    const arr = Array(k).fill(0);
    for (let i = 0; i < score.length; i++) {
        let min = score[i];
        for (let j = 0; j < k; j++) {
            if (min > arr[j]) {
                let temp = arr[j];
                arr[j] = min;
                min = temp;
            }
        }
        answer[i] = arr[Math.min(i, k - 1)];
    }
    return answer;
}
