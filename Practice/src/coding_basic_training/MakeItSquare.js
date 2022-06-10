function solution(arr) {
    var answer = [];
    var max = Math.max(arr.length, arr[0].length);
    for (let i = 0; i < max; i++) {
        let temp = Array(max).fill(0);
        for (let j = 0; i < arr.length && j < arr[i].length; j++) {
            temp[j] = arr[i][j];
        }
        answer.push(temp);
    }
    return answer;
}
