function solution(my_string) {
    var answer = 0;
    return my_string
        .split(/\D/g)
        .filter((i) => i != '')
        .reduce((ac, c) => ac + parseInt(c), 0);
}
