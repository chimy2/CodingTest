function solution(chicken) {
    var answer = 0;
    while (chicken > 9) {
        answer += ~~(chicken / 10);
        chicken = ~~(chicken / 10) + (chicken % 10);
    }
    return answer;
}
