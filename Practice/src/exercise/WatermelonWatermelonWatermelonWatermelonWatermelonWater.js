function solution(n) {
    return '수박'.repeat((n + 1) / 2).slice(0, n);
    // var answer = '';
    // for (var i = 0; i < n; i++) {
    //     if (i % 2 === 1) {
    //         answer += '박';
    //     } else {
    //         answer += '수';
    //     }
    // }
    // return answer;
}
