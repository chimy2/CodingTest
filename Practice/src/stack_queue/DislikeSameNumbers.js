function solution(arr) {
    return arr.filter((_, i) => arr[i - 1] != arr[i]);
    // var answer = [arr[0]];
    // for (var i = 1; i < arr.length; i++) {
    //     if (arr[i] !== arr[i - 1]) {
    //         answer.push(arr[i]);
    //     }
    // }
    // return answer;
}
