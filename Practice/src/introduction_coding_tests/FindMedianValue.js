function solution(array) {
    return array.sort((i, j) => i - j)[parseInt(array.length / 2)];
}
