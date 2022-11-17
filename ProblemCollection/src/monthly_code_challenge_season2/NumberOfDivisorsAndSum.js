function solution(left, right) {
    var answer = 0;
    for (let i = left; i <= right; i++) {
        let count = 0;
        for (let j = 1; j <= Math.sqrt(i); j++) {
            if (j * j == i) {
                count++;
            } else if (i % j == 0) {
                count += 2;
            }
        }
        answer += count % 2 == 0 ? i : -i;
    }
    // for (let i = left; i <= right; i++) {
    //     if (Number.isInteger(Math.sqrt(i))) {
    //         answer -= i;
    //     } else {
    //         answer += i;
    //     }
    // }
    return answer;
}
