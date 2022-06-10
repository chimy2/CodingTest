function solution(arr) {
    var answer = 1;
    for (let i = 0, checked = true; i < arr.length && checked; i++) {
        for (let j = i + 1; j < arr.length && checked; j++) {
            if (arr[i][j] != arr[j][i]) {
                answer = 0;
                checked = false;
            }
        }
    }
    return answer;
}
