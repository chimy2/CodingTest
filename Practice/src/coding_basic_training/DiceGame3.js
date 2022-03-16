function solution(a, b, c, d) {
    var answer = 0;
    var [a, b, c, d] = [a, b, c, d].sort();
    if (a == d) {
        answer = 1111 * a;
    } else if (b == c && (a == b || c == d)) {
        answer = pow(a == b ? 10 * a + d : 10 * d + a, 2);
    } else if (a == b && c == d) {
        answer = (a + c) * Math.abs(a - c);
    } else if (a == b) {
        answer = c * d;
    } else if (b == c) {
        answer = a * d;
    } else if (c == d) {
        answer = a * b;
    } else {
        answer = Math.min(a, b, c, d);
    }
    return answer;
}
