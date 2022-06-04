function solution(order) {
    var answer = 0;
    for (let i of order) {
        answer += i.includes('cafelatte') ? 5000 : 4500;
    }
    return answer;
}
