function solution(age) {
    var answer = '';
    for (let i = age; i > 0; i = parseInt(i / 10)) {
        answer = String.fromCharCode((i % 10) + 97) + answer;
    }
    return answer;
    // return age
    //     .toString()
    //     .split('')
    //     .map((v) => 'abcdefghij'[v])
    //     .join('');
}
