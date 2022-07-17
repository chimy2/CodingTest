function solution(balls, share) {
    var answer = 1;
    const arr = Array(31).fill(0);
    for (let i = share + 1; i <= balls; i++) {
        let temp = i;
        for (let j = 2; temp > 1; ) {
            if (temp % j == 0) {
                arr[j]++;
                temp /= j;
            } else {
                j++;
            }
        }
    }

    for (let i = balls - share; i > 1; i--) {
        let temp = i;
        for (let j = 2; temp > 1; ) {
            if (temp % j == 0) {
                arr[j]--;
                temp /= j;
            } else {
                j++;
            }
        }
    }
    for (let i = arr.length - 1; i > 1; i--) {
        if (arr[i] > 0) answer *= Math.pow(i, arr[i]);
        else if (arr[i] < 0) answer /= Math.pow(i, -arr[i]);
    }
    return answer;
}
