function solution(rank, attendance) {
    var answer = 0;
    var num = 1;
    for (let i = 0; i < 3; i++) {
        while (true) {
            let j = rank.indexOf(num);
            num++;
            if (attendance[j]) {
                answer += Math.pow(10, 4 - i * 2) * j;
                break;
            }
        }
    }
    return answer;
}
