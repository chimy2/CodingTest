function solution(rsp) {
    var answer = '';
    for (let i of rsp) {
        switch (i) {
            case '2':
                answer += 0;
                break;
            case '0':
                answer += 5;
                break;
            case '5':
                answer += 2;
        }
    }
    return answer;
}
