function solution(lines) {
    var answer = 0;
    const arr = Array(201).fill(0);
    for (let [x, y] of lines) {
        for (let i = x + 100; i < y + 100; i++) {
            arr[i]++;
        }
    }
    for (let i of arr) {
        if (i > 1) answer++;
    }
    return answer;
}
