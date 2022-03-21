function solution(intStrs, k, s, l) {
    var answer = [];
    for (let str of intStrs) {
        let result = Number(str.substring(s, s + l));
        if (result > k) answer.push(result);
    }
    return answer;
}
