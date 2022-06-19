function solution(numer1, denom1, numer2, denom2) {
    var answer = [numer1 * denom2 + numer2 * denom1, denom1 * denom2];
    for (let i = 2; i <= answer[0] && i <= answer[1]; ) {
        if (answer[0] % i == 0 && answer[1] % i == 0) {
            answer[0] /= i;
            answer[1] /= i;
        } else {
            i++;
        }
    }
    return answer;
}
