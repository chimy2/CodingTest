function solution(num_list) {
    return num_list
        .map((v) => v.toString(2).length - 1)
        .reduce((ac, c) => ac + c);
}
