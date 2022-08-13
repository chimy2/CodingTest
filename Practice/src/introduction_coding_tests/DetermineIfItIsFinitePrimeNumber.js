function solution(a, b) {
    var answer = 2;
    for (let i = 2; i <= 5; ) {
        if (b % i == 0) {
            b /= i;
        } else {
            i += 3;
        }
    }
    if (a % b == 0) {
        answer = 1;
    }
    return answer;
}
