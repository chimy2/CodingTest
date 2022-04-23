function solution(num_list) {
    return num_list.length > 10
        ? num_list.reduce((ac, c) => ac + c)
        : num_list.reduce((ac, c) => ac * c);
}
