function solution(arr) {
    var answer = [];
    for (let i of arr) {
        if (answer.length == 0 || answer[answer.length - 1] != i) {
            answer.push(i);
        } else {
            answer.pop();
            // answer.splice(-1);
        }
    }
    return answer.length > 0 ? answer : [-1];
}
