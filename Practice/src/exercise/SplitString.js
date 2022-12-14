function solution(s) {
    var answer = 0;
    let count = 0;
    for (let i = 0, j = 0; i < s.length; i++) {
        if (i == j) {
            count = 1;
            answer++;
        } else if (s[i] == s[j]) {
            count++;
        } else {
            count--;
        }
        if (count == 0) {
            j = i + 1;
        }
    }
    return answer;
}
