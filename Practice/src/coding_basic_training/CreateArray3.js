function solution(arr, intervals) {
    var answer = [];
    for (let [a, b] of intervals) {
        for (let i = a; i <= b; i++) {
            answer.push(arr[i]);
        }
    }
    return answer;
    // return [...arr.slice(a, b + 1), ...arr.slice(c, d + 1)];
}
