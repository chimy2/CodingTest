function solution(n) {
    var answer = [];
    for (let i = 2; i <= n; ) {
        if (n % i == 0) {
            if (!answer.includes(i)) {
                answer.push(i);
            }
            n /= i;
        } else {
            i++;
        }
    }
    return answer;
}
