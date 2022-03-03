function solution(a, b, c) {
    var answer = 1;
    // var set = new Set([a, b, c]);
    var set = new Set();
    set.add(a);
    set.add(b);
    set.add(c);
    for (let i = 1; i <= 4 - set.size; i++) {
        answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
    }
    return answer;
}
