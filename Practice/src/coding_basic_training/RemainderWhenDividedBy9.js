function solution(number) {
    return number.split("").reduce((ac, c) => Number(ac) + Number(c)) % 9;
}
