function solution(a, d, included) {
    var answer = 0;
    for(let i in included){
        if(included[i]) answer += a + d * i;
    }
    return answer;
    // reduce 버전
    // return included.reduce((ac, c, i) => (c ? ac + a + d * i : ac), 0);
}