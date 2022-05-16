function solution(arr1, arr2) {
    var answer = 0;
    if (arr1.length > arr2.length) {
        answer = 1;
    } else if (arr1.length < arr2.length) {
        answer = -1;
    } else {
        let a = arr1.reduce((a, c) => a + c);
        let b = arr2.reduce((a, c) => a + c);
        if (a > b) answer = 1;
        else if (a < b) answer = -1;
    }
    return answer;
}
