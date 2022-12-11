function solution(number, limit, power) {
    const arr = Array(number).fill(1);
    for (let i = 2; i <= number; i++) {
        for (j = 1; j * i <= number; j++) {
            arr[i * j - 1]++;
        }
    }
    return arr.reduce((p, c) => (limit < c ? p + power : p + c));
}
