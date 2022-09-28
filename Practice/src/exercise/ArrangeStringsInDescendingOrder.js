function solution(s) {
    return [...s].sort().reverse().join('');
    // return s
    //     .split('')
    //     .sort((a, b) => (a < b ? 1 : -1))
    //     .join('');
}
