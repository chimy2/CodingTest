function solution(arr) {
    let answer = 0;
    for (let i = 0; i < arr.length; i++) {
        let temp = 0;
        while (
            (arr[i] % 2 == 0 && arr[i] >= 50) ||
            (arr[i] % 2 == 1 && arr[i] < 50)
        ) {
            if (arr[i] < 50) {
                arr[i] = arr[i] * 2 + 1;
            } else {
                arr[i] /= 2;
            }
            temp++;
        }
        answer = Math.max(answer, temp);
    }
    return answer;
}
