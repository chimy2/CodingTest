function solution(n, m) {
    var [a, b] = [n, m];
    var answer = [1, 1];
    while (m != 0) {
        [n, m] = [m, n % m];
    }
    answer[0] = n;
    answer[1] = (a * b) / n;
    return answer;
    for (var nm = n * m, r; (r = n % m); n = m, m = r);
    return [m, nm / m];
}
