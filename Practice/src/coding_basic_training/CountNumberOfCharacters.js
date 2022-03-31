function solution(my_string) {
    var answer = Array(52).fill(0);
    for (let c of my_string.split('')) {
        let a = c.charCodeAt(0);
        answer[a - 'A'.charCodeAt(0) - (a >= 'a'.charCodeAt(0) ? 6 : 0)]++;
    }
    return answer;
}
