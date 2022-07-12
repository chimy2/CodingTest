function solution(emergency) {
    const arr = Array(100).fill(false);
    for (let i of emergency) arr[i - 1] = true;
    for (let i = 0; i < emergency.length; i++) {
        let count = 1;
        for (let j = arr.length - 1; j >= emergency[i]; j--) {
            if (arr[j]) count++;
        }
        emergency[i] = count;
    }
    return emergency;
}
