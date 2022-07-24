function solution(n) {
    var answer = 0;
    for (let i = 4; i <= n; i++) {
        let temp = i;
        let count = 0;
        for (let j = 2; j <= temp && count < 2; ) {
            if (temp % j == 0) {
                temp /= j;
                count++;
            } else {
                j++;
            }
        }
        if (count == 2) answer++;
    }
    return answer;
}
