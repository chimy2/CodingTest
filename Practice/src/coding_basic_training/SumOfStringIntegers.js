function solution(num_str) {
    return num_str
        .split('')
        .map((i) => parseInt(i))
        .reduce((ac, c) => ac + c);
    // return [...num_str].reduce((acc, curr) => acc + Number(curr), 0);
}
