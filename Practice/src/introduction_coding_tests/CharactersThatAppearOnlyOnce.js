function solution(s) {
    return s
        .split('')
        .filter((v) => s.indexOf(v) == s.lastIndexOf(v))
        .sort()
        .join('');
    // return [...s]
    //     .filter((c) => s.match(new RegExp(c, 'g')).length == 1)
    //     .sort()
    //     .join('');
}
