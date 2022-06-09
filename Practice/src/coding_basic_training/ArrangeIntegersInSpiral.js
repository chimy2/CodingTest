function solution(n) {
    var answer = [];
    for (let i = 0; i < n; i++) {
        answer.push(Array(n));
    }
    for (let v = 1, l = 0, r = n - 1, u = 0, d = n - 1; l <= r && u <= d; ) {
        for (let i = l; i <= r; i++) {
            answer[u][i] = v++;
        }
        u++;
        for (let i = u; i <= d; i++) {
            answer[i][r] = v++;
        }
        r--;
        for (let i = r; i >= l; i--) {
            answer[d][i] = v++;
        }
        d--;
        for (let i = d; i >= u; i--) {
            answer[i][l] = v++;
        }
        l++;
    }
    return answer;
}
