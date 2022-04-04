function solution(arr, idx) {
    var answer = -1;
    for (let i = idx; i < arr.length; i++) {
        if (arr[i]) {
            answer = i;
            break;
        }
    }
    return answer;
}
