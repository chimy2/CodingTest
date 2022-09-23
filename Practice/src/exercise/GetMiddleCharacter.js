function solution(s) {
    return s.slice((s.length - 1) / 2, s.length / 2 + 1);
    // var answer = '';
    // var th = s.length;
    // var answerArray = s.split('');
    // if (th % 2 === 0) {
    //     answer = answerArray[th / 2 - 1] + answerArray[Math.floor(th / 2)];
    // } else {
    //     answer = answerArray[Math.floor(th / 2)];
    // }
    // return answer;
}
