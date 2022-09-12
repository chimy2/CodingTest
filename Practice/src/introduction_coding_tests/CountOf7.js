function solution(array) {
    return [...array.join('')].filter((i) => i == 7).length;
    // return array.join('').split('7').length - 1;
}
