function solution(s) {
    return s
        .replaceAll(/-?\d+ Z ?/g, '')
        .split(' ')
        .filter((c) => c != '')
        .reduce((ac, c) => ac + Number(c), 0);
}
