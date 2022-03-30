function solution(q, r, code) {
    return code.split("").reduce((ac, v, i) => (ac += i % q == r ? v : ""), "");
}
