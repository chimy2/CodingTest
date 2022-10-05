function solution(n) {
    return Array(n)
        .fill(1)
        .map((v, i) => v + i)
        .filter((i) => n % i == 0)
        .reduce((ac, c) => ac + c);

    // var answer = 0;
    // let i;
    // for (i = 1; i <= Math.sqrt(n); i++) {
    //     if (!(n % i)) {
    //         answer += i + n / i;
    //     }
    // }
    // i--;
    // return i === n / i ? answer - i : answer;

    // var answer = 0;
    // for (var i = 0; i < n + 1; i++) {
    //     if (n % i === 0) {
    //         answer += i;
    //     }
    // }
    // return answer;
}
