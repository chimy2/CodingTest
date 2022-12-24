function solution(n, m, section) {
    var answer = 0;
    for (let i = 0, last = 0; i < section.length; i++) {
        if (last <= section[i]) {
            answer++;
            last = section[i] + m;
        }
    }
    return answer;
}
