function solution(a, b) {
    var answer = 0;
    if (a % 2 == 1 && b % 2 == 1) {
        answer = a * a + b * b;
    } else if ((a % 2 == 1) ^ (b % 2 == 1)) {
        answer = a * (a + b);
    } else {
        answer = Math.abs(a - b);
    }
    return answer;
}
